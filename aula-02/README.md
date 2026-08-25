# Paradigmas de Linguagens de Programação: Atividade Aula 02

[← voltar ao índice do repositório](../README.md)

Lista de exercícios: **Evolução das Principais Linguagens de Programação**, com
base no capítulo 2 de Sebesta (*Concepts of Programming Languages*).

As questões abaixo são autorais e foram organizadas para cobrir os principais
pontos históricos do capítulo.

## Estrutura do repositório

```text
.
└── README.md     # enunciado + respostas
```

---

## 1. Genealogia das linguagens

**Enunciado:** A genealogia das linguagens não é uma escada de progresso.
Explique essa afirmação e apresente dois fatores históricos que fazem uma
linguagem influenciar outra sem necessariamente substituí-la.

**Resposta:** A história das linguagens pode ser vista como uma árvore porque
ideias são reaproveitadas e várias linguagens continuam existindo ao mesmo
tempo. Uma linguagem nova não necessariamente torna uma antiga inútil.

Dois fatores explicam isso:

1. **Especialização por domínio.** Fortran, por exemplo, foi projetada para
   cálculo científico; COBOL para processamento comercial. Uma linguagem nova
   pode ser melhor em outros contextos e ainda não ser a melhor naquele domínio.
2. **Custo da base instalada.** Sistemas antigos acumulam código, ferramentas,
   conhecimento e profissionais. Reescrever tudo pode custar mais do que manter
   a linguagem original.

*Referência: Sebesta, capítulo 2.*

---

## 2. Plankalkül

**Enunciado:** Plankalkül não teve implementação prática na época em que foi
projetada. Por que ela continua importante historicamente? Cite recursos que
anteciparam ideias usadas depois.

**Resposta:** Plankalkül, criada por Konrad Zuse, é importante porque mostrou que
o projeto de uma linguagem poderia ser pensado em nível conceitual antes de
existirem as ferramentas necessárias para implementá-la.

Entre os recursos antecipados estavam:

- estruturas de dados organizadas;
- arrays;
- estruturas hierárquicas;
- mecanismos semelhantes a asserções.

A importância histórica está justamente em várias dessas ideias aparecerem,
de formas diferentes, nas linguagens posteriores.

*Referência: Sebesta, capítulo 2.*

---

## 3. Fortran e código de máquina

**Enunciado:** Explique por que Fortran precisou convencer programadores de que
um compilador poderia produzir código suficientemente eficiente.

**Resposta:** Na década de 1950, computadores eram caros e o tempo de máquina
era muito valioso. Muitos programadores acreditavam que escrever diretamente em
código de máquina seria mais eficiente.

O projeto do Fortran investiu em otimizações do compilador para diminuir essa
diferença. Assim, o programador economizava tempo sem gerar uma perda de
desempenho grande demais.

A adoção de linguagens de alto nível aconteceu justamente porque o custo total
do trabalho passou a considerar não somente o tempo de execução, mas também o
tempo de programação e manutenção.

*Referência: Sebesta, capítulo 2.*

---

## 4. Lisp e Fortran

**Enunciado:** Compare Fortran e Lisp considerando domínio, dados e estilo de
programação.

**Resposta:**

| Aspecto | Fortran | Lisp |
|---|---|---|
| **Domínio inicial** | Computação científica | IA e manipulação simbólica |
| **Estruturas** | Números, vetores e matrizes | Listas e símbolos |
| **Estilo** | Imperativo / iterativo | Funcional / recursivo |

Fortran foi criada para realizar cálculos numéricos de forma eficiente.
Lisp foi pensada para trabalhar com símbolos e estruturas que podiam representar
os próprios programas.

*Referência: Sebesta, capítulo 2.*

---

## 5. ALGOL 60

**Enunciado:** Cite três contribuições de ALGOL 60 que influenciaram linguagens
posteriores e explique por que uma linguagem pode ser influente sem dominar o
mercado.

**Resposta:**

1. **BNF:** ajudou a popularizar uma forma formal de descrever gramáticas;
2. **Estrutura de blocos:** influenciou mecanismos de escopo léxico;
3. **Estruturas de controle:** contribuiu para a evolução da programação
   estruturada.

