import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da sua Conta !");
        int numeroConta = read.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = read.next();

        System.out.println("Por favor, digite o seu Nome !");
        String nomeCliente = read.next();

        read.nextLine();

        System.out.println("Por favor, digite um valor para depósito !");
        Double saldo = read.nextDouble();

        String response = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numeroConta, saldo);

        System.out.println(response);

        read.close();
    }
}
