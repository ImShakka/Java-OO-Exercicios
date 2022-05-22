// Matheus Fernandes Oliveira & Gabriel Costa
//Capítulo 08 - Questão 12
//Considere questao12 = Complex
public class questao12 {

    private double a;
    private double b;

    public questao12(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public questao12() {
        this.a = 0.0;
        this.b = 0.0;
    }

    // letra A:
    public static questao12 somar(questao12 r, questao12 i) {
        return new questao12(r.a + i.a, r.b + i.b);
    }

    // letra B:
    public static questao12 subtrair(questao12 r, questao12 i) {
        return new questao12(r.a - i.a, r.b - i.b);
    }

    // letra C:
    public String toString() {
        return "(" + a + ", " + b + ")";
    }
}

class Complex {
    public static void main(String[] args) {
        questao12 numeroComplexo1 = new questao12(3.7, 2.2);
        questao12 numeroComplexo2 = new questao12(6.3, 7.8);
        System.out.println("\nResultado da soma: " + questao12.somar(numeroComplexo1, numeroComplexo2));
        System.out.println("\nResultado da subtração: " + questao12.subtrair(numeroComplexo1, numeroComplexo2));
    }
}