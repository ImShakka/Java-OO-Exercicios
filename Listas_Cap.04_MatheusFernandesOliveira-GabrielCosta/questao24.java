import java.util.Scanner;

// Matheus Fernandes Oliveira & Gabriel Costa
//Capítulo 04 - Questão 24
public class questao24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int studentCounter = 1;
        int result;

        while (studentCounter <= 10) {
            System.out.println("Enter result (1 = pass, 2 = fail): ");
            result = sc.nextInt();
            if (result == 1) {
                passes = passes + 1;
            } else {
                if (result == 2) {
                    failures = failures + 1;
                }
            }

            if (result == 1 || result == 2) {
                studentCounter = studentCounter + 1;
            } else {
                System.out.println("The answer need to be 1 ou 2");
            }
        }

        System.out.printf("Passed: %d\nFailed: %d\n", passes, failures);

        if (passes > 8) {
            System.out.println("Bonus to instructor!");
        }

        sc.close();
    }
}
