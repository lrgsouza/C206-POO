package trat_erro;

public class Calculadora{

    public static void soma(int x, int y){
        System.out.println("resultado = " + (x+y));
    }

    public static void subtrai(int x, int y){
        System.out.println("resultado = " + (x-y));
    }
    public static void multiplica(int x, int y){
        System.out.println("resultado = " + (x*y));
    }
    public static void divide(int x, int y){
        try {
            System.out.println("resultado = " + (x/y));
        }catch (Exception e){
            System.out.println("Erro ao calcular: " + e);
        }

    }
}
