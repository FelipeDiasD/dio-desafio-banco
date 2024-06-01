package org.felipeDias;

import org.felipeDias.exceptions.OperacaoInvalidaException;

public class Conta {

    private static int SEQUENCIAL = 0;
    private static final int AGENCIA_PADRAO = 0;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){

        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor){
        this.saldo -= valor;

    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino, String senha){


            this.sacar(valor);
            contaDestino.depositar(valor);





    }

    protected void imprimirInfos(String cpf, String senha) throws OperacaoInvalidaException {

        if(cpf.equals(cliente.getCpf()) && senha.equals(cliente.getSenha())){
            System.out.println(String.format("Agência: %d", this.agencia));
            System.out.println(String.format("Número: %d", this.numero));
            System.out.println(String.format("Saldo:  %.2f", this.saldo));
            return;
        }
        throw new OperacaoInvalidaException("=====DADOS INVALIDOS=====");


    }


}
