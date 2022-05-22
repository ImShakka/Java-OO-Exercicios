import java.util.Scanner;

// Matheus Fernandes Oliveira & Gabriel Costa
//Capítulo 02 - Questão 25
public class questao25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Digite um número: ");
        n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " é par");
        } else {
            System.out.println(n + " é impar");
        }

        sc.close();
    }
}
