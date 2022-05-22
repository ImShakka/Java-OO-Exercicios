import java.util.Scanner;

// Matheus Fernandes Oliveira & Gabriel Costa
//Capítulo 08 - Questão 04
// Considere questao04 = Rectangle
public class questao04 {

    private static float largura;
    private static float altura;

    public float getLargura() {
        return largura;
    }

    public boolean setLargura(float largura) {

        if (largura < 0.0 || largura > 20.0) {
            System.out.println("Valor inválido");
            return false;
        } else {
            questao04.largura = largura;
            return true;
        }
    }

    public float getAltura() {
        return altura;
    }

    public boolean setAltura(float altura) {

        if ((altura < 0.0) || (altura > 20.0)) {
            System.out.println("numero invalido");
            return false;

        } else {
            questao04.altura = altura;
            return true;
        }
    }

    public static float perimetro() {
        float perimetro = 2 * (largura + altura);
        return perimetro;
    }

    public static float area() {
        float area = (largura * altura);
        return area;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a largura: ");
        largura = sc.nextFloat();
        System.out.println("Digite a altura: ");
        altura = sc.nextFloat();
        System.out.print("Resultado do perímetro: " + perimetro() + "\nResultado da área: " + area());
        sc.close();
    }
}
