public class Main {
    //aula destinada a compreender o método static
    public static void main(String[] args) {

        System.out.println(Operacoes.soma(1,2));

        Operacoes soma = new Operacoes(10,10);
        Operacoes sub = new Operacoes(100,50);
        Operacoes div = new Operacoes(90,3);
        Operacoes mult = new Operacoes(3,50);

        System.out.println(soma.somador());
        System.out.println(sub.subtrator());
        System.out.println(div.divisor());
        System.out.println(mult.multiplicador());
    }
}
