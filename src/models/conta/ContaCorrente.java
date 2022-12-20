package models.conta;

import models.cliente.Cliente;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirStrato() {
        System.out.println("Titular: " + cliente.getNome());
        System.out.println("Extrato conta: " + this.numero);
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Saldo: " + this.saldo);
    }
}
