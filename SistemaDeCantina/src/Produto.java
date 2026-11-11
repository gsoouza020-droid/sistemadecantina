public class Produto {
    public int codigo;
    public String nome;
    public double precoUnitario;
    public int quantidadeEstoque;

    public Produto(int codigo, String nome, double precoUnitario, int quantidadeEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidadeEstoque = quantidadeEstoque;
    }
}