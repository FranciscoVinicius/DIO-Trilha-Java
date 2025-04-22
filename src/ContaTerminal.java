import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia, nomeCliente;
        int saldo;
        
        // Criação de um objeto Scanner para ler a entrada do usuário

        System.out.println("Por favor, digite o seu nome");
        Scanner scanner = new Scanner(System.in);
        nomeCliente = scanner.nextLine();
        System.out.println("Fico feliz em ter você conosco " + nomeCliente);
        
        System.out.println("Por favor " +nomeCliente+ ", digite o número da Agência");
        agencia = scanner.nextLine();

        System.out.println("Por favor " +nomeCliente+ ", digite o número da Conta");
        numero = scanner.nextInt();
        scanner.nextLine();

        Random random = new Random();
        saldo = random.nextInt(5000);// Gera um saldo aleatório entre 0 e 5000

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "+numero+ " e seu saldo "+saldo+" já está disponível para saque");
    }
}
