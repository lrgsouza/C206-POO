public class Carro {

    //atributos
    String cor, marca, modelo;
    double velocidadeMax, velocidadeAtual;
    int potenciaMotor;
    String tipoMotor;
    Motor motor;

    //Construtor
    Carro(String cor, String marca, String modelo, Double velocidadeMax, double velocidadeAtual, int potenciaMotor, String tipoMotor){
        //atributos carro
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeMax = velocidadeMax;
        this.velocidadeAtual = velocidadeAtual;
        //atributos motor
        this.motor = new Motor(potenciaMotor , tipoMotor);
    }

    void ligar(){
        System.out.println("Carro " + " " + this.marca + " " + this.modelo + " " + this.cor+ " funcionando");
        int i = 0;
        while (i<10){
            System.out.print(".");
            i++;
        }
        System.out.println("\n");
    }

    void acelerar(){
        System.out.println("Carro " + " " + this.marca + " " + this.modelo + " " + this.cor+ " acelerando");
        int i = 0;
        while (i<10){
            System.out.print(".");
            i++;
        }
        System.out.println("\n");
    }

    void mostrarInfo(){
        //loop separador
        int i = 0;
        while (i<30){
            System.out.print("-");
            i++;
        }
        //carro
        System.out.println("\nCor : " + this.cor);
        System.out.println("Marca : " + this.marca);
        System.out.println("Modelo : " + this.modelo);
        System.out.println("Velo. Máxima : " + this.velocidadeMax + "KM/h");
        System.out.println("Velo. Atual : " + this.velocidadeAtual + "KM/h");
        //motor
        System.out.println("Tipo do motor : " + this.motor.tipo);
        System.out.println("Potência do motor : " + this.motor.potencia + " Cavalos");
        i = 0;
        while (i<30){
            System.out.print("-");
            i++;
        }
        System.out.println("\n");
    }

}
