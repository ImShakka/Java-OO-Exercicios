import java.util.Scanner;

// Matheus Fernandes Oliveira & Gabriel Costa
//Capítulo 04 - Questão 17
public class questao17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int km = 1, litros = 1, totalKm = 0, totalLit = 0, parar = 1;
        double kml = 0;

        while (parar > 0) {
            System.out.print("Quantos Quilômetros foram Dirigidos: ");
            km = sc.nextInt();

            System.out.print("Quantos Litros de Combustível foram Gastos: ");
            litros = sc.nextInt();

            totalKm += km;
            totalLit += litros;
            kml = km / (double) litros;

            System.out.printf("O consumo é: %.2f Km/L\n", kml);
            System.out.println("O Total de Quilômetros Rodados até agora foi: " + totalKm + " Km");
            System.out.println("O Total de Litros Consumidos até agora foi: " + totalLit + " L");

            System.out.println("Digite '1' para inserir mais valores e '0' para Sair");
            parar = sc.nextInt();
            if (parar == 0) {
                break;
            }
        }
        System.out.printf("\nO Monitoramento de Quilômetros e Litros foi Finalizado!\n\n");
        System.out.println("O Total de Quilômetros Rodados foi: " + totalKm + " Km");
        System.out.println("O Total de Litros Consumidos foi: " + totalLit + " L");

        sc.close();
    }
}
