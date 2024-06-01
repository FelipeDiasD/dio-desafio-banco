package org.felipeDias;

import org.felipeDias.exceptions.OperacaoInvalidaException;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente){
        super(cliente);
    }

    @Override
    protected void imprimirInfos(String cpf, String senha) throws OperacaoInvalidaException {
        System.out.println("===Conta Corrente===");
        super.imprimirInfos(cpf, senha);
    }


}
