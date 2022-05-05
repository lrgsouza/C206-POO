package collections;

public class Produto implements Comparable<Produto> {
    public String nome;
    public Double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }


    //FAZ ORDENAÇÃO POR PREÇO
    @Override
    public int compareTo(Produto o) {
        return Double.compare(this.preco, o.preco);
    }
    //FAZ ORDENAÇÃO POR NOME
//    @Override
//    public int compareTo(Produto o) {
//        return nome.compareTo(o.nome);
//    }

}


