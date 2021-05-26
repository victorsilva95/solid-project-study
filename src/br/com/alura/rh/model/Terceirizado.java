package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Terceirizado {
    private DadosPessoais dadosPessoais;
    private String empresa;


    public Terceirizado(DadosPessoais dadosPessoais) { this.dadosPessoais = dadosPessoais; }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
