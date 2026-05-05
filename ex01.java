import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();
        

        System.out.println("qual seu números de horas trabalhadas? ");
        int hrstrabalhadas = sc.nextInt();
        sc.close();
        
    }
}
