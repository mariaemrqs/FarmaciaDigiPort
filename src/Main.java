import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Criando instâncias de medicamentos
        Medicamento dorflex = new Medicamento("Dorflex", 100, 7.99);
        Medicamento nimesulida = new Medicamento("Nimesulida", 80, 11.50);

        //Criando instâncias de funcionários
        Funcionario maria = new Funcionario("Maria", 2050.00);
        Funcionario eduarda = new Funcionario("Eduarda", 2600.00);

        //Criando listas de medicamentos e funcionários
        ArrayList<Medicamento> medicamentos = new ArrayList<>();
        medicamentos.add(dorflex); //Adicionando o medicamento Dorflex
        medicamentos.add(nimesulida); //Adicionando o medicamento Nimesulida

        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(maria); //Adicionando a funcionária Maria
        funcionarios.add(eduarda); //Adicionando a funcionária Eduarda

        //Instanciando a farmácia com as listas de medicamentos e funcionários
        Farmacia farmacia = new Farmacia(medicamentos, funcionarios);

        //Exibindo os medicamentos disponíveis na farmácia com formatação
        System.out.println("\n /---------------------------------------\\ ");
        System.out.println(" |           Farmácia DigiPort           |");
        System.out.println(" \\---------------------------------------/ ");
        System.out.println(" |    >> Medicamentos na farmácia <<     |");
        System.out.println(" |---------------------------------------| ");
        for (Medicamento medicamento : farmacia.getMedicamentos()) {
            //Formatação para alinhar as informações
            String linhaMedicamento = String.format(" | %-17s - R$ %7.2f        |", medicamento.getNome(), medicamento.getPreco());
            System.out.println(linhaMedicamento);
        }

        //Exibindo as funcionárias da farmácia com formatação
        System.out.println(" |---------------------------------------| ");
        System.out.println(" |          >> Funcionárias <<           |");
        System.out.println(" |---------------------------------------| ");
        for (Funcionario funcionario : farmacia.getFuncionarios()) {
            //Formatação para alinhar as informações da funcionária (nome e salário)
            //%-17s alinha o nome à esquerda com até 17 caracteres
            //%7.2f formata o salário com 7 caracteres no total e 2 casas decimais
            String linhaFuncionario = String.format(" | %-17s - R$ %7.2f        |", funcionario.getNome(), funcionario.getSalarioBase());
            System.out.println(linhaFuncionario);
        }

        //Fechando o quadrado
        System.out.println(" \\---------------------------------------/ ");
    }
}