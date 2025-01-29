public class Conta {

    private int agencia;
    private int numero;
    private Cliente titular;
    private double saldo;
    private static int total; //Para que esse atributo seja comun a todos os objetos criados a partir
    // dessa classe usa-se a palavra static, isso também aplica-se aos métodos como no getTotal

    //Aqui no construtor também pode ser feita verificações como está no setAgencia
    public Conta(int agencia, int numero, Cliente titular){
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
        total++;
    }

    void depositar(double valor){
        saldo += valor;
    }

    boolean sacar(double valor){
        if(saldo >= valor){
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    };

    void transferir(double valor, Conta destino){
        boolean transferiuComSucesso = this.sacar(valor);
        if(transferiuComSucesso){
            destino.depositar(valor);
        }
    };

            //Métodos Getters irão retornar valores
            //Métodos Setters irão atribuir valores

    public double getSaldo(){

        return this.saldo;
    };

    public int getAgencia() {

        return agencia;
    };

    public void setAgencia(int agencia) {
        if(agencia > 0){ // A verificação feita aqui pode ser feita também dentro do construtor
            this.agencia = agencia;
        }else {
            System.out.println("A agencia não pode ser menor ou igual a zero(0)");
        }
    };

    public int getNumero(){

        return this.numero;
    };

    public void setNumero(int numero){

        this.numero = numero;
    };

    public Cliente getTitular(){

        return this.titular;
    };

    public void setTitular(Cliente titular){

        this.titular = titular;
    };

    public static int getTotal(){

        return Conta.total;
    };

    @Override
    public String toString() {
        return "Conta: {" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", titular=" + titular +
                ", saldo=" + saldo +
                '}';
    }
};
