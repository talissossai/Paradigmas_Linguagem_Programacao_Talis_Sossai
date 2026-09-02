import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<String> pilha = new ArrayDeque<>();
        String[] entrada = {"id", "+", "id", "*", "id", "$"};

        System.out.printf(
                "%-30s %-20s %s%n",
                "PILHA", "ENTRADA", "ACAO"
        );

        System.out.println(
                "----------------------------------------------------------------"
        );

        shift(pilha, "id");
        reduce(pilha, "F -> id");
        reduce(pilha, "T -> F");
        reduce(pilha, "E -> T");

        shift(pilha, "+");

        shift(pilha, "id");
        reduce(pilha, "F -> id");
        reduce(pilha, "T -> F");

        shift(pilha, "*");

        shift(pilha, "id");
        reduce(pilha, "F -> id");
        reduce(pilha, "T -> T * F");
        reduce(pilha, "E -> E + T");

        imprimir(pilha, "$", "ACCEPT");
    }

    private static void shift(Deque<String> pilha, String simbolo) {
        pilha.addLast(simbolo);
        imprimir(pilha, "...", "SHIFT " + simbolo);
    }

    private static void reduce(Deque<String> pilha, String regra) {
        String novo;

        switch (regra) {
            case "F -> id" -> {
                pilha.removeLast();
                novo = "F";
            }
            case "T -> F" -> {
                pilha.removeLast();
                novo = "T";
            }
            case "E -> T" -> {
                pilha.removeLast();
                novo = "E";
            }
            case "T -> T * F" -> {
                pilha.removeLast();
                pilha.removeLast();
                pilha.removeLast();
                novo = "T";
            }
            case "E -> E + T" -> {
                pilha.removeLast();
                pilha.removeLast();
                pilha.removeLast();
                novo = "E";
            }
            default -> throw new IllegalArgumentException("Regra desconhecida");
        }

        pilha.addLast(novo);
        imprimir(pilha, "...", "REDUCE " + regra);
    }

    private static void imprimir(
            Deque<String> pilha,
            String entrada,
            String acao
    ) {
        System.out.printf(
                "%-30s %-20s %s%n",
                pilha, entrada, acao
        );
    }
}
