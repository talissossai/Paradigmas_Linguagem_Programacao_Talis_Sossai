# Paradigmas de Linguagens de Programação: Atividade Aula 03

[← voltar ao índice do repositório](../README.md)

Atividade: **Derivação de um código a partir da gramática de uma linguagem de
programação**.

O objetivo é pesquisar a gramática formal de uma linguagem real, selecionar as
regras necessárias e utilizá-las para derivar um pequeno programa válido.

## 1. Fonte da gramática

| Item | Valor |
|---|---|
| **Linguagem** | Python 3 |
| **Gramática sintática** | <https://docs.python.org/3/reference/grammar.html> |
| **Gramática léxica** | <https://docs.python.org/3/reference/lexical_analysis.html> |
| **Notação sintática** | PEG |
| **Notação léxica** | BNF modificada / EBNF |

### 1.1. Por que duas gramáticas?

A gramática léxica trata da formação dos tokens, enquanto a gramática sintática
trata da organização desses tokens em estruturas válidas.

Por exemplo, `total` pode ser reconhecido como um `NAME` e `14` como um `NUMBER`.
Depois disso, a gramática sintática utiliza esses elementos para formar uma
atribuição ou uma expressão.

### 1.2. Notação PEG

Alguns símbolos importantes:

```text
e1 e2       sequência
e1 | e2     escolha
( e )       agrupamento
[ e ]       opcional
e*          zero ou mais ocorrências
e+          uma ou mais ocorrências
&e          lookahead positivo
!e          lookahead negativo
```

`!e` e `&e` verificam a entrada sem consumi-la.

---

## 2. Produções selecionadas

A atividade usa uma versão reduzida das regras oficiais para facilitar a
visualização.

### 2.1. Estrutura inicial

```text
file -> statement
statement -> simple_stmt
simple_stmt -> assignment
```

### 2.2. Atribuição

```text
assignment -> NAME '=' expression
```

### 2.3. Expressões

```text
expression -> term
expression -> term '+' expression

term -> factor
term -> factor '*' term

factor -> NUMBER
```

Essa organização coloca `*` em um nível mais interno que `+`, explicando a
precedência da multiplicação.

---

## 3. Código escolhido

```python
total = 2 + 3 * 4
```

### 3.1. Tokens principais

```text
NAME('total')
'='
NUMBER('2')
'+'
NUMBER('3')
'*'
NUMBER('4')
NEWLINE
```

---

## 4. Derivação passo a passo

Começando pelo símbolo inicial:

```text
file
=> statement
=> simple_stmt
=> assignment
=> NAME '=' expression
=> total '=' expression
```

Agora a expressão:

```text
expression
=> term '+' expression
=> factor '+' expression
=> NUMBER '+' expression
=> 2 '+' expression
```

A segunda parte:

```text
expression
=> term
=> factor '*' term
=> NUMBER '*' term
=> 3 '*' factor
=> 3 '*' NUMBER
=> 3 '*' 4
```

Resultado completo:

```text
total = 2 + 3 * 4
```

---

## 5. Resultado

A expressão é interpretada como:

```text
2 + (3 * 4)
```

Logo:

```text
total = 14
```

A estrutura da gramática é o motivo de `3 * 4` ficar dentro de um nível mais
profundo que a soma.

---

## 6. Conclusão

A derivação mostra como um código aparentemente simples pode ser relacionado
diretamente a regras formais.

Os conceitos de terminal, não terminal e produção ajudam a entender como um
parser reconhece uma entrada e como a gramática determina a estrutura de uma
expressão.

## Referências

- Python Software Foundation. *The Python Language Reference*.
- <https://docs.python.org/3/reference/grammar.html>
- <https://docs.python.org/3/reference/lexical_analysis.html>
- PEP 617: <https://peps.python.org/pep-0617/>
