import java.time.LocalDate;
import java.time.Month;

public class Banco {
    public static void main(String[] args) {
        Cliente jose = new Cliente("José Antônio de Souza", "149.507.123-80", LocalDate.of(1982, Month.JULY, 17));
        Cliente maria = new Cliente("Maria da Silva Santos", "507.180.149-23", LocalDate.of(1995, Month.DECEMBER, 31));

        Conta contaPoupancaJose = new ContaPoupanca(jose);
        Conta contaCorrenteJose = new ContaCorrente(jose);
        Conta contaCorrenteMaria = new ContaCorrente(maria);

        contaCorrenteJose.depositar(8675.50);
        contaPoupancaJose.depositar(20000.00);
        contaCorrenteMaria.depositar(1600.00);
        contaPoupancaJose.transferir(500, contaCorrenteMaria);
        contaCorrenteJose.sacar(1500.00);

        contaCorrenteJose.exibirInfo();
        contaPoupancaJose.exibirInfo();
        contaCorrenteMaria.exibirInfo();

        contaCorrenteJose.exibirExtrato();
        contaPoupancaJose.exibirExtrato();
        contaCorrenteMaria.exibirExtrato();
    }
}