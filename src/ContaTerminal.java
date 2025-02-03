import java.util.Scanner;

public class ContaTerminal {

    String nomeCliente;
    int numeroConta;
    String agencia;
    double saldo;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       //Importar Scanner
       System.out.println("Bem Vindo ao seu Banco Digital!");
       //Exibir mensagem de boas vindas
       System.out.println("Bem-vindo ao Banco Digital!");
       //Obter valores de entrada
       System.out.print("Digite seu nome: ");
       String nomeCliente = scanner.nextLine();

       System.out.print("Digite o número da conta: ");
       int numeroConta = scanner.nextInt();

       scanner.nextLine(); // Consumir a quebra de linha pendente

       System.out.print("Digite a agência: ");
       String agencia = scanner.nextLine();

       System.out.print("Digite o saldo inicial: ");
       double saldo = scanner.nextDouble();
       //Exibir mensagem de conta criada
       System.out.println("\nConta criada com sucesso!");
       System.out.println("Olá, " + nomeCliente + "! Sua conta " + numeroConta + " da agência " + agencia + 
                          " foi criada com saldo de R$" + saldo);
        
        scanner.close();
    }
}
