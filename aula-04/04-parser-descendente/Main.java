public class Main {
    private static final String ENTRADA = "(2 + 3) * 4";
    private static int pos = 0;

    public static void main(String[] args) {
        try {
            double resultado = expr();

            if (pos == ENTRADA.length()) {
                System.out.println("ENTRADA ACEITA");
                System.out.println("RESULTADO: " + resultado);
            } else {
                System.out.println("ERRO NA POSICAO " + pos);
            }
        } catch (RuntimeException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }

    private static double expr() {
        System.out.println("ENTRANDO em <expr>");
        double valor = term();

        while (pos < ENTRADA.length() && ENTRADA.charAt(pos) == '+') {
            pos++;
            valor += term();
        }

        System.out.println("SAINDO de <expr>");
        return valor;
    }

    private static double term() {
        System.out.println("ENTRANDO em <term>");
        double valor = factor();

        while (pos < ENTRADA.length() && ENTRADA.charAt(pos) == '*') {
            pos++;
            valor *= factor();
        }

        System.out.println("SAINDO de <term>");
        return valor;
    }

    private static double factor() {
        System.out.println("ENTRANDO em <factor>");

        if (pos < ENTRADA.length() && ENTRADA.charAt(pos) == '(') {
            pos++;
            double valor = expr();

            if (pos >= ENTRADA.length() || ENTRADA.charAt(pos) != ')') {
                throw new IllegalArgumentException("')' esperado");
            }

            pos++;
            System.out.println("SAINDO de <factor>");
            return valor;
        }

        int inicio = pos;

        while (pos < ENTRADA.length()
                && Character.isDigit(ENTRADA.charAt(pos))) {
            pos++;
        }

        if (inicio == pos) {
            throw new IllegalArgumentException(
                    "numero esperado na posicao " + pos
            );
        }

        double numero = Double.parseDouble(ENTRADA.substring(inicio, pos));

        System.out.println("Numero reconhecido: " + numero);
        System.out.println("SAINDO de <factor>");

        return numero;
    }
}
