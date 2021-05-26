package br.com.alura.rh.service.reajuste.validacoes;

import br.com.alura.rh.validacoes.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValidacaoPercentualReajusteService implements ValidacaoReajuste {

    public void validacaoReajuste(Funcionario funcionario, BigDecimal aumento){
        BigDecimal salario = funcionario.getSalario();
        BigDecimal percentualReajuste = aumento.divide(salario, RoundingMode.HALF_UP);
        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
        }
    }
}
