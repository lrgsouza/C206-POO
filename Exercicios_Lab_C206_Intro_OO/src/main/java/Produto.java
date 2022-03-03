public class Produto {
        //atributos
        int codigoSerie;
        int codigoProduto;
        String nome;
        String categoria;
        int quantidade;

        Produto(int codigoSerie, int codigoProduto, String nome , String categoria, int quantidade){
            this.codigoSerie = codigoSerie;
            this.codigoProduto = codigoProduto;
            this.nome = nome;
            this.categoria = categoria;
            this.quantidade = quantidade;
        }

        void mostraInfo(){
            //loop separador
            int i = 0;
            while (i<30){
                System.out.print("-");
                i++;
            }
            //mostrando informações
            System.out.println(
                    "\nNome = " + this.nome
                    + "\nCódigo do produto = " + this.codigoProduto
                    + "\nCódigo de série = " + this.codigoSerie
                    + "\nCategoria = " + this.categoria
                    + "\nQuantidade = " + this.quantidade
            );
            //loop separador
            i = 0;
            while (i<30){
                System.out.print("-");
                i++;
            }
            System.out.println("\n");
        }

}
