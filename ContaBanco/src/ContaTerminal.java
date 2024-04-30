import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome_cliente = teclado.nextLine();

        System.out.println("Digite o número da sua conta");
        int numero = teclado.nextInt();

        
        System.out.println("Digite seu saldo");
        double saldo = teclado.nextDouble();

        System.out.println("Digite a agência da sua conta");
        int agencia = teclado.nextInt();

        System.out.println("Segue seus dados:");
        

        System.out.println("Numero:" + numero);
        System.out.println("Nome:" + nome_cliente);
        System.out.println("Saldo:" + saldo);
        System.out.println("Agencia:" + agencia);

    }
}
