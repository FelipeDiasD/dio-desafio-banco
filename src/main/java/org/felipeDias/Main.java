package org.felipeDias;

import org.felipeDias.exceptions.OperacaoInvalidaException;

public class Main {
    public static void main(String[] args) throws OperacaoInvalidaException {

        Cliente clienteNovo = new Cliente("Mauro", "510022054500", "12345");
        Conta cc = new ContaCorrente(clienteNovo);
        Conta cp = new ContaPoupança(clienteNovo);

        try {
             cp.imprimirInfos("510022054500", "12345");
             cc.imprimirInfos("510022054500","123451" );
         }

        catch (OperacaoInvalidaException e){
            System.out.println(e.getMessage());
        }



    }
}