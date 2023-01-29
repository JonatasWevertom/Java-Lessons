package ExercicioEstruturaRepeticao;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        char desejaContinuar = 's';

        try (Scanner leitor = new Scanner(System.in)) {
            while (desejaContinuar == 'S' || desejaContinuar == 's') {
                System.out.print("Digite um numero: ");
                int numero = leitor.nextInt();

                if (numero == 0) {
                    System.out.println("O numero é zero");
                } else if (numero > 0) {
                    System.out.println("O numero é maior que zero");

                } else {
                    System.out.println("O numero é menor que zero");
                }

                System.out.print("Deseja continuar? sim ou nao: ");
                desejaContinuar = leitor.next().charAt(0);
            }
        }
    }
}
