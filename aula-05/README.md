# Paradigmas de Linguagens de Programação: Atividade Aula 05

[← voltar ao índice do repositório](../README.md)

Lista de exercícios: **Nomes, Vinculações e Escopo**, com base no capítulo 5 de
Sebesta (*Conceitos de Linguagens de Programação*) e no conteúdo da aula.

A atividade reúne **7 exercícios não consecutivos**, cobrindo nomes,
apelidos, vinculação, tipagem dinâmica, armazenamento, ocultação e escopo.

## Estrutura do repositório

```text
.
└── README.md     # enunciados + respostas
```

---

## 3. Case sensitive

**Enunciado:** Construa um exemplo mínimo que demonstre a diferença entre
maiúsculas e minúsculas em nomes.

**Resposta:**

```java
public class Contador {
    public static void main(String[] args) {
        int total = 10;
        int Total = 20;
        int TOTAL = 30;

        System.out.println(total + Total + TOTAL);
    }
}
```

Resultado:

```text
60
```

`total`, `Total` e `TOTAL` são três variáveis diferentes.

A vantagem é permitir um espaço de nomes maior. A desvantagem é que nomes muito
parecidos podem diminuir a legibilidade e facilitar erros de digitação.

---

## 7. Apelidos

**Enunciado:** Explique o conceito de apelidos e mostre um exemplo.

**Resposta:**

Apelidos ocorrem quando duas referências ou nomes podem acessar a mesma região
de memória.

Exemplo em C:

```c
int x = 5;
int *p = &x;

*p = 99;

printf("%d\n", x);
```

Saída:

```text
99
```

A atribuição foi feita usando `p`, mas `x` também mudou porque os dois estão
associados ao mesmo endereço.

O problema é que isso pode prejudicar a legibilidade, pois uma mudança feita em
um nome pode ter efeito observável através de outro.

---

## 10. Vinculação estática e dinâmica

**Enunciado:** Explique a diferença entre vinculação estática e dinâmica usando
exemplos.

**Resposta:**

A vinculação é **estática** quando é definida antes da execução ou não muda
durante a execução.

Em Java:

```java
int medida = 40;
// medida = "quarenta"; // erro
```

O tipo de `medida` é definido estaticamente.

Em JavaScript:

```javascript
let medida = 40;
medida = "quarenta";
```

A linguagem permite a mudança de tipo durante a execução, caracterizando
vinculação dinâmica do tipo.

A vantagem da vinculação estática é permitir mais verificações antecipadas. A
vantagem da dinâmica é a flexibilidade.

---

## 13. Vinculação de tipos dinâmica

**Enunciado:** Demonstre a vinculação dinâmica de tipos.

**Resposta:**

```javascript
let dado = [1, 2, 3];
console.log(typeof dado);

dado = 17.3;
console.log(typeof dado);

dado = "texto";
console.log(typeof dado);
```

Uma saída possível é:

```text
object
number
string
```

A mesma variável recebe valores de tipos diferentes durante a execução.

Isso aumenta a flexibilidade, mas exige que vários problemas sejam verificados
em tempo de execução.

---

## 16. Variáveis dinâmicas da pilha

**Enunciado:** Apresente um exemplo de variável dinâmica da pilha.

**Resposta:**

```c
int fatorial(int n) {
    int resultado;

    if (n <= 1) {
        resultado = 1;
    } else {
        resultado = n * fatorial(n - 1);
    }

    return resultado;
}
```

`n` e `resultado` são variáveis locais associadas às ativações das chamadas da
função.

Em uma chamada recursiva como `fatorial(4)`, cada ativação precisa manter seus
próprios valores.

O armazenamento dessas variáveis é criado quando a ativação é executada e
liberado quando ela termina.

---

## 21. Ocultação de nomes

**Enunciado:** Mostre como uma declaração em um escopo interno pode esconder
outra declaração.

**Resposta:**

Um exemplo em C é:

```c
void exemplo(void) {
    int valor = 10;

    {
        int valor = 20;
        printf("%d\n", valor);
    }

    printf("%d\n", valor);
}
```

Saída:

```text
20
10
```

Dentro do bloco interno, o `valor` mais próximo é o que será utilizado.

Isso é chamado de **ocultação de nomes**. A declaração externa continua
existindo, mas fica escondida dentro do escopo interno.

---

## 25. Escopo e tempo de vida

**Enunciado:** Explique a diferença entre escopo e tempo de vida.

**Resposta:**

**Escopo** é a região do código em que um nome pode ser utilizado.

**Tempo de vida** é o intervalo em que a variável permanece associada a um
local de armazenamento.

Exemplo:

```c
void exemplo(void) {
    int valor = 10;

    {
        printf("%d\n", valor);
    }
}
```

O escopo do nome depende da região em que a declaração é visível, enquanto o
tempo de vida está relacionado ao período em que o armazenamento da variável
existe.

Os conceitos são relacionados, mas não significam a mesma coisa.

---

## Síntese

Os conceitos trabalhados mostram que nomes não são apenas rótulos. As decisões
sobre como eles são vinculados, quando o tipo é conhecido, quanto tempo o
armazenamento existe e qual declaração fica visível afetam diretamente
legibilidade, segurança, flexibilidade e manutenção dos programas.

## Referência

SEBESTA, Robert W. *Conceitos de Linguagens de Programação*. Capítulo 5.
