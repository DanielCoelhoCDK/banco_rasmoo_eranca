public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int numero, Cliente titular){
        super(agencia, numero, titular);
    };

    @Override
    boolean sacar(double valor) {
        double novoValor = valor + 2;
        return super.sacar(novoValor);
    };
};
