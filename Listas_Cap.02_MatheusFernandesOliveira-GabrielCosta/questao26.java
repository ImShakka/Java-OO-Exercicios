import java.util.Scanner;

// Matheus Fernandes Oliveira & Gabriel Costa
//Capítulo 02 - Questão 26
public class questao26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = sc.nextInt();

        if (n1 % n2 == 0) {
            System.out.println(n1 + " é multiplo de " + n2);
        } else {
            System.out.println(n1 + " não é multiplo de " + n2);
        }

        sc.close();
    }
}
