public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void exibirExtrato() {
        System.out.println("Imprimindo extrato de conta poupança:\n");
        this.getExtrato().forEach(System.out::println);
        System.out.println("\nSaldo acumulado: " + String.format("%.2f", this.getSaldo()) + '\n');
    }
}