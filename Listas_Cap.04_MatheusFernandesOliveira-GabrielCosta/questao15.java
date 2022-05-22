import java.util.Scanner;

// Matheus Fernandes Oliveira & Gabriel Costa
//Capítulo 04 - Questão 15
public class questao15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // letra A:

        // faltou declarar a variável age e atribuir uma entrada a ela:
        int age;
        System.out.println("idade: ");
        age = sc.nextInt();

        // o if está com erro de sintaxe, não utiliza-se ";" e sim "{}":
        if (age >= 65) {
            System.out.println("Age is greater than or equal to 65");
        } else {
            // uma das aspas estão fora dos parenteses do metodo
            System.out.println("Age is less than 65");
        }

        // letra B:

        // a variável total não havia sido inicializada
        int x = 1, total = 0;
        while (x <= 10) {
            total += x;
            ++x;
        }
        // faltou um print para exibir o resultado
        System.out.println(total);

        // letra C:

        // faltou declarar e inicializar as variáveis
        int x2 = 1, total2 = 0;
        // faltou as chaves "{}" do while
        while (x <= 100) {
            // a identação estava errada
            total2 += x2;
            ++x2;
        }
        // faltou um print para exibir o resultado
        System.out.println(total2);

        // letra D:

        // faltou declarar e inicializar as variáveis
        int y = 1, total3 = 0;
        // faltou uma chave no while "}"
        while (y > 0) {
            // havia faltado uma variável pra armazenar o resultado
            total3 += y;
            ++y;
        }
        // o print estava apresentando o count
        // o print estava dentro do while inves de estar fora dele
        System.out.println(total3);

        sc.close();
    }

}
