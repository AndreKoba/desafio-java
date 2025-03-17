    import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando um objeto Scanner para capturar entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando e capturando o número da agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        // Solicitando e capturando o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        String numeroConta = scanner.nextLine();

        // Solicitando e capturando o nome do cliente
        System.out.println("Por favor, digite o Nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        // Solicitando e capturando o saldo
        System.out.println("Por favor, digite o Saldo:");
        double saldo = scanner.nextDouble();

        // Fechando o Scanner após a leitura
        scanner.close();

        // Construindo a mensagem final usando concatenação
        String mensagem = "Olá ".concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agencia)
                .concat(", conta ")
                .concat(numeroConta)
                .concat(" e seu saldo ")
                .concat(String.valueOf(saldo)) // Convertendo o saldo para String
                .concat(" já está disponível para saque.");

        // Exibindo a mensagem final
        System.out.println(mensagem);
    }
}
