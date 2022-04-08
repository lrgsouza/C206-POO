public class Main {
    public static void main(String[] args) {
        //array de personagens
        Personagem[] personagem = new Personagem[10];

        //criando personagens
        personagem[0] = new Astrologo("AstroManiaco","Cajado de Luz");
        personagem[1] = new Samurai("Matsui","Katana de sangue");
        personagem[2] = new Confessor("PadreQuevedo","Cruz andina");

        //loop nos personagens
        for (int i = 0; i < personagem.length; i++) {
            if (personagem[i] != null){
                System.out.println("====================================");
                if (personagem[i] instanceof Astrologo){
                    Astrologo astrologo = (Astrologo) personagem[i];
                    //metodos
                    astrologo.passaLevel();
                    astrologo.ganhaHabilidade();
                    //cura
                    astrologo.aprendeCura();
                    astrologo.curar();
                    //Magia
                    astrologo.aprendeFeitico();
                    astrologo.usaFeitico(300);
                    //informações
                    astrologo.mostraInfo();
                }
                if (personagem[i] instanceof Samurai){
                    Samurai samurai = (Samurai) personagem[i];
                    //metodos
                    samurai.passaLevel();
                    samurai.ganhaHabilidade();
                    //cura
                    samurai.aprendeCura();
                    samurai.curar();
                    //informações
                    samurai.mostraInfo();
                }
                if (personagem[i] instanceof Confessor){
                    Confessor confessor = (Confessor) personagem[i];
                    //metodos
                    confessor.passaLevel();
                    confessor.ganhaHabilidade();
                    //cura
                    confessor.aprendeCura();
                    confessor.curar();
                    //informações
                    confessor.mostraInfo();
                }

            }
        }
        //mostrando quantidade de personagens
        System.out.println("====================================");
        System.out.println("Quantidade de personagens criados: "+Personagem.contador);

    }
}
