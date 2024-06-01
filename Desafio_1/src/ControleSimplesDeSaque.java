import java.util.Scanner;
public class ControleSimplesDeSaque {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double limiteSaque = scanner.nextDouble();

        for(int i = 1; ;i++){
            double valorSaque = scanner.nextDouble();
            if(valorSaque == 0){
                System.out.println("Transações encerradas.");
                break;
            }else if(valorSaque > limiteSaque){
                System.out.println("Limite diario de saque atingido. Transações encerradas.");
                break;
            }else{
                limiteSaque -=valorSaque;
                System.out.printf("Saque realizado. Limite restante: %.1f", limiteSaque);
                System.out.println("\nTransações encerradas.");
                break;
            }
        }
        scanner.close();
    }
}
