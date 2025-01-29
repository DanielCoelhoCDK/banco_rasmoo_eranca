public class TesteHeranca {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Caleb","67258360387");
        ContaCorrente cc = new ContaCorrente(1035,1986, cliente);
        ContaPoupanca cp = new ContaPoupanca(1035, 1987, cliente);

        cc.depositar(1000);
        cp.depositar(10000);

        cc.sacar(100);
        cp.sacar(1000);
        cp.transferir(500, cc);
        cc.transferir(100, cp);

        System.out.println(cc);
        System.out.println(cp);

        System.out.println("Saldo conta corrente "+cc.getSaldo());
        System.out.println("Saldo conta poupança "+cp.getSaldo());
    }

}
