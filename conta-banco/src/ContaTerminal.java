import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite sua agencia:");
        String agencia = scanner.nextLine();

        System.out.println("Digite o numero da conta:");
        int conta = scanner.nextInt();

        System.out.println("Qual seu saldo inicial?");
        float saldo = scanner.nextFloat();

        System.out.println("Olá " +  nome + "!, obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " e sua conta é " + conta + " e seu saldo atual é de R$" + saldo + " já está disponível para saque");

    }
}
