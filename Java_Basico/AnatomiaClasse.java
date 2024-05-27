package Java_basico;

public class AnatomiaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Murilo";
        String segundoNome = "Vieira";
        System.out.println(nomeCompleto(primeiroNome, segundoNome));
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}
