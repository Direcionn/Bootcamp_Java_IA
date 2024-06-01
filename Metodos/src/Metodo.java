import java.util.Scanner;
public class Metodo{
    
    Scanner scanner = new Scanner(System.in);

    double c;

    public static void main(String[] args) {
        Metodo metodo = new Metodo();
        metodo.Somar(1, 2);
    }

    public void Somar(double a, double b){

        System.out.println("Digite um número: ");
        a = scanner.nextDouble();

        System.out.println("Digite outro número: ");
        b = scanner.nextDouble();

        c=a+b;
        System.out.println("A soma dos dois números é: "+c);
    }
}