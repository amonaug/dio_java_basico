import java.util.Scanner;

public class Conta_Terminal{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Para criar sua conta vamos precisar das seguintes informações: ");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Agência: ");
        String agencia = scanner.nextLine();
        System.out.print("Numero: ");
        String numero = scanner.nextLine();
        System.out.print("Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, seu saldo é %.2f e o numero da sua conta " +
                "é %s", nome, agencia, saldo, numero);
    }
}
