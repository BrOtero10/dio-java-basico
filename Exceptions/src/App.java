import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.print("Digite seu nome: ");
            String nome = scanner.next();

            System.out.print("Digite seu sobrenome: ");
            String sobrenome = scanner.next();

            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.print("Digite sua altura: ");
            double altura = scanner.nextDouble();

            System.out.print("Digite sos números de seu Cep: ");
            String cep = FormatadorCepExemplo.formatarCep(scanner.next());

            System.out.println("Olá, me chamo  " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + "cm");
            System.out.println("Meu Cep é " + cep);

            scanner.close();
        } catch (InputMismatchException e) {
            System.err.println("\nOs campos idade e altura precisam ser numéricos!\n");
        } catch (CepInvalidoException e) {
            System.err.println("\nO Cep deve conter 8 dígitos!\n");
        }
    }
}