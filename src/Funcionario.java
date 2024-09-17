public class Funcionario {

    private String nome;
    private double salarioBase;
    private int bonus;

    //Construtor para inicializar o nome e o salário base do funcionário - parametros essenciais para a criação de um Funcionario
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.bonus = 0; // Inicializa o bônus com zero
    }

    //Getter para acessar o nome do funcionário
    public String getNome() {
        return nome;
    }

    //Setter para alterar o nome do funcionário
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Getter para acessar o salário base do funcionário
    public double getSalarioBase() {
        return salarioBase;
    }

    //Setter para alterar o salário base do funcionário
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    //Getter para acessar o bônus do funcionário
    public int getBonus() {
        return bonus;
    }

    //Setter para alterar o bônus do funcionário
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
