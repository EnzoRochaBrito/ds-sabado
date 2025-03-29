package matematica;

public class Main {
    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();

        System.out.println(soma.calcular(5, 5));
        System.out.println(subtracao.calcular(2, 4));
        System.out.println(multiplicacao.calcular(10, 10));
        System.out.println(divisao.calcular(14, 3));

    }
}
