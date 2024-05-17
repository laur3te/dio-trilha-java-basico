import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Número da conta: ");
            int numero = sc.nextInt();
            sc.nextLine();

            System.out.println("Número da Agência: ");
            String agencia = sc.next();
            sc.nextLine();

            System.out.println("Nome do Cliente: ");
            String cliente = sc.next();
            sc.nextLine();

            System.out.println("Saldo do Cliente: ");
            double saldo = sc.nextDouble();

            System.out.println(("Olá " + cliente + ", obrigado por criar uma conta em nosso banco. Agência: " + agencia + ". Conta: " + numero + ". Seu saldo de R$" + saldo + " já está disponível para saque."));
    }
}