package br.com.alura.rh.service.reajuste.validacoes;

import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {

    void validacaoReajuste(Funcionario funcionario, BigDecimal aumento);
}
