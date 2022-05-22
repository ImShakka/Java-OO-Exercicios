import java.util.Scanner;

// Matheus Fernandes Oliveira & Gabriel Costa
//Capítulo 06 - Questão 20
public class questao20 {
    double raio;
    double area;
    double pi = 3.1416;

    public double circleArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o raio:");
        raio = sc.nextDouble();
        sc.close();
        area = pi * (raio * raio);
        System.out.println("Resultado: " + area);
        return area;
    }

    public static void main(String[] args) {

        questao20 area = new questao20();
        area.circleArea();
    }

}
