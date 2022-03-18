public class Principal {
    public static void main(String[] args) {

        //declarando pilotos
        Piloto mocinho = new Piloto("Mario", false);
        Piloto vilao = new Piloto("Bowser", true);
        Kart kart = new Kart(mocinho,"Honda mizerávi 50cc 2007","50cc", 80f);
        Kart kartVilao = new Kart(vilao,"Yamaha brabo 100cc 2018","100cc",120f);

        //mostrando info
        System.out.println("=======Informações Motor mocinho=======");
        kart.motor.mostrarInfo();
        System.out.println("========Informações Motor vilão========");
        kartVilao.motor.mostrarInfo();

        //executando açoes
        System.out.println("=============ações mocinho=============");
        kart.pular();
        kart.soltarTurbo();
        kart.fazerDrift();
        //mocinho poder
        mocinho.soltarSuperPoder();

        System.out.println("=============ações vilão===============");
        kartVilao.pular();
        kartVilao.soltarTurbo();
        kartVilao.fazerDrift();
        //mocinho poder
        vilao.soltarSuperPoder();

    }
}
