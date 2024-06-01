package org.felipeDias;

import org.felipeDias.exceptions.OperacaoInvalidaException;

public class ContaPoupança extends Conta{

    public ContaPoupança(Cliente cliente){
        super(cliente);
    }

    @Override
    protected void imprimirInfos(String cpf, String senha) throws OperacaoInvalidaException {
        System.out.println("===Conta Poupança===");
        super.imprimirInfos(cpf, senha);
    }
}
