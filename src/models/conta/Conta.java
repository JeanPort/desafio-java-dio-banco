package models.conta;

import excecao.SacarException;
import models.cliente.Cliente;

public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 222;
    private static int SEQUENCIAL = 1;

    protected Cliente cliente;
    protected int agencia;
    protected int numero;
    protected double saldo;
    public Conta(Cliente cliente) {
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

    @Override
    public void sacar(double valor)throws SacarException {
        if (valor > saldo){
            throw new SacarException();
        } else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso! ");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        try {
            sacar(valor);
        } catch (SacarException e) {
            System.out.println("Valor não  permitido!");
            valor = 0.0;
        }
        contaDestino.depositar(valor);
    }
}
