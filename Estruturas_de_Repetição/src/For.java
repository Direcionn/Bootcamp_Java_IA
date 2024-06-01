import java.util.Scanner;
public class For{

    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        
        int x;

        System.out.print("Digite um número: ");
        x= scanner.nextInt();

        for(;x<=10;x++){
            System.out.print(x);
            if(x<10){
                System.out.print(", ");
            }
        }
        scanner.close();
    }
}