# Paradigmas de Linguagens de Programação: Atividade — Aula 00

[← voltar ao índice do repositório](../README.md)

Atividade prática da disciplina de **Paradigmas de Linguagens de Programação**.
Linguagem sorteada para o grupo: **Python**.

## Enunciado

1. Rodar o "Olá, mundo!" num compilador online;
2. Alterar o programa para receber um número e mostrar a tabuada desse número;
3. Descobrir: 1 vaga real + faixa salarial + paradigma(s) da linguagem;
4. Publicar no GitHub da disciplina.

## Estrutura do repositório

```text
.
├── README.md            # este documento (respostas da pesquisa)
└── src/
    ├── ola_mundo.py     # passo 1 — "Olá, mundo!"
    └── tabuada.py       # passo 2 — lê um número e imprime a tabuada
```

## Como executar

### No compilador online

1. Acesse um compilador online de Python, como <https://onecompiler.com/python>;
2. Cole o conteúdo de [src/tabuada.py](src/tabuada.py);
3. Informe um número na entrada padrão;
4. Clique em **Run**.

> O programa usa `input()`, então é necessário informar um valor na entrada padrão.

### Localmente

```bash
python3 src/ola_mundo.py
python3 src/tabuada.py
```

Não há dependências externas, apenas Python 3.

---

## Passo 1 - "Olá, mundo!"

```python
print("Olá, mundo!")
```

Saída:

```text
Olá, mundo!
```

Em Python não é necessário criar uma classe ou um método `main` somente para
imprimir uma mensagem.

## Passo 2 - Tabuada

Código completo de [src/tabuada.py](src/tabuada.py):

```python
numero = int(input("Digite um número inteiro: "))

print(f"\nTabuada do {numero}:")
for multiplicador in range(1, 11):
    print(f"{numero} x {multiplicador} = {numero * multiplicador}")
```

O programa lê o número, apresenta um título e repete a multiplicação de 1 até 10.
O segundo argumento de `range` é exclusivo, por isso `range(1, 11)` termina em 10.

Exemplo de execução com a entrada `7`:

```text
Digite um número inteiro: 7

Tabuada do 7:
7 x 1 = 7
7 x 2 = 14
7 x 3 = 21
7 x 4 = 28
7 x 5 = 35
7 x 6 = 42
7 x 7 = 49
7 x 8 = 56
7 x 9 = 63
7 x 10 = 70
```

> O programa considera uma entrada inteira. Texto como `abc` provoca erro de
> conversão no `int()`.

---

## Passo 3 - Pesquisa

### 3.1 Vaga real

| Campo | Informação |
|---|---|
| **Cargo** | Analista Sênior de Workload Automation (WLA) |
| **Empresa** | Bosch Group |
| **Local** | Campinas — SP |
| **Modelo** | Híbrido |
| **Área** | Automação / infraestrutura / TI |
| **Relação com Python** | Python aparece entre as tecnologias de scripting e automação |
| **Link** | [Bosch Group — SmartRecruiters](https://jobs.smartrecruiters.com/BoschGroup/) |

Python aparece nesse tipo de vaga principalmente para **automação e scripting**.
Além de Python, a descrição considera conhecimentos como Shell Script, PowerShell,
sistemas operacionais, bancos de dados e ambientes corporativos.

### 3.2 Faixa salarial

Nem toda vaga informa publicamente o salário. Por isso, a melhor forma de montar
uma faixa é comparar dados agregados de mercado.

| Senioridade | Faixa mensal aproximada |
|---|---:|
| **Júnior** | R$ 3.000 – R$ 6.000 |
| **Pleno** | R$ 6.000 – R$ 10.000 |
| **Sênior** | R$ 10.000 – R$ 16.000 |

Os valores variam bastante conforme região, empresa, especialização e regime de
contratação. Vagas ligadas a dados, IA, automação e empresas internacionais
podem apresentar valores maiores.

### 3.3 Paradigmas do Python

Python é uma linguagem **multiparadigma**.

| Paradigma | Como aparece em Python |
|---|---|
| **Imperativo / Procedural** | Sequência de comandos, `if`, `for`, `while`, atribuições e funções |
| **Orientado a objetos** | Classes, objetos, herança, métodos e polimorfismo |
| **Funcional** | Funções de primeira classe, `lambda`, `map`, `filter`, `reduce` e comprehensions |
| **Reflexivo / Metaprogramação** | Decoradores, `getattr`, `setattr`, `type` e metaclasses |

Python também possui **tipagem dinâmica e forte** e gerenciamento automático de
memória.

#### Qual paradigma usamos no exercício

A tabuada usa principalmente o paradigma **imperativo/procedural**, porque o
programa descreve passo a passo como produzir a saída usando um laço `for`.

O mesmo problema poderia ser resolvido usando funções e recursos funcionais,
ou organizado em classes, mostrando que Python permite mais de uma abordagem.

---

## Fontes

Vaga e mercado:

- [Bosch Group — vagas](https://jobs.smartrecruiters.com/BoschGroup/)
- [Python Brasil — vagas](https://python.dev.br/vagas/)
- [Glassdoor — salários de Desenvolvedor Python](https://www.glassdoor.com.br/Sal%C3%A1rios/)
- [Indeed Brasil — carreira em Python](https://br.indeed.com/)

Linguagem e paradigmas:

- [Python.org — documentação](https://www.python.org/doc/)
- [Python — Functional Programming HOWTO](https://docs.python.org/3/howto/functional.html)

> Valores salariais são estimativas de mercado e podem mudar conforme data e
> região da consulta.
