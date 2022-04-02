package cdg.inatel.br.Banda;

import cdg.inatel.br.Empresario.Empresario;
import cdg.inatel.br.Membro.Membro;
import cdg.inatel.br.Musica.Musica;

public class Banda {
    private String nome;
    private String genero;
    public Empresario empresario;
    public Membro[] membros;
    public Musica[] musicas;

    public Banda(String nome, String genero){
        this.nome = nome;
        this.genero = genero;
    }

    public void addMusica(Musica musica){
        for (int i = 0; i < musicas.length; i++) {
            if (musicas[i] == null){
                musicas[i] = musica;
                break;
            }
        }
    }

    public void addMembroNovo(Membro membro){
        for (int i = 0; i < membros.length; i++) {
            if (membros[i] == null){
                membros[i] = membro;
                break;
            }
        }
    }
    public void mosrtaInfo(){
        //da banda
        System.out.println("Nome da banda: "+nome);
        System.out.println("Genero da banda: "+genero);
        //as musicas
        System.out.println("======Musicas======");
        for (int i = 0; i < this.musicas.length ; i++) {
            if (musicas[i] != null){
                System.out.println((i+1)+" - "+musicas[i].getNome()+" ("+musicas[i].getDuracao()+" Min)");
            }
        }

        //os membros
        System.out.println("======Membros======");
        for (Membro membro : this.membros) {
            if (membro != null) {
                System.out.println(membro.getFuncao() + ": " + membro.getNome());
            }
        }
        //empresario
        System.out.println("======Empresário======");
        System.out.println("Nome: "+this.empresario.getNome()+" Cnpj: "+this.empresario.getCnpj());

    }


}
