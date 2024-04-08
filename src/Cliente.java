public class Cliente {
    private String nome;
    private String CPF;
    private String endereco;
    private int idade;
    private char sexo;
    public String MostrarNome(){
        return nome;
    }
    public void MudarNome(String NovoNome){
        nome = NovoNome;
    }
    public String MostrarCpf(){
        return CPF;
    }
    public void MudarCpf(String NovoCpf){
        CPF = NovoCpf;
    }
    public String MostrarEndereco(){
        return endereco;
    }
    public void MudarEndereco(String Novoendereco){
        endereco = Novoendereco;
    }
    public int MostrarIdade(){
        return idade;
    }
    public void MudarIdade(int NovaIdade){
        idade = NovaIdade;
    }
    public char MostrarSexo(){
        return sexo;
    }
    public void MudarSexo(char NovoSexo){
        sexo = NovoSexo;
    }
}