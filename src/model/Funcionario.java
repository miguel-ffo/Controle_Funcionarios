package model;

public class Funcionario {

    private int idFuncionario;
    private String nome;
    private String cargo;
    private Salario salario;

    public String getCargo() {
    return cargo;    
    }
    
    public int getIdFuncionario() {
        return idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public Salario getSalario() {
        return salario;
    }


    public Funcionario(int idFuncionario, String nome, String cargo, Salario salario) {
        this.idFuncionario = idFuncionario;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return " | ID : " + idFuncionario +
                "\n | Nome : " + nome +
                "\n | Cargo : " + cargo +
                "\n | Salário : " + salario.toString();
    }


}

