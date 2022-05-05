package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Banana",4.99);
        Produto p2 = new Produto("Arroz",17.99);
        Produto p3 = new Produto("Carne",39.99);
        Produto p4 = new Produto("Sabão",1.99);
        Produto p5 = new Produto("Vassoura",24.99);

        ArrayList<Produto> CarrinhoDeCompras = new ArrayList<>();
        CarrinhoDeCompras.add(p1);
        CarrinhoDeCompras.add(p2);
        CarrinhoDeCompras.add(p3);
        CarrinhoDeCompras.add(p4);
        CarrinhoDeCompras.add(p5);

        for (Produto produto: CarrinhoDeCompras ) {
            System.out.println("Produto: "+produto.nome);
            System.out.println("Preço: "+produto.preco);
        }
        //ordenando (preco crescente/Nome) ==> devido ao override a função de comparar por nome esta comentada na classe
        System.out.println("=================================");
        Collections.sort(CarrinhoDeCompras);
        for (Produto produto: CarrinhoDeCompras ) {
            System.out.println("Produto: "+produto.nome);
            System.out.println("Preço: "+produto.preco);
        }

        //ordenando por preco decrescente
        Collections.reverse(CarrinhoDeCompras);
        System.out.println("=================================");
        for (Produto produto: CarrinhoDeCompras ) {
            System.out.println("Produto: "+produto.nome);
            System.out.println("Preço: "+produto.preco);
        }

    }
}
