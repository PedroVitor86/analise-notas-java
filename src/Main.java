import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int alunos = 0;
        double soma = 0;



        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("Quantos alunos tem na sua turma?");
        alunos = scanner.nextInt();
        System.out.println("++++++++++++++++++++++++++++++++++++");

        double [] notas = new double[alunos];
        for (  int i = 0;i < alunos; i++) {
            System.out.println("Qual a "+( i + 1 )+ "° nota? ");
            notas[i] = scanner.nextDouble();
            soma = soma + notas[i];
        }

        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("            NOTAS TURMAS            ");
        System.out.println("++++++++++++++++++++++++++++++++++++");
        for (int i = 0; i < notas.length;i++){
            System.out.println((i+1)+"° nota: "+notas[i]);
        }

        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("            MÉDIA TURMAS            ");
        System.out.println("++++++++++++++++++++++++++++++++++++");

        double media = soma / alunos;
        System.out.println("Média da Turma: "+media);

        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("Quantidade de alunos: "+alunos);

        double maiorNota = notas[0];
        for (int i =0; i < notas.length; i++){
            if (notas[i] >= maiorNota){
                maiorNota = notas[i];
            }
        }
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("Maior Nota: "+maiorNota);

        double menorNota = notas[0];
        for (int i =0; i < notas.length; i++){
            if (notas[i] <= menorNota){
                menorNota = notas[i];
            }
        }
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("Menor Nota: "+menorNota);



        scanner.close();
    }
}