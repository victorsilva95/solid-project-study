package br.com.alura.rh.service.reajuste.validacoes;

import br.com.alura.rh.validacoes.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriodoReajusteService implements ValidacaoReajuste {

    public void validacaoReajuste(Funcionario funcionario, BigDecimal aumento){
        LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();
        long mesesReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
        if(mesesReajuste < 6){
            throw new ValidacaoException("Reajuste nao pode ser feito em 6 meses antes do ultimo reajuste");
        }
    }
}
