package model;

import java.time.LocalDate;

public class Desconto {
    private float valor;
    private String descricao;
    private String data;

    public Desconto(float valor, String descricao, String data) {
        this.valor = valor;
        this.descricao = descricao;
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return "- R$" + valor + " | " + descricao + " | " + data;
    }
}
