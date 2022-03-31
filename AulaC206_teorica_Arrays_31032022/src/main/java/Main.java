public class Main {
    public static void main(String[] args) {

        //array
        String[] versoes = {"98", "95", "Xp", "2000", "7", "8", "10", "11" };
        //FOR EACH
        for (String x:
                versoes
             ) {
            System.out.println(x);
        }

        //matriz
        int[][] matriz;
        matriz = new int[5][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i + j;
                System.out.println(matriz[i][j]);
            }
        }

        for (int[] linha : matriz) {
            for (int valores: linha) {
                System.out.println(valores + " ");
            }
            System.out.println("\n");
        }

    }
}
