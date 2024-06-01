import java.util.Scanner;
public class ExemploCamila {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String alunos[] = {"Camila","Lucas","Bruna","Pedro"};

        double media = calcularMediaDaTurma(alunos, scanner);
        System.out.printf("A média da turma é %.2f", media);
        scanner.close();
    }
    public static double calcularMediaDaTurma(String alunos [], Scanner scanner){
        double soma = 0;
        for(String aluno : alunos){
        System.out.printf("A nota do aluno %s: ", aluno);
        double nota = scanner.nextDouble();
        soma += nota;
        }

    return soma /alunos.length;
    }
}


