public class Exercicio_01_Estoque {
    public static void main(String[] args) {

        //cadastrando produtos utilizando construtor
        Produto banana = new Produto(300,220,"Banana", "Horti-Fruti", 225);
        Produto cerveja = new Produto(200, 510,"Cerveja Pilsen","Bebidas alcoólicas", 150);

        //mostrando informações
        banana.mostraInfo();
        cerveja.mostraInfo();

    }
}
