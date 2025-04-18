package model;

import java.util.Scanner;

public class Menu {

    public void exibirMenu() {
        Scanner scan = new Scanner(System.in);
        Empresa empresa = new Empresa();
        int id;
        float valor;
        String data;
        String descricao;
        int op = 0;

        do{
            System.out.println("================================");
            System.out.println("        MENU FINANCEIRO");
            System.out.println("================================");
            System.out.println("            OPÇÕES");
            System.out.println("================================");
            System.out.println("   1 - CADASTRAR FUNCIONARIO");
            System.out.println("   2 - LISTAR FUNCIONARIOS");
            System.out.println("   3 - EXCLUIR FUNCIONARIO");
            System.out.println("   4 - VER DETALHES DE PAGAMENTO");
            System.out.println("   5 - ADICIONAR EXTRA");
            System.out.println("   6 - ADICIONAR DESCONTO");
            System.out.println("   7 - SAIR");
            System.out.println("=================================");
            op = scan.nextInt();
            scan.nextLine();

            switch (op){
                case 1:
                    System.out.println("==================================");
                    System.out.println("              CADASTRO");
                    System.out.println("==================================");
                    System.out.println(" - Digite o nome do funcionario: ");
                    String nome = scan.nextLine();
                    System.out.println(" - Digite o cargo desse funcionário: ");
                    String cargo = scan.nextLine();
                    System.out.println(" - Digite o salário bruto desse funcionário: ");
                    float salarioBruto = scan.nextFloat();
                    empresa.adicionarFuncionario(nome, cargo, salarioBruto);
                    break;

                case 2:
                    empresa.listarFuncionarios();
                    break;

                case 3:
                    System.out.println("Digite o ID do funcionário a ser excluido: ");
                    id = scan.nextInt();
                    scan.nextLine();

                    empresa.excluirFuncionario(id);
                    break;

                case 4:
                    System.out.println("Digite o ID do funcionário para ver os detalhes de pagamento: ");
                    id = scan.nextInt();
                    scan.nextLine();

                    empresa.listarExtrasDetalhados(id);
                    empresa.listarDescontosDetalhados(id);
                    break;

                case 5:
                    System.out.println("Digite o Id do Funcionario: ");
                    id = scan.nextInt();
                    System.out.println("Digite o valor do Extra: ");
                    valor = scan.nextFloat();
                    scan.nextLine();
                    System.out.println("Digite a data do extra (DD/MM/YYYY)");
                    data = scan.nextLine();
                    System.out.println("Digite a descrição: ");
                    descricao = scan.nextLine();

                    empresa.adicionarExtraParaFuncionario(id,valor,descricao,data);
                    break;

                case 6:
                    System.out.println("Digite o Id do Funcionario: ");
                    id = scan.nextInt();
                    System.out.println("Digite o valor do Desconto: ");
                    valor = scan.nextFloat();
                    scan.nextLine();
                    System.out.println("Digite a data do desconto (DD/MM/YYYY)");
                    data = scan.nextLine();
                    System.out.println("Digite a descrição: ");
                    descricao = scan.nextLine();

                    empresa.adicionarDescontoParaFuncionario(id,valor,descricao,data);
                    break;

                case 7:
                    System.out.println("SAINDO...");
                    break;
            }

        }while (op != 7);

    }
}
