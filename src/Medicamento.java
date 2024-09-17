public class Medicamento {

    private String nome;
    private int quantidadeEmEstoque;
    private double preco;

    //Construtor para inicializar o nome, quantidade em estoque e preço do medicamento
    public Medicamento(String nome, int quantidadeEmEstoque, double preco) {
        this.nome = nome;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.preco = preco;
    }

    //Getter para acessar o nome do medicamento
    public String getNome() {
        return nome;
    }

    //Setter para alterar o nome do medicamento
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Getter para acessar a quantidade em estoque do medicamento
    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    //Setter para alterar a quantidade em estoque do medicamento
    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    //Getter para acessar o preço do medicamento
    public double getPreco() {
        return preco;
    }

    //Setter para alterar o preço do medicamento
    public void setPreco(double preco) {
        this.preco = preco;
    }
}

