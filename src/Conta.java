public class Conta {

    //variavel que quarda os dados do cliente
    Cliente dono = new Cliente();
    //variavel que armazena o saldo da conta
    double saldo;
    //variavel que armazena o numero da conta
    int numero;
    //variavel que quarda o numero da agência
    String agencia;
    //variavel que quarda o limite de saque e deposito e transferencia da Conta
    double limite;

    //registra o deposito
    boolean depositar(double valor) {
        if(valor > 0.0) {
            this.saldo += valor;
            return true;
        } else {
            return false;
        }
    }

    //Faz o saque da conta
    boolean sacar(double valor) {
        if(valor > 0.0 && valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    //faz a transferencia de dinheiro entre contas
    boolean transferir(Conta contaDestino, double valor) {
        boolean saqueRealizado = this.sacar(valor);
        if(saqueRealizado) {
            boolean depositoRealizado = contaDestino.depositar(valor);
            return depositoRealizado;
        } else {
            return false;
        }
    }
}