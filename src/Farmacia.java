import java.util.List;

public class Farmacia {

    private double lucro;
    private List<Medicamento> medicamentos; // Lista de medicamentos da farmácia
    private List<Funcionario> funcionarios; // Lista de funcionários da farmácia

    //Construtor para inicializar a farmácia com uma lista de medicamentos e funcionários
    public Farmacia(List<Medicamento> medicamentos, List<Funcionario> funcionarios) {
        this.medicamentos = medicamentos;
        this.funcionarios = funcionarios;
        this.lucro = 0.0; //Inicializa o lucro com zero
    }

    //Getter para acessar o lucro da farmácia
    public double getLucro() {
        return lucro;
    }

    //Setter para definir o lucro da farmácia
    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

    //Getter para acessar a lista de medicamentos
    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    //Setter para alterar a lista de medicamentos
    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    //Getter para acessar a lista de funcionários
    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    //Setter para alterar acessar a lista de funcionários
    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
}

