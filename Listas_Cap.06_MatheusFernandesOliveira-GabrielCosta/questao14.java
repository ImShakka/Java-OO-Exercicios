import java.util.Scanner;

// Matheus Fernandes Oliveira & Gabriel Costa
//Capítulo 06 - Questão 14
public class questao14 {

    public static int exp(int base, int expoente) {
        int resultado = 1;

        if (base == 0) {
            resultado = 0;
        } else
            for (int i = 0; i < expoente; i++) {
                resultado *= base;
            }
        return resultado;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base;
        int expoente;

        System.out.println("Digite a base: ");
        base = sc.nextInt();
        System.out.println("Digite o expoente: ");
        expoente = sc.nextInt();

        System.out.println("\nResultado: " + exp(base, expoente));

        sc.close();
    }

}
