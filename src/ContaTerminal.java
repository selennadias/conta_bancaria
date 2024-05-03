import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
 
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("********************************************************");
        System.out.println("                 Conta Bancária                         ");
        System.out.println("                                                        ");
        System.out.println("********************************************************");
        System.out.println("                                                        ");

        System.out.print("    Informe a agencia ");
        agencia = scanner.next();
        System.out.println("                                                        ");

        System.out.println("********************************************************");
        System.out.println("                                                        ");

        System.out.print("   Informe o numéro ");
        numero = scanner.nextInt();
        System.out.println("                                                        ");

        System.out.println("********************************************************");
        System.out.println("                                                        ");

        System.out.print("    Digite seu nome: ");
        nomeCliente = scanner.next();

        System.out.println("                                                        ");
        System.out.println("********************************************************");
        System.out.println("                                                        ");

        System.out.print("    Digite seu Saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("                                                        ");
        System.out.print("********************************************************");
        System.out.println("                                                        ");

        System.out.printf(" Olá %s (:  \n"
                + " Obrigado por criar uma conta em nosso banco! \n"
                + "Sua agência é %s,\n "
				+ "Conta %d, \n"
                + "Seu saldo %.2f já está disponível para saque!!!", nomeCliente, agencia, numero, saldo);
        System.out.println("                                                        ");
        System.out.println("                                                        ");
		scanner.close();




    }
}
