import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String entrada =
                "int nota_talis = 10; while (nota_talis < 20) nota_talis = nota_talis + 1;";

        Set<String> reservadas = Set.of(
                "int", "if", "else", "while", "return"
        );

        System.out.printf("%-15s %-20s%n", "LEXEMA", "TOKEN");
        System.out.println("-------------------------------------");

        int i = 0;

        while (i < entrada.length()) {
            char c = entrada.charAt(i);

            if (Character.isWhitespace(c)) {
                i++;
                continue;
            }

            if (Character.isLetter(c) || c == '_') {
                int inicio = i++;

                while (i < entrada.length()
                        && (Character.isLetterOrDigit(entrada.charAt(i))
                        || entrada.charAt(i) == '_')) {
                    i++;
                }

                String lexema = entrada.substring(inicio, i);
                String token = reservadas.contains(lexema)
                        ? "PALAVRA_RESERVADA"
                        : "IDENTIFICADOR";

                System.out.printf("%-15s %-20s%n", lexema, token);

            } else if (Character.isDigit(c)) {
                int inicio = i++;

                while (i < entrada.length() && Character.isDigit(entrada.charAt(i))) {
                    i++;
                }

                System.out.printf(
                        "%-15s %-20s%n",
                        entrada.substring(inicio, i),
                        "INTEIRO"
                );

            } else {
                String token = switch (c) {
                    case '=' -> "ATRIBUICAO";
                    case '<' -> "MENOR";
                    case '+' -> "ADICAO";
                    case ';' -> "PONTO_E_VIRGULA";
                    case '(' -> "ABRE_PARENTESES";
                    case ')' -> "FECHA_PARENTESES";
                    default -> "ERRO_LEXICO";
                };

                System.out.printf("%-15s %-20s%n", c, token);
                i++;
            }
        }
    }
}
