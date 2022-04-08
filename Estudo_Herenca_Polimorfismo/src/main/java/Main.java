public class Main {
    public static void main(String[] args) {
        Jedi jedi = new Jedi("Lucas",120,true);
        Sith sith = new Sith("Airton",50,false);
        Droid droid = new Droid("Robozin",80,true);

        Personagem[] personagens = new Personagem[3];
        personagens[0] = jedi;
        personagens[1] = sith;
        personagens[2] = droid;

        Nave nave = new Nave("navezinha",personagens,true);

        //mostrando info
        nave.mostraInfo();

        for (int i = 0; i < personagens.length; i++) {
            if (personagens[i] instanceof Jedi){
                System.out.println("========= Jedi Methods =========");
                Jedi jedaizinho = (Jedi) personagens[i];
                jedaizinho.travarBatalha();
                jedaizinho.trocarSabre("Azul");
                jedaizinho.usarForca();
                jedaizinho.treinarPadawan();
            }
            if (personagens[i] instanceof Sith){
                System.out.println("========= Sith Methods =========");
                Sith sithzinho = (Sith) personagens[i];
                sithzinho.travarBatalha();
                sithzinho.trocarSabre("Vermelho");
                sithzinho.usarForca();
                sithzinho.corromperJedi();
            }
            if (personagens[i] instanceof Droid){
                System.out.println("========= Droid Methods =========");
                Droid droidizinho = (Droid) personagens[i];
                droidizinho.travarBatalha();
                droidizinho.hackearSistema();
            }
        }

        //mostrando info novamente após os métodos
        nave.mostraInfo();

    }
}
