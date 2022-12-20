package models.banco;

import models.cliente.Cliente;
import models.conta.Conta;
import models.conta.ContaCorrente;
import models.conta.ContaPoupanca;
import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Cliente> clientes = new ArrayList<>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void listarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println("Cliente nome: " + cliente.getNome() + " CPF: " + cliente.getCpf());
        }
    }

    public Conta criarContaCorrente(Cliente cliente) {
        Conta conta = new ContaCorrente(cliente);
        return conta;
    }
    public Conta criarContaPoupanca(Cliente cliente) {
        Conta conta = new ContaPoupanca(cliente);
        return conta;
    }

    public Cliente criarClienteCorrente(String nome, String cpf) {
        Cliente cliente = new Cliente(nome, cpf);

        Conta conta = criarContaCorrente(cliente);
        cliente.setConta(conta);
        clientes.add(cliente);
        return cliente;
    }
    public Cliente criarClientePoupanca(String nome, String cpf) {
        Cliente cliente = new Cliente(nome, cpf);

        Conta conta = criarContaPoupanca(cliente);
        cliente.setConta(conta);
        clientes.add(cliente);
        return cliente;
    }

    public void excluirCliente(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                clientes.remove(cliente);
                System.out.println("Cliente removido");
            }
        }
    }

}
