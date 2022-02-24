
//Exercício 1 –Zombicide!
public class Principal_Ex1 {
    public static void main(String[] args) {

        //declarando variaveis
        int[] partida;
        partida = new int[3];
        int soma = 0;
        int media;

        //atribuindo valores
        partida[0] = 130;
        partida[1] = 240;
        partida[2] = 320;

        //somando
        int i;
        for(i = 0; i<=partida.length - 1;i++){
            soma += partida[i];
        }

        //calculando média
        media = soma / i;

        //mostrando resultados
        System.out.printf("Soma = " + soma + "\nMédia = " + media);

    }
}
