public class Cliente {

    private String nome;
    private String endereco;
    private String cpf;
    private int telefone;
    private double salario;

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome(){
        return this.nome;
    };

    public void setNome(String nome){
        this.nome = nome;
    };

    public String getEndereco(){
        return this.endereco;
    };

    public void setEndereco(String endereco){
        this.endereco = endereco;
    };

    public String getCpf(){
        return this.cpf;
    };

    public void setCpf(String cpf){
        this.cpf = cpf;
    };

    public int getTelefone(){
        return this.telefone;
    };

    public void setTelefone(int telefone){
        this.telefone = telefone;
    };

    public double getSalario(){
        return this.salario;
    };

    public void setSalario(double salario){
        this.salario = salario;
    };

    @Override
    public String toString() {
        return "Cliente: {" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
