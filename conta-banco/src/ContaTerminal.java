import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        String agencia = "";
        int numero = 0;
        String nomeCliente = "";
        double saldo = 0;
       
        System.out.print("Digite seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Digite o número da agência: ");
        agencia = scanner.nextLine();

        System.out.print("Digite o número da conta: ");
        numero = scanner.nextInt();

        System.out.print("Digite seu saldo: ");
        saldo = scanner.nextDouble();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
        agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        scanner.close();
    }
}
