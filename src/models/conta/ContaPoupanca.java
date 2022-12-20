package models.conta;

import models.cliente.Cliente;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirStrato() {
        System.out.println("models.conta.Conta poupança");
        System.out.println("Titular: " + cliente.getNome());
        System.out.println("Extrato conta: " + this.numero);
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Saldo: " + this.saldo);
    }
}
