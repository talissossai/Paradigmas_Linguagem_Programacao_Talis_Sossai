# Paradigmas de Linguagens de Programação: Atividade Aula 04

[← voltar ao índice do repositório](../README.md)

Aula exploratória prática sobre **análise léxica e análise sintática**, baseada
no capítulo 4 de Sebesta.

A proposta está dividida em **5 estações práticas**, tornando visíveis partes
que normalmente ficam escondidas dentro de um compilador.

## Estrutura do repositório

```text
.
├── README.md
├── 01-lexemas-tokens/Main.java
├── 02-classes-reservadas/Main.java
├── 03-diagnosticos/Main.java
├── 04-parser-descendente/Main.java
└── 05-parser-ascendente/Main.java
```

---

## Estação 1: de caracteres a lexemas e tokens

**Objetivo:** observar como uma linha de código é dividida em unidades com
significado.

Entrada utilizada:

```java
resultado = somaAnterior - valor / 1000;
```

Saída esperada:

```text
LEXEMA             TOKEN
----------------------------------------
resultado          IDENTIFICADOR
=                  ATRIBUICAO
somaAnterior       IDENTIFICADOR
-                  SUBTRACAO
valor              IDENTIFICADOR
/                  DIVISAO
1000               INTEIRO
;                  PONTO_E_VIRGULA
```

### Conclusão

**Lexema** é o texto encontrado na entrada. **Token** é a categoria atribuída
a esse texto.

Por exemplo, `resultado` é o lexema e `IDENTIFICADOR` é seu token.

---

## Estação 2: o que o analisador léxico reconhece

**Objetivo:** comparar espaços, palavras reservadas, identificadores e
caracteres inválidos.

Palavras reservadas usadas:

```text
int
if
else
while
return
```

Entrada:

```java
int nota_talis = 10;
```

Saída esperada:

```text
LEXEMA          TOKEN
-----------------------------------
int             PALAVRA_RESERVADA
nota_talis      IDENTIFICADOR
=               ATRIBUICAO
10              INTEIRO
;               PONTO_E_VIRGULA
```

Teste de erro:

```java
int valor# = 1;
```

O `#` é classificado como:

```text
ERRO_LEXICO
```

### Observações

- Espaços extras não mudam os tokens relevantes;
- palavras reservadas são consultadas separadamente;
- `inteiro` não é a mesma coisa que `int`;
- caracteres não reconhecidos podem causar erro léxico.

---

## Estação 3: quando o compilador encontra erros

O código da estação deve ser comparado com uma versão propositalmente inválida.

Exemplos de erros observados:

```text
';' expected
')' expected
unclosed string literal
```

Os reparos envolvem:

1. acrescentar um ponto e vírgula;
2. fechar o parêntese da condição;
3. fechar corretamente a string.

Depois dos reparos:

```text
Programa corrigido!
Resultado: 30
```

### Classificação

| Erro | Natureza |
|---|---|
| String sem fechamento | relacionado à formação léxica |
| Ponto e vírgula ausente | erro sintático |
| Parêntese não fechado | erro sintático |

---

## Estação 4: parser descendente recursivo

O parser representa regras por métodos como:

```text
expr
term
factor
```

Entrada:

```text
(2 + 3) * 4
```

A análise começa por `expr`, desce para `term` e depois para `factor`.

Saída final:

```text
ENTRADA ACEITA
RESULTADO: 20
```

### Recursão à esquerda

Uma regra como:

```text
expr -> expr + term
```

não funciona diretamente em um parser descendente simples, pois chama a si
mesma antes de consumir entrada.

Por isso a implementação precisa de uma forma equivalente que consuma entrada
antes de repetir a regra.

### Conclusão

O parser descendente parte de uma regra mais geral e vai para elementos menores.

---

## Estação 5: parser ascendente

Nesta etapa a entrada é transferida para uma pilha e reduzida.

Gramática:

```text
E -> E + T
E -> T
T -> T * F
T -> F
F -> id
```

### Ações

`SHIFT` coloca um símbolo da entrada na pilha.

`REDUCE` substitui uma sequência pela parte esquerda de uma produção.

`ACCEPT` indica que a entrada foi reconhecida.

Exemplo:

```text
ENTRADA: id + id * id
```

O processo faz vários `SHIFT` e `REDUCE` até chegar a:

```text
E
```

e então:

```text
ACCEPT
```

---

## Comparação

| Característica | Descendente | Ascendente |
|---|---|---|
| **Direção** | do símbolo inicial para os componentes | dos tokens para o símbolo inicial |
| **Mecanismo** | chamadas recursivas | pilha |
| **Principal ideia** | expandir regras | deslocar e reduzir |
| **Recursão à esquerda** | problemática | aceita naturalmente |

## Síntese

O analisador léxico transforma caracteres em tokens.

O analisador sintático usa os tokens para verificar a estrutura da sentença.

O parser descendente constrói a análise partindo das regras mais gerais, enquanto
o ascendente reconstrói a estrutura a partir da entrada.

## Referência

SEBESTA, R. W. *Conceitos de Linguagens de Programação*. Capítulo 4.
