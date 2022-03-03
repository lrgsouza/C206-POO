public class Exercicio_02_Carro {
    public static void main(String[] args) {

        //criando carros
        Carro fusca = new Carro("Branco", "VW", "Fusca", 140.00 , 20.00, 100, "4 Válvulas");
        Carro porsche = new Carro("Vinho", "Porsche", "Carrera 911", 320.00 , 90.00, 350, "V8");

        //mostrando informações
        fusca.mostrarInfo();
        porsche.mostrarInfo();

        //ligando carros
        fusca.ligar();
        porsche.ligar();

        //acelerando carros
        fusca.acelerar();
        porsche.acelerar();

    }
}
