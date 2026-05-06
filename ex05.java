public class ex05 {
    public static void main(String[] args) {
        int contador = 0;
        int numero = 1;

        while (contador < 4) {
            int soma = 0;

            for (int i = 1; i < numero; i++) {
                if (numero % i == 0) {
                    soma += i;
                }
            }

            if (soma == numero) {
                System.out.println(numero);
                contador++;
            }

            numero++;
        }
    }
}