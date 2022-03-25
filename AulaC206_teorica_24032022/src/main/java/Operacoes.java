public class Operacoes {

    //CADA INSTANCIA TEM SEU X
    private int x1 = 10;
    private int x2 = 2;
    //A CLASSE TEM O Y
    public static int opCount = 0;

    public Operacoes(int x1, int x2){
        this.x1 = x1;
        this.x2 = x2;
        opCount++;
    }

    public static int soma(int x1, int x2){
        return x1 + x2;
    }


    public int somador(){
        return this.x1 + this.x2;
    }

    public int subtrator(){
        return this.x1 - this.x2;
    }

    public int multiplicador(){
        return this.x1 * this.x2;
    }

    public int divisor(){
        return this.x1 / this.x2;
    }

}
