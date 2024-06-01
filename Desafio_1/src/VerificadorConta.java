import java.util.Scanner;
public class VerificadorConta {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de sua conta: ");

        try{
            String numeroConta = scanner.next();
            verificarConta(numeroConta);
            System.out.println("Número de conta válida.");
        }catch(IllegalArgumentException e){
            System.out.println("Erro: "+e.getMessage());
        }finally{
            scanner.close();
        }
    }
    private static void verificarConta(String numeroConta){
        if (numeroConta.length() != 8) 
        throw new IllegalArgumentException("Número de conta inválido. Digite exatamente 8 digitos");
    }
}
