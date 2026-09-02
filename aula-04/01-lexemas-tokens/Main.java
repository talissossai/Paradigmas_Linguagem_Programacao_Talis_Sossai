import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String entrada = "resultado = somaAnterior - valor / 1000;";

        Pattern padrao = Pattern.compile(
                "[a-zA-Z_][a-zA-Z0-9_]*|[0-9]+|[=+\\-*/();]"
        );

        Matcher matcher = padrao.matcher(entrada);

        System.out.printf("%-18s %s%n", "LEXEMA", "TOKEN");
        System.out.println("----------------------------------------");

        while (matcher.find()) {
            String lexema = matcher.group();

            String token;

            if (lexema.matches("[a-zA-Z_][a-zA-Z0-9_]*")) {
                token = "IDENTIFICADOR";
            } else if (lexema.matches("[0-9]+")) {
                token = "INTEIRO";
            } else {
                token = switch (lexema) {
                    case "=" -> "ATRIBUICAO";
                    case "+" -> "ADICAO";
                    case "-" -> "SUBTRACAO";
                    case "*" -> "MULTIPLICACAO";
                    case "/" -> "DIVISAO";
                    case ";" -> "PONTO_E_VIRGULA";
                    case "(" -> "ABRE_PARENTESES";
                    case ")" -> "FECHA_PARENTESES";
                    default -> "SIMBOLO";
                };
            }

            System.out.printf("%-18s %s%n", lexema, token);
        }
    }
}
