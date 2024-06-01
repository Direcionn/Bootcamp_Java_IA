public class FormatarCepExemplo {
    
    /*
     * O código abaixo foi copiado da aula de hierarquia de exceção do bootcamp "Desenvolvimento Java com IA"
     * da plataforma da DIO.
     */

    public static void main(String[] args) {
        try{
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);
        }catch(CepInvalidoException e){
            System.out.println("Formato de Cep inválido");
        }
    }
    static String formatarCep(String cep)throws CepInvalidoException{
        if(cep.length()!=8)
            throw new CepInvalidoException();
            return "23.765-064";
        
    }
}
