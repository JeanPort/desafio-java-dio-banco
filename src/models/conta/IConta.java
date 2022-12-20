package models.conta;

import excecao.SacarException;
import models.conta.Conta;

public interface IConta {
    public void sacar(double valor) throws SacarException;
    public void depositar(double valor);
    public void transferir(double valor, Conta contaDestino);
    public void imprimirStrato();
}
