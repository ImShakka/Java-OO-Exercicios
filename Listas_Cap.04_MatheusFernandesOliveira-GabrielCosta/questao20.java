import java.util.Scanner;

// Matheus Fernandes Oliveira & Gabriel Costa
//Capítulo 04 - Questão 20
public class questao20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hora_normal;
        double qtde_hora_extra;
        double hora_extra;
        double total_hr_extra;
        double acrescimo;
        double sal_bruto;
        int horas_trabalhadas;
        int funcionario = 0;

        while (funcionario < 3) {
            System.out.println("\nInsira o total de horas trabalhadas: ");
            horas_trabalhadas = sc.nextInt();
            System.out.println("Insira o salário hora: ");
            hora_normal = sc.nextInt();

            if (horas_trabalhadas > 40) {
                qtde_hora_extra = horas_trabalhadas - 40;

                hora_extra = hora_normal * 0.50;
                total_hr_extra = hora_extra + hora_normal;
                acrescimo = qtde_hora_extra * total_hr_extra;
                sal_bruto = (horas_trabalhadas * hora_normal) + acrescimo;
                System.out.println("\nHoras Trabalhadas: " + horas_trabalhadas);
                System.out.println("Salario Bruto:" + sal_bruto);

            } else {
                sal_bruto = horas_trabalhadas * hora_normal;
                System.out.println("\nHoras Trabalhadas: " + horas_trabalhadas);
                System.out.println("Salario Bruto:" + sal_bruto);
            }
            funcionario++;
        }
        sc.close();
    }
}
