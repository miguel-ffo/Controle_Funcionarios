package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Salario {

    private float salarioBruto;
    private List<Desconto> descontos = new ArrayList<>();
    private List<Extra> extras = new ArrayList<>();

    public Salario(float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public void adicionarDesconto(float valor, String descricao, String data) {
        descontos.add(new Desconto(valor, descricao, data));
    }

    public void adicionarExtra(float valor, String descricao, String data) {
        extras.add(new Extra(valor, descricao, data));
    }

    public float getSalarioBruto() {
        return salarioBruto;
    }

    public float getTotalDescontos() {
        float total = 0;
        for (Desconto d : descontos) {
            total += d.getValor();
        }
        return total;
    }

    public float getTotalExtras() {
        float total = 0;
        for (Extra e : extras) {
            total += e.getValor();
        }
        return total;
    }

    public float getSalarioLiquido() {
        return salarioBruto + getTotalExtras() - getTotalDescontos();
    }

    public void listarDescontos() {
        System.out.println("\n Detalhes dos Descontos: ");
        for (Desconto d : descontos){
            System.out.println(" " + d);
        }
    }

    public void listarExtras() {
        System.out.println("\n Detalhes dos Descontos: ");
        for (Extra e : extras){
            System.out.println(" " + e);
        }
    }

    @Override
    public String toString() {
        return  "\n    - Salário Bruto : " + salarioBruto +
                "\n    - Total Descontos : " + getTotalDescontos() +
                "\n    - Total Extras : " + getTotalExtras() +
                "\n    - Salário Líquido : " + getSalarioLiquido();
    }
}
