
import excecao.SacarException;
import models.banco.Banco;
import models.cliente.Cliente;

public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco("JPBanck");
        Cliente cliente01 = banco.criarClienteCorrente("Juju", "0303030");
        Cliente cliente02 = banco.criarClienteCorrente("Ana", "03300297036");
        Cliente cliente3 = banco.criarClientePoupanca("Marcos", "000505444");


        cliente01.getConta().depositar(1200.0);
        try {
            cliente01.getConta().sacar(1500.0);
        } catch (SacarException e) {
            System.out.println("Valor não permitido");
        }

        cliente01.getConta().transferir(350.0, cliente3.getConta());

        cliente01.getConta().imprimirStrato();

        banco.excluirCliente("03300297036");
        banco.listarClientes();
    }
}
