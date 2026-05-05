import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sequencia de fibonacci \n\n");

        System.out.println("quantos números da sequencia voce quer ver? ");
        int n = sc.nextInt();

        int  a = 0, b = 1;
        System.out.println("Sequencia: ");
        for(int i = 0 ; i <n ; i ++){
            System.out.println(a + " ");

            int proximo = a + b;
            a = b;
            b = proximo;
        }
        sc.close();
    }
}
