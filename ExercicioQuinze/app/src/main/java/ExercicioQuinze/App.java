package ExercicioQuinze;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int numero;

        try (Scanner leitor = new Scanner(System.in)) {
            System.out.print("Digite um numero: ");
            numero = leitor.nextInt();
        }

        if (numero >= 100 && numero <= 200) {
            System.out.println("O numero " + numero + " está no intervalo");
        } else {
            System.out.println("O numero " + numero + " nâo está no intervalo");
        }

    }
}
