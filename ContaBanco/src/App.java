import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Impede erro que estáva dando ao usar "." com números decimais

        ContaTerminal contaTerminal = new ContaTerminal();

        System.out.print("Insira o número da agência: ");
        contaTerminal.setAgencia(scanner.next());

        System.out.print("Insira o número da conta: ");
        contaTerminal.setNumero(scanner.nextInt());

        // Capturar quebra de linha!
        scanner.nextLine();

        System.out.print("Insira o nome do cliente: ");
        contaTerminal.setNomeCliente(scanner.nextLine());

        System.out.print("Insira o saldo da conta: ");
        contaTerminal.setSaldo(scanner.nextDouble());

        scanner.close();

        System.out.println("\nOlá " + contaTerminal.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + contaTerminal.getAgencia() + ", conta " + contaTerminal.getNumero() + " e seu saldo " + contaTerminal.getSaldo() + " já está disponível para saque.\n");
    }
}
