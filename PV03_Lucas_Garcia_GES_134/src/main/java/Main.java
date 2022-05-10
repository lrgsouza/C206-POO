import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //declarando variaveis e instancias
        Artista artista1 = new Artista();
        Artista artista2 = new Artista();
        Artista artista3 = new Artista();
        Artista artista4 = new Artista();

        Arquivo arquivo = new Arquivo();

        //atribuindo valores
        artista1.setNome("Guns n Roses");
        artista1.setOuvintesMensais(5000000);
        artista1.setMusicaMaisFamosa("Sweet child o mine");
        artista1.setInternacional(true);
        //atribuindo valores
        artista2.setNome("Anita");
        artista2.setOuvintesMensais(1200);
        artista2.setMusicaMaisFamosa("Sacode o popozão");
        artista2.setInternacional(false);
        //atribuindo valores
        artista3.setNome("Legião urbana");
        artista3.setOuvintesMensais(20000);
        artista3.setMusicaMaisFamosa("Faroeste Caboclo");
        artista3.setInternacional(false);
        //atribuindo valores
        artista4.setNome("Pink Floyd");
        artista4.setOuvintesMensais(100000000);
        artista4.setMusicaMaisFamosa("Another brick in the wall");
        artista4.setInternacional(true);

        //cadastrando
        arquivo.escrever(artista1);
        arquivo.escrever(artista2);
        arquivo.escrever(artista3);
        arquivo.escrever(artista4);

        //criando array pra receber leitura
        ArrayList<Artista> artistas = arquivo.ler();

        //ordenando crescente
        Collections.sort(artistas);

        //printando artistas internacionais
        System.out.println("=======================================");
        for (Artista artista:
             artistas) {
            if (artista.isInternacional()){
            System.out.println("Nome: "+artista.getNome());
            System.out.println("Ouvintes Mensais: "+artista.getOuvintesMensais());
            System.out.println("Musica mais Famosa: "+artista.getMusicaMaisFamosa());
            System.out.println("É internacional?: "+artista.isInternacional());
            System.out.println("=======================================");
            }
        }
        //ordenando decrescente
        Collections.reverse(artistas);

        //printando artistas nacionais
        System.out.println("=======================================");
        for (Artista artista:
                artistas) {
            if (!artista.isInternacional()){
            System.out.println("Nome: "+artista.getNome());
            System.out.println("Ouvintes Mensais: "+artista.getOuvintesMensais());
            System.out.println("Musica mais Famosa: "+artista.getMusicaMaisFamosa());
            System.out.println("É internacional?: "+artista.isInternacional());
                System.out.println("=======================================");
            }
        }
    }
}
