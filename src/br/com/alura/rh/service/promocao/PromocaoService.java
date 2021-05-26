package br.com.alura.rh.service.promocao;

import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;
import br.com.alura.rh.validacoes.ValidacaoException;

public class PromocaoService {

    public void promoverFuncionario(Funcionario funcionario, boolean metaBatida){
        Cargo cargoAtual = funcionario.getCargo();
        if(Cargo.GERENTE.equals(cargoAtual)){
            throw new ValidacaoException("Gerente nao pode ser promovido");
        }

        if(metaBatida){
            Cargo proximoCargo = cargoAtual.getProximoCargo();
            funcionario.atualizaCargo(proximoCargo);
        }
        else{
            throw new ValidacaoException("A meta estabelecida nao foi batida");
        }
    }
}
