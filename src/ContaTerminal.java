import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Usando try-with-resources para garantir o fechamento do Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitando e armazenando os dados
            System.out.println("Por favor, digite o número da Conta:");
            int numero = scanner.nextInt();

            // Consumir a quebra de linha pendente após nextInt
            scanner.nextLine();

            System.out.println("Por favor, digite o número da Agência:");
            String agencia = scanner.nextLine();

            System.out.println("Por favor, digite o nome do Cliente:");
            String nomeCliente = scanner.nextLine();

            System.out.println("Por favor, digite o saldo da Conta:");
            double saldo = scanner.nextDouble();

            // Exibindo a mensagem final com concatenação
            System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao ler os dados: " + e.getMessage());
        }
    }
}
