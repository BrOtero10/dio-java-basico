public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void exibirExtrato() {
        System.out.println("Imprimindo extrato de conta corrente:\n");
        this.getExtrato().forEach(System.out::println);
        System.out.println("\nSaldo atual: " + String.format("%.2f", this.getSaldo()) + '\n');
    }
}
