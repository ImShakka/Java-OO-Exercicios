import java.util.Scanner;

// Matheus Fernandes Oliveira & Gabriel Costa
//Capítulo 04 - Questão 16
public class questao16 {

    /*
     * Resposta: O seguinte programa imprime o resultado os 10 primeiros quadrados
     * perfeitos e a soma deles
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y;
        int x = 1;
        int total = 0;

        while (x <= 10) {
            y = x * x;
            System.out.println(y);
            total += y;
            ++x;
        }

        System.out.printf("Total is %d\n", total);
        sc.close();
    }
}
