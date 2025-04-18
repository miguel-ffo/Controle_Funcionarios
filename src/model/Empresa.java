package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Funcionario> funcionarios = new ArrayList<>();


    public void adicionarFuncionario(String nome, String cargo, float salarioBruto) {
        int novoId = calcularNovoId();

        Salario salario = new Salario(salarioBruto);
        Funcionario novoFuncionario = new Funcionario(novoId, nome, cargo, salario);
        funcionarios.add(novoFuncionario);



        System.out.println("\n Funcionário adicionado: ");
        System.out.println("=========================");
        System.out.println(novoFuncionario);
        System.out.println("=========================");

    }

    public void listarFuncionarios() {

        System.out.println("\n Lista de Funcionários: ");
        for (Funcionario f : funcionarios){
            System.out.println(" =========================");
            System.out.println(f);
        }
        System.out.println(" =========================");

    }

    public void excluirFuncionario(int idFuncionario) {
        Funcionario funcionarioParaRemover = null;

        for (Funcionario f : funcionarios) {
            if (f.getIdFuncionario() == idFuncionario) {
                funcionarioParaRemover = f;
                break;
            }
        }

        if (funcionarioParaRemover != null) {
            funcionarios.remove(funcionarioParaRemover);
            System.out.println("\nFuncionário removido com sucesso:");
            System.out.println(funcionarioParaRemover);
        } else {
            System.out.println("\nFuncionário com ID " + idFuncionario + " não encontrado.");
        }
    }



    private int calcularNovoId() {
        int novoId;
        if ( funcionarios.isEmpty()){
            novoId = 1;

        } else {
            novoId = funcionarios.size() + 1;

        }
        return novoId;
    }

    public void adicionarDescontoParaFuncionario(int idFuncionario, float valor, String descricao, String data) {
        for (Funcionario f : funcionarios) {
            if (f.getIdFuncionario() == idFuncionario) {
                f.getSalario().adicionarDesconto(valor, descricao, data);
                System.out.println("Desconto de R$" + valor + " adicionado para " + f.getNome());
                return;
            }
        }
        System.out.println("Funcionário com ID " + idFuncionario + " não encontrado.");
    }

    public void adicionarExtraParaFuncionario(int idFuncionario, float valor, String descricao, String data) {
        for (Funcionario f : funcionarios) {
            if (f.getIdFuncionario() == idFuncionario) {
                f.getSalario().adicionarExtra(valor, descricao, data);
                System.out.println("Extra de R$" + valor + " adicionado para " + f.getNome());
                return;
            }
        }
        System.out.println("Funcionário com ID " + idFuncionario + " não encontrado.");
    }

    public void listarDescontosDetalhados(int idFuncionario) {
        for (Funcionario f : funcionarios) {
            if(f.getIdFuncionario() == idFuncionario) {
                f.getSalario().listarDescontos();
            }

        }
    }

    public void listarExtrasDetalhados(int idFuncionario) {
        for (Funcionario f : funcionarios) {
            if(f.getIdFuncionario() == idFuncionario) {
                f.getSalario().listarExtras();
            }

        }
    }

}

