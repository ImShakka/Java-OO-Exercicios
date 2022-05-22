import java.util.Scanner;

// Matheus Fernandes Oliveira & Gabriel Costa
//Capítulo 06 - Questão 16
public class questao16 {
    private int numero1;
    private int numero2;
    private int par;
    private boolean multiplo;

    public void Calcular() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de pares que deseja verificar:");
        par = sc.nextInt();

        while (par < 1) {
            System.out.println("Entrada Inválida! Informe a quantidade de pares que deseja verificar:");
            par = sc.nextInt();
        }
        for (int i = 1; i <= par; i++) {
            System.out.println("\n" + i + "º Par:\n");
            System.out.println("Informe o primeiro valor não negativo de pares:");
            numero1 = sc.nextInt();
            while (numero1 < 1) {
                System.out.println("Entrada Inválida! Informe o primeiro valor não negativo do pares:");
                numero1 = sc.nextInt();
            }
            System.out.println("Informe o segundo valor não negativo de pares:");
            numero2 = sc.nextInt();
            while (numero2 < 1) {
                System.out.println("Entrada Inválida! Informe o segundo valor não negativo do pares:");
                numero2 = sc.nextInt();
            }
            multiplo = isMultiple();
            System.out.printf("\nO segundo valor é múltiplo do primeiro valor: %b\n", multiplo);
            if (multiplo == false) {
                System.out.println("Não é múltiplo\n");
            } else {
                System.out.println("É múltiplo\n");
            }
        }
        sc.close();
    }

    public boolean isMultiple() {
        if (numero2 % numero1 == 0) {
            return true;
        } else {

            return false;
        }
    }

    public static void main(String[] args) {
        questao16 multiplo = new questao16();
        multiplo.Calcular();
    }
}
