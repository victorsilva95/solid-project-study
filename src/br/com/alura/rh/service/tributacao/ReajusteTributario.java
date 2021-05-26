package br.com.alura.rh.service.tributacao;

import java.math.BigDecimal;

public interface ReajusteTributario extends Reajuste{
    BigDecimal valorImpostoDeRenda();

}
