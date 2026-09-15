# Paradigmas de Linguagens de Programação: Aula 02

## Evolução das principais linguagens de programação

Atividade baseada nos conceitos históricos do capítulo 2 de Sebesta.

### 1. Genealogia das linguagens

A evolução das linguagens não acontece em uma sequência onde uma sempre elimina a anterior. Linguagens diferentes continuam sendo usadas porque resolvem problemas diferentes.

Dois fatores importantes são a **especialização por domínio** e o **custo de trocar sistemas antigos**.

### 2. Plankalkül

Plankalkül foi projetada por Konrad Zuse na década de 1940. Mesmo sem ter sido implementada de forma prática naquele período, é importante por antecipar ideias como estruturas de dados organizadas e arrays.

### 3. Fortran

Fortran foi criada principalmente para computação científica. Um desafio era mostrar que um compilador poderia gerar código eficiente o bastante para competir com código escrito manualmente.

Ela aumentou muito a produtividade do programador sem abrir mão do desempenho necessário.

### 4. Fortran x Lisp

| Aspecto | Fortran | Lisp |
|---|---|---|
| Foco inicial | Cálculo científico | Manipulação simbólica e IA |
| Dados | Números, vetores e matrizes | Listas e símbolos |
| Estilo | Imperativo | Funcional e recursivo |

### 5. ALGOL 60

ALGOL 60 teve grande influência mesmo sem dominar comercialmente.

Entre seus legados estão a descrição formal de gramáticas, o uso de blocos com escopo léxico e estruturas de controle que influenciaram a programação estruturada.

### 6. COBOL e FLOW-MATIC

COBOL foi desenvolvida pensando em processamento comercial e legibilidade. FLOW-MATIC, ligada a Grace Hopper, já tinha uma preocupação semelhante com comandos próximos da linguagem humana e com processamento de arquivos comerciais.

### 7. Ada

Ada foi projetada para sistemas em que confiabilidade é muito importante. Ela possui tipagem forte, modularidade, tratamento de exceções e recursos de concorrência, características úteis em sistemas embarcados e críticos.

### 8. Smalltalk, C++ e Java

**Smalltalk:** possui uma visão fortemente orientada a objetos.

**C++:** adicionou orientação a objetos ao C, preservando muitos conceitos da linguagem original.

**Java:** utiliza orientação a objetos, tipagem estática e JVM, favorecendo portabilidade.

### 9. Linguagens de scripting

| Linguagem | Destaque |
|---|---|
| Perl | Texto e administração de sistemas |
| JavaScript | Scripts em páginas Web |
| PHP | Aplicações Web no servidor |
| Python | Uso geral e automação |
| Ruby | Uso geral e Web |
| Lua | Scripting embutido |

Elas compartilham a ideia de scripting em diferentes contextos, mas têm históricos, estruturas e formas de execução diferentes.

### 10. Escolha por domínio

- **Computação científica:** Fortran ou Python com bibliotecas numéricas.
- **Regras declarativas:** Prolog.
- **Web interativa:** JavaScript.
- **Firmware:** C ou Ada, de acordo com as exigências.

Um trade-off comum é **desempenho x abstração**, enquanto outro é **controle x produtividade**.

## Referência

SEBESTA, Robert W. *Concepts of Programming Languages*. Capítulo 2.
