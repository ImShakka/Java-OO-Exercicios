import java.util.Scanner;

// Matheus Fernandes Oliveira & Gabriel Costa
//Capítulo 04 - Questão 37
public class questao37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // letra A:
        int n;
        System.out.println("Insira um número:");
        n = sc.nextInt();
        if (n == 0) {
            System.out.println("O resultado do fatorial é: 1");
        } else {
            int i = n - 1;
            if (n < 0) {
                System.out.println("Erro ! Insira um número inteiro !");
            } else {
                while (i > 0) {
                    n *= i;
                    i--;
                }
                System.out.println("O resultado do fatorial é: " + n);
            }
        }

        // letra B:
        double a;
        double b;
        System.out.println("Insira o termo da constante matemática: ");
        a = sc.nextInt();
        if (a == 0) {
            System.out.println("O resultado é: 1");
        } else {
            double i = a - 1;
            if (a < 0) {
                System.out.println("Erro ! Insira um número inteiro !");
            } else {
                while (i > 0) {
                    a *= i;
                    i--;
                }
                b = 1 / a;
                System.out.println("O resultado é: " + b);
            }
        }

        // letra C:

        double y;
        double z;
        int c = 1, x;
        System.out.println("Insira o termo e da constante matemática: ");
        y = sc.nextInt();
        System.out.println("Insira o termo x da constante matemática: ");
        x = sc.nextInt();
        if (y == 0) {
            System.out.println("O resultado é: 1");
        } else {
            double i = y - 1;
            if (y < 0) {
                System.out.println("Erro ! Insira um número inteiro !");
            } else {
                while (i > 0) {
                    y *= i;
                    i--;
                    c++;
                }

                z = Math.pow(x, c) / y;
                System.out.println("O resultado é: " + z);
            }
        }

        sc.close();
    }
}
