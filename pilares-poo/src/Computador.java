import java.util.Scanner;

public class Computador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Abrindo um serviço qualquer
        ServicoMensagemInstantanea smi = null;
        System.out.println("Escolha um serviço:");
        System.out.println("M - MSN Messenger");
        System.out.println("F - Facebook Messenger");
        System.out.println("T - Telegram");
        
        boolean loop = true;

        do {
            loop = false;
            System.out.print("Digite: ");
            char escolha = scanner.next().charAt(0);

            switch (Character.toUpperCase(escolha)) {
                case 'M':
                    smi = new MSNMessenger();
                    break;
                case 'F':
                    smi = new FacebookMessenger();
                    break;
                case 'T':
                    smi = new Telegram();
                    break;
                default:
                    System.out.println("Opção Inválida!\n");
                    loop = true;
                    break;
            }
        } while(loop);

        System.out.println();
        smi.enviarMensagem();
        smi.receberMensagem();
        System.out.println();

        scanner.close();
    }
}
