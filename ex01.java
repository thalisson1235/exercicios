import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        int quantiddfilhos = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();
        

        System.out.println("Quantas horas voce trabalhou? ");
        int hrstrabalhadas = sc.nextInt();

        System.out.println("Quanto voce recebe por hora? ");
        double recebeporhrs = sc.nextDouble();
        sc.nextLine();

        System.out.println("Voce tem filhos?");
        String filhos = sc.nextLine().toLowerCase();

        if (filhos.equals("sim") ) {
            System.out.println("Quantos filhos voce tem? ");
            quantiddfilhos = sc.nextInt();
               
        }

        double calcHrs = hrstrabalhadas * recebeporhrs;
 
        double salariofinal = calcHrs * (1 + ( 0.03 * quantiddfilhos));
        
        System.out.println("Olá, "+nome+" voce tem o salario de R$: "+salariofinal);
        sc.close();
    }
}
