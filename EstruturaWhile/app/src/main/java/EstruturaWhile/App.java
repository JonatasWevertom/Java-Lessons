package EstruturaWhile;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int totalAlunos = 10;

        try (Scanner leitor = new Scanner(System.in)) {
            while (totalAlunos > 0) {
                System.out.print("O nome do aluno é: ");
                String nomeAluno = leitor.next();

                System.out.print("Idade do aluno é: ");
                int idadeAluno = leitor.nextInt();

                System.out.println("O nome do aluno é: " + nomeAluno + " e sua idade é: " + idadeAluno);

                totalAlunos--;
            }
        }

    }
}
