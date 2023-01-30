package Classes;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // Objeto pessoa é uma nova pessoa de varias que podem ser criadas pelo modelo.
        Pessoa objetoPessoa = new Pessoa(64.0f, 1.70f);

        try (Scanner leitor = new Scanner(System.in)) {
            System.out.print("Digite o peso da pessoa: ");
            objetoPessoa.setPeso(leitor.nextFloat());

            System.out.print("Digite a altura da pessoa: ");
            objetoPessoa.setAltura(leitor.nextFloat());

            System.out.println("Imc: " + objetoPessoa.calcularImc());
        }
    }
}
