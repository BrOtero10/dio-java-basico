import java.util.ArrayList;
import java.util.List;

public abstract class Conta {

    private static final int AGENCIA_PADRAO = 1012;
    private static int numeroSequencialConta = 1;

    protected String agencia;
    protected String numero;
    protected double saldo;
    protected Cliente cliente;
    protected List<String> extrato;

    public Conta(Cliente cliente) {
        this.agencia = String.format("%04d", AGENCIA_PADRAO);
        this.numero = String.format("%05d-%01d", (numeroSequencialConta / 10), (numeroSequencialConta % 10));
        numeroSequencialConta++;
        this.extrato = new ArrayList<>();
        this.cliente = cliente;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    protected List<String> getExtrato() {
        return this.extrato;
    }

    public void sacar(double valor) {
        if(this.saldo >= valor && valor > 0) {
            this.saldo -= valor;
            this.extrato.add("Saque: -" + String.format("%.2f", valor));
            System.out.printf("\nSaque de %.2f realizado com sucesso\n", valor);
        }
        else {
            System.out.println("\nSaldo insuficiente!\n");
        }
    }

    public void depositar(double valor) {
        if(valor >= 0) {
            this.saldo += valor;
            this.extrato.add("Depósito: +" + String.format("%.2f", valor));
            System.out.printf("\nValor de %.2f depositado com sucesso\n", valor);
        }
    }

    public void transferir(double valor, Conta contaDestino) {
        if(this.saldo >= valor && valor > 0) {
            this.saldo -= valor;
            contaDestino.saldo += valor;
            this.extrato.add("Transferencia para " + contaDestino.cliente.getNome() + ": -" + String.format("%.2f", valor));
            contaDestino.extrato.add("Valor recebido de " + this.cliente.getNome() + ": +" + String.format("%.2f", valor));
        }
    }

    protected void exibirInfo() {
        System.out.println(
            "\n----\t----\t----\t----\tDados da Conta\t----\t----\t----\t----\t----\n"
            + "\nNome do usuário: " + this.cliente.getNome()
            + "\nCPF do usuário: " + this.cliente.getCpf()
            + "\nAgencia: " + this.agencia
            + "\nNúmero da conta: " + this.numero
            + "\nSaldo disponível: " + String.format("%.2f", this.saldo)
            + "\n\n----\t----\t----\t----\t----- -- -----\t----\t----\t----\t----\t----\n"
        );
    }
    
    public abstract void exibirExtrato();
}