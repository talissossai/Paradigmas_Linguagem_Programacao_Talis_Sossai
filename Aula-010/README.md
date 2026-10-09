# Aula 010 – Laboratório de Concorrência

Atividade da disciplina **Paradigmas de Linguagens de Programação** (Engenharia de Software).
O objetivo foi provocar, de propósito, os erros clássicos de programas concorrentes, observar cada um e registrar o que aconteceu.

**Aluno:** Talis Sossai
**Referência:** Sebesta, R. W. *Conceitos de Linguagens de Programação*, 11ª ed., Cap. 13 (p. 541-594).

## Conteúdo da pasta

| Arquivo | Descrição |
|---|---|
| `Aula010_Laboratorio_Concorrencia_respondido.html` | Atividade com todas as respostas, saídas dos programas e o relatório final. |

Para ver as respostas, basta abrir o arquivo HTML em qualquer navegador. O botão **Gerar relatório** monta a versão para entrega, e **Salvar em PDF** gera o PDF.

## Práticas realizadas

| Prática | Linguagem | Tema | O que foi observado |
|---|---|---|---|
| 1 | Java | Condição de corrida | Dois `contador++` simultâneos perdem somas: o resultado fica abaixo de 2.000.000 e muda a cada execução. Com n = 1000, o erro some. |
| 2 | Python | Figura 13.1 do Sebesta | São 20 ordens possíveis e 4 resultados diferentes (4, 6, 7 e 8). Só uma ordem dá o 8. |
| 3 | Java | Corrigindo a corrida | `synchronized` e `AtomicInteger` dão o valor certo. A versão correta é mais lenta que a sem sincronização. |
| 4 | Java | Impasse (deadlock) | Duas threads pegando X e Y em ordens opostas travam. Pegar na mesma ordem resolve. |
| 5 | Go | Canais e goroutines | 6 tarefas de 100 ms levam 600 ms com 1 trabalhador, 200 ms com 3 e 100 ms com 6. Canal sem espaço, sem receptor, gera deadlock. |
| 6 | Rust | O compilador como guarda | O compilador recusa o acesso compartilhado sem proteção. Com `Arc` e `Mutex`, o resultado é 400000. |
| 7 | JavaScript | Laço de eventos | Ordem de saída A, D, C, B. Um cálculo pesado atrasa o timer, porque só existe uma thread. |

## Principais conclusões

- **Condição de corrida:** quando várias tarefas alteram o mesmo dado sem controle, o resultado depende da ordem de execução e pode ser errado.
- **Sincronização tem custo:** garantir a exclusão mútua deixa o programa correto, mas mais lento.
- **Impasse:** sincronizar demais também dá problema. Pegar os recursos sempre na mesma ordem evita o travamento.
- **Cada linguagem resolve de um jeito:** o programador (Java), o projeto da linguagem com troca de mensagens (Go), o compilador (Rust) ou uma única thread com laço de eventos (JavaScript).

## Ambiente de execução

As saídas registradas vêm da execução dos códigos com Java 21, Python 3.12, Go 1.22, Rust 1.75 e Node.js 22. Os valores das Práticas 1 e 3 mudam a cada execução, o que faz parte do experimento.
