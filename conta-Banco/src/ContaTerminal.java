import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Exibir as mensagens para o nosso usuário
        System.out.println("Bem-vindo! Vamos criar uma conta.");

        // Obter os valores digitados no terminal
        System.out.print("Digite o nome do titular da conta: ");
        String nomeTitular = scanner.nextLine();

        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Digite o saldo inicial da conta: ");
        double saldo = scanner.nextDouble();

        // Exibir mensagem da conta criada
        System.out.println("\nConta criada com sucesso:");
        System.out.println("Titular: " + nomeTitular);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo: R$ " + saldo);

        scanner.close();
    }
}
