import java.util.Scanner;

// Matheus Fernandes Oliveira & Gabriel Costa
//Capítulo 06 - Questão 17
public class questao17 {
    private int numero;
    private int qtd;
    private boolean par;

    public void Verificar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de números que deseja verificar:");
        qtd = sc.nextInt();

        while (qtd < 1) {
            System.out.println("Entrada Inválida! Informe a quantidade de pares que deseja verificar:");
            qtd = sc.nextInt();
        }
        for (int i = 1; i <= qtd; i++) {
            System.out.println("\n" + i + "º Número:\n");
            System.out.println("Informe o número:");
            numero = sc.nextInt();

            par = isMultiple();
            System.out.printf("\nO segundo valor é múltiplo do primeiro valor: %b\n", par);
            if (par == false) {
                System.out.println("Não é par\n");
            } else {
                System.out.println("É par\n");
            }
        }
        sc.close();
    }

    public boolean isMultiple() {
        if (numero % 2 == 0) {
            return true;
        } else {

            return false;
        }
    }

    public static void main(String[] args) {
        questao17 multiplo = new questao17();
        multiplo.Verificar();
    }
}
