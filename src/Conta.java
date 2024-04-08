public class Conta {

    //Total de Contas
    private int totalcontas = 0;
    //variavel que quarda os dados do cliente
    Cliente dono = new Cliente();
    //variavel que armazena o saldo da conta
    private double saldo;
    //variavel que armazena o numero da conta
    private int numero;
    //variavel que quarda o numero da agência
    private String agencia;
    //variavel que quarda o limite de saque e deposito e transferencia da Conta
    private double limite;
    //variavel que representa o numero de operaçoes na conta
    private int ops = 0;
    public Conta(){
        this.totalcontas++;
    }
    //Array para o registro da operação
    Operacao[] Operas = new Operacao[1000];
    //registra o deposito
    public boolean depositar(double valor) {
        if(valor > 0.0) {
            this.saldo += valor;
            this.ops++;
            this.Operas[this.ops] = new Operacao('d', valor);

            return true;
        } else {
            return false;
        }
    }

    //Faz o saque da conta
    public boolean sacar(double valor) {
        if(valor > 0.0 && valor <= this.saldo) {
            this.saldo -= valor;
            this.ops++;
            this.Operas[this.ops] = new Operacao('s', valor);
            return true;
        } else {
            return false;
        }
    }

    //faz a transferencia de dinheiro entre contas
    public boolean transferir(Conta contaDestino, double valor) {
        boolean saqueRealizado = this.sacar(valor);
        if(saqueRealizado) {
            boolean depositoRealizado = contaDestino.depositar(valor);
            return depositoRealizado;
        } else {
            return false;
        }
    }
    public double MostrarSaldo(){
        return saldo;
    }
    public int MostrarNumero(){
        return numero;
    }
    public String MostrarAgencia(){
        return agencia;
    }
    public double MostrarLimite(){
        return limite;
    }
    public void MudarAgencia(String NovaAgencia){
        this.agencia = NovaAgencia;
    }
    public void MudarLimite(double limite){
        this.limite = limite;
    }
    public void MudarNumero(int NovoNumero){
        this.numero = NovoNumero;
    }
    public void Extrato(Conta conta){
        for(int i = 0; i < ops; i++) {
            System.out.println(conta.Operas[i].MostrarData() + " " + conta.Operas[i].MostrarTipo() + " " + conta.Operas[i].MostrarValor());
        }
    }
}