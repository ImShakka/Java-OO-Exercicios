import java.util.Scanner;

// Matheus Fernandes Oliveira & Gabriel Costa
//Capítulo 02 - Questão 17
public class questao17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3, soma, media, produto;

        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        n3 = sc.nextInt();

        soma = n1 + n2 + n3;
        media = soma / 3;
        produto = n1 * n2 * n3;

        int n_menor = n1;
        int n_maior = n1;

        if (n2 > n_maior) {
            n_maior = n2;
        }
        if (n3 > n_maior) {
            n_maior = n3;
        }
        if (n2 < n_menor) {
            n_menor = n2;
        }
        if (n3 < n_menor) {
            n_menor = n3;
        }

        // n_maior = Math.max(n2, Math.max(n3, n1));
        // n_menor = Math.min(n2, Math.min(n3, n1));

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Produto: " + produto);
        System.out.println("Menor: " + n_menor);
        System.out.println("Maior: " + n_maior);

        sc.close();
    }
}