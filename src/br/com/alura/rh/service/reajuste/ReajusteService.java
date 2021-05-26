package br.com.alura.rh.service.reajuste;

import br.com.alura.rh.model.Funcionario;
import br.com.alura.rh.service.reajuste.validacoes.ValidacaoReajuste;

import java.math.BigDecimal;
import java.util.List;

public class ReajusteService {

    private final List<ValidacaoReajuste> validacaoReajustes;

    public ReajusteService(List<ValidacaoReajuste> validacaoReajustes) {
        this.validacaoReajustes = validacaoReajustes;
    }

    public void reajustarSalario (Funcionario funcionario, BigDecimal aumento){
        validacaoReajustes.forEach(validacaoReajuste -> validacaoReajuste.validacaoReajuste(funcionario, aumento));
        BigDecimal novoSalario = funcionario.getSalario().add(aumento);
        funcionario.atualizaSalario(novoSalario);
    }
}