Uma linguagem pode ter pouca adoção comercial e ainda ser extremamente
influente caso seus conceitos sejam reutilizados por outras linguagens.

*Referência: Sebesta, capítulo 2.*

---

## 6. COBOL e FLOW-MATIC

**Enunciado:** Explique como COBOL foi influenciada pelo processamento comercial
e pela experiência de FLOW-MATIC.

**Resposta:** COBOL foi pensada para aplicações comerciais, portanto precisava
representar informações organizadas em registros e possuir comandos relativamente
legíveis para pessoas da área de negócios.

FLOW-MATIC, associada a Grace Hopper, já apresentava uma preocupação semelhante
com linguagem próxima do inglês e processamento de arquivos.

COBOL aproveitou essas ideias e buscou padronização entre fabricantes e
sistemas diferentes.

*Referência: Sebesta, capítulo 2.*

---

## 7. Ada

**Enunciado:** Relacione as características de Ada com sistemas críticos.

**Resposta:** Ada foi desenvolvida com grande preocupação com confiabilidade e
sistemas embarcados.

Algumas características importantes são:

- **tipagem forte**, que permite detectar vários problemas antecipadamente;
- **pacotes**, que ajudam na modularização;
- **tratamento de exceções**, útil em situações de erro;
- **concorrência**, necessária em sistemas que trabalham com várias atividades
  ao mesmo tempo.

Essas características combinam com aplicações em que erros podem ter consequências
graves.

*Referência: Sebesta, capítulo 2.*

---

## 8. Smalltalk, C++ e Java

**Enunciado:** Compare o uso da orientação a objetos em Smalltalk, C++ e Java.

**Resposta:**

- **Smalltalk:** possui uma visão muito mais abrangente de orientação a objetos,
  tratando os elementos da linguagem como objetos.
- **C++:** acrescentou recursos de orientação a objetos ao C, mantendo grande
  compatibilidade com a linguagem original.
- **Java:** adotou orientação a objetos com tipagem estática e uma máquina
  virtual para facilitar a portabilidade.

C++ prioriza compatibilidade e controle; Java prioriza abstração, segurança e
portabilidade; Smalltalk leva o conceito de objetos a uma abordagem ainda mais
pura.

*Referência: Sebesta, capítulo 2.*

---

## 9. Perl, JavaScript, PHP, Python, Ruby e Lua

**Enunciado:** Compare as seis linguagens em relação ao uso inicial e às
características que as diferenciam.

**Resposta:**

| Linguagem | Uso / característica de destaque |
|---|---|
| **Perl** | Texto, administração de sistemas e CGI |
| **JavaScript** | Scripts e aplicações no navegador |
| **PHP** | Geração dinâmica de páginas no servidor |
| **Python** | Uso geral, automação e ciência de dados |
| **Ruby** | Uso geral e desenvolvimento Web |
| **Lua** | Scripting embutido em aplicações |

Apesar de serem frequentemente chamadas de linguagens de scripting, possuem
histórias diferentes, estruturas próprias e estratégias de implementação
diferentes.

*Referência: Sebesta, capítulo 2.*

---

## 10. Escolha de linguagens por domínio

**Enunciado:** Uma equipe precisa escolher tecnologias para computação
científica, regras declarativas, Web interativa e firmware restrito. Proponha
linguagens adequadas e justifique.

**Resposta:**

- **Computação científica:** Fortran ou Python com bibliotecas numéricas;
- **Regras declarativas:** Prolog;
- **Web interativa:** JavaScript;
- **Firmware:** C ou Ada, dependendo do nível de criticidade.

Os principais trade-offs seriam:

1. **Desempenho x abstração:** linguagens de baixo nível oferecem mais controle,
   enquanto linguagens de alto nível costumam aumentar a produtividade.
2. **Controle x segurança:** C oferece grande controle de memória, enquanto
   linguagens mais restritivas podem oferecer mais verificações automáticas.

*Referência: Sebesta, capítulo 2.*

---

## Referências

- SEBESTA, Robert W. *Concepts of Programming Languages*. Capítulo 2.
- Material de apoio da disciplina.
