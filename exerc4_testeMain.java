package unidade_5;

public class exerc4_testeMain {

    public static void main(String[] args) {
        exerc4_Math a = new exerc4_Math();
        double[] valores = {5.2, 5.6, -5.8};
        for (double valor : valores) {
            System.out.println("O arredondamento de " + valor + " é " + a.arredondar(valor));
        }
    }
}
