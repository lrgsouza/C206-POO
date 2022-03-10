public class Kart {
    String nome;
    Motor motor;
    Piloto piloto;

    public Kart(Piloto piloto, String nome, String cilindradasMotor, Float veloMaxMotor){
        this.piloto = piloto;
        this.nome = nome;

        //compondo
        motor = new Motor(cilindradasMotor, veloMaxMotor);
    }

    void pular(){
        System.out.println(nome + " Pulou!");
    }
    void soltarTurbo(){
        System.out.println(nome +" Soltou turbo!");
    }
    void fazerDrift(){
        System.out.println(nome + " Fez drifit");
    }
}
