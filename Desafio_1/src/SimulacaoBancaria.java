import java.util.Scanner;
public class SimulacaoBancaria {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            System.out.println("Opções: 1-Depositar 2-Sacar 3-Consultar Saldo 4-Encerrar");

            System.out.print("Digite uma das opções acima: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                System.out.println("Valor a ser depositado: ");
                double deposito = scanner.nextDouble();
                saldo += deposito;
                System.out.printf("O saldo atual é de %.1f\n", saldo);
                break;
                
                case 2:
                System.out.println("Qual valor será sacado?");
                double saque = scanner.nextDouble();
                if(saldo >= saque){
                    saldo -= saque;
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                }else{
                    System.out.println("Saldo insuficiente\n");
                }
                break;
                
                case 3:
                System.out.printf("O saldo atual é: %.1f\n", saldo);
                break;
                
                case 4:
                System.out.println("Programa encerrado.");
                continuar = false;
                break;

                default:
                System.out.println("Opção inválida. Tente novamente.");
                    break;
            } 
        }
        scanner.close();
    }
}
