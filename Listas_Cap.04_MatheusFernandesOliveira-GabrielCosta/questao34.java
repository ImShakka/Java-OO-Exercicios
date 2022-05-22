import java.util.Scanner;

// Matheus Fernandes Oliveira & Gabriel Costa
//Capítulo 04 - Questão 34
public class questao34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1;
        int y = 1;
        int z;
        // System.out.println(++(x + y));
        // Para o count funcionar, ele precisa ser atribuido à uma variável que recebe a
        // soma:
        z = (x + y);
        System.out.println(++(z));

        sc.close();
    }
}
