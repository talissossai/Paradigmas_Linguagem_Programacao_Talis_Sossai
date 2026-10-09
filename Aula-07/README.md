# Exercício 07 – Qual é a saída?

Exercício em dupla da disciplina **Paradigmas de Linguagens de Programação**.
Para cada trecho de código, o objetivo foi prever a saída e explicar o conceito de linguagem de programação por trás dela.

**Aluno:** Talis Sossai

## Conteúdo da pasta

| Arquivo | Descrição |
|---|---|
| `exercicio_07_saidas.pdf` | Os 6 trechos de código, com a saída e o conceito explicado em cada um. |

## Resumo

| # | Linguagem | Saída | Conceito |
|---|---|---|---|
| 1 | Python | `[1]` e `[1, 2]` | Argumento padrão mutável |
| 2 | Java | `0 5` | Passagem por valor (referência copiada) |
| 3 | Python | `[2, 2, 2]` | Closure / late binding |
| 4 | C | `3` | Variável local `static` |
| 5 | Rust | Erro de compilação (E0382) | Ownership / move |
| 6 | Python | `UnboundLocalError` | Escopo (regra LEGB) |

## Explicações

**1. Python: argumento padrão mutável.**
O valor padrão `[]` é criado uma única vez, quando a função é definida. Por isso todas as chamadas sem o segundo argumento usam a mesma lista, que vai acumulando os itens. Correção usual: usar `lista=None` e criar a lista dentro da função.

**2. Java: passagem de parâmetros por valor.**
Java sempre passa uma cópia do argumento. Alterar `n` dentro do método não muda o original, que continua 5. Já no array, a cópia é do valor da referência: as duas apontam para o mesmo objeto, então `v[0] = 0` altera o array original.

**3. Python: closures e late binding.**
As lambdas guardam a variável `i`, e não o valor dela no momento da criação. Quando são chamadas, o laço já terminou e `i` vale 2. Correção usual: `lambda i=i: i`.

**4. C: variável local estática.**
`static int n` é inicializada uma única vez e mantém o valor entre as chamadas, embora seu escopo seja local à função. As três chamadas retornam 1, 2 e 3.

**5. Rust: ownership e movimentação.**
Ao chamar `dobra(v)`, a posse do `Vec` é movida para a função e `v` deixa de ser válida em `main`. Usá-la no `println!` viola a regra de posse única, e o programa nem compila. Correções: passar `&v` (empréstimo) ou `v.clone()`.

**6. Python: escopo de variáveis (LEGB).**
Como há uma atribuição a `total` dentro da função, o Python trata `total` como variável local em todo o corpo. Ao calcular `total + x`, a local ainda não tem valor, e ocorre o `UnboundLocalError`. Correção: declarar `global total` ou, melhor, receber e retornar o valor.

## Referência

Material da disciplina: exemplos `07_exercicio`.
