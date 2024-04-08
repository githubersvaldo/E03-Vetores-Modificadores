
public class main {

    public static void imprimir(Conta conta1){
        System.out.println("Nome do Cliente: " + conta1.dono.MostrarNome());
        System.out.println("CPF do Cliente: " + conta1.dono.MostrarCpf());
        if (conta1.dono.MostrarSexo() == 'm') {
            System.out.println("Sexo do Cliente: Masculino");
        } else if (conta1.dono.MostrarSexo() == 'f') {
            System.out.println("Sexo do Cliente: Feminino");
        }
        System.out.println("Endereço do Cliente: " + conta1.dono.MostrarEndereco());
        System.out.println("Idade do Cliente: " + conta1.dono.MostrarIdade());
        System.out.println("Número da conta: " + conta1.MostrarNumero());
        System.out.printf("Saldo atual: %.2f\n",conta1.MostrarSaldo());
        System.out.printf("Limite: %.2f\n",conta1.MostrarLimite());
    }

    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.dono.MudarNome("João");
        conta1.dono.MudarSexo('m');
        conta1.dono.MudarIdade(25);
        conta1.dono.MudarCpf("123456789-10");
        conta1.dono.MudarEndereco("Rua Deu Ruim nº30 Bairro Vaida Bom");
        conta1.MudarAgencia("222-2");
        conta1.MudarNumero(1234);
        conta1.depositar(2000);
        conta1.MudarLimite(conta1.MostrarSaldo() + 500);
        imprimir(conta1);
        conta1.Extrato(conta1);

    }
}