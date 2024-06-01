
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       String nome_cliente = "";
       String agencia = "";
       int numero_conta = 0;
       double saldo = 0.0;

        System.out.println("Por favor insira seu nome : ");
        nome_cliente = scanner.next();

        System.out.println("Por favor insira o numero da conta : ");
        numero_conta = scanner.nextInt();

        System.out.println("Por favor insira o numero da Agencia : ");
        agencia = scanner.next();

        System.out.println("Por favor insira o saldo : ");
        saldo = scanner.nextDouble();


        System.out.println("Ola " + nome_cliente + " obrigador por criar uma conta em nosso banco, sua agencia e : " + agencia + " conta : " + numero_conta + " e seu saldo e :" + saldo);

    }
}