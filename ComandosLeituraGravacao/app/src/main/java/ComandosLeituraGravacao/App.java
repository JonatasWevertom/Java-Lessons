package ComandosLeituraGravacao;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            int idade = leitor.nextInt();
            float cotacaoDolar = leitor.nextFloat();
            double cotacaoEuro = leitor.nextDouble();
            String nome = leitor.nextLine();
            String codigoRua = leitor.nextLine();

            System.out.print("Texto que se´ra exibido no console");
            System.out.println("Texto que se´ra exibido no console");

            System.out.println(idade);
            System.out.println(cotacaoDolar);
            System.out.println(cotacaoEuro);
            System.out.println(nome);
            System.out.println(codigoRua);
        }

    }
}
