package cdg.inatel.br;
import cdg.inatel.br.Banda.Banda;
import cdg.inatel.br.Empresario.Empresario;
import cdg.inatel.br.Membro.Membro;
import cdg.inatel.br.Musica.Musica;

public class Main {
    public static void main(String[] args) {
            Banda banda = new Banda("Pink floyd","Rock n Roll");
            Empresario empresario = new Empresario("Lucas",39479231808L);
            //arrays
            Membro[] membros = new Membro[5];
            Musica[] musicas = new Musica[5];
            banda.musicas = musicas;
            banda.membros = membros;
            banda.empresario = empresario;

            //adicionando musicas
            Musica musica = new Musica("The wall", 6.10);
            banda.addMusica(musica);
            musica = new Musica("Comfortably numb", 4.50);
            banda.addMusica(musica);
            musica = new Musica("Wish you were", 6.09);
            banda.addMusica(musica);
            musica = new Musica("Another brick in The Wall", 5.19);
            banda.addMusica(musica);

            //adicionando membros
            Membro membro = new Membro("David Guilmour","Cantor/Guitarrista");
            banda.addMembroNovo(membro);
            membro = new Membro("Roger Waters","Cantor/Guitarrista");
            banda.addMembroNovo(membro);
            membro = new Membro("Nick Mason","Baterista");
            banda.addMembroNovo(membro);

            //mostrando info
            banda.mosrtaInfo();

    }


}
