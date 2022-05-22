// Matheus Fernandes Oliveira & Gabriel Costa
//Capítulo 04 - Questão 11
public class questao11 {
    public static void main(String[] args) {

        /*
         * Como o tipo de entrada é inteiro, a saída também será inteiro, por isso a
         * parte fracionária não é exibida. Para o programador evitar que isso aconteça,
         * ele pode definir os números de entrada como double ou float, ou utilizar um
         * casting na hora da saída
         */

        // exemplo:
        System.out.println(10 / 4);
        // a saída será 2 e não 2.5 porque a entrada é inteiro, então a saída será
        // inteiro

        // Solução:
        System.out.println((double) 10 / 4);
        // ou
        double n1;
        double n2;
        n1 = 10;
        n2 = 4;
        System.out.println(n1 / n2);

    }
}
