import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double quantidademax, quantidademin, quantidademedia;

        System.out.println("Calculadora de Estoque médio \n \n");

        System.out.println("qual a quantidade máxima de estoque? ");
        quantidademax = sc.nextDouble();
        sc.nextLine();
        
        System.out.println("Qual a quantidade mínima de estoque? ");
        quantidademin = sc.nextDouble();
        sc.nextLine();

        quantidademedia = (quantidademax + quantidademin)/2;

        System.out.println("A quantidade média do estoque da peça é de: "+quantidademedia + "\n");
        sc.close();

    }
}
