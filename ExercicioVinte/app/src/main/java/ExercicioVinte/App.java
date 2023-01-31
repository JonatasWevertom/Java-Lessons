package ExercicioVinte;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // Receber ano e valor de carros e dizer valor do desconto, valor com desconto, e quantidade de veiculos.
         
        int anoFabricacao = 0;
        float valorCarro = 0.0f;
        float valorDesconto = 0.0f;
        boolean repetir = true;
        char desejaRepetir = 's';
        int totalAntigos = 0;
        int totalGeral = 0;

        try (Scanner leitor = new Scanner(System.in)) {
            while (repetir == true) {
                System.out.print("Ano fabricação: ");
                anoFabricacao = leitor.nextInt();

                System.out.print("Valor carro: ");
                valorCarro = leitor.nextFloat();

                if (anoFabricacao <= 2000) {
                    valorDesconto = (valorCarro * 0.12f);
                    totalAntigos++;
                } else {
                    valorDesconto = (valorCarro * 0.07f);
                }

                System.out.println("Valor desconto: " + valorDesconto);
                System.out.println("Total pago: " + (valorCarro - valorDesconto));

                totalGeral++;

                System.out.print("Continua a calcular? sim ou não ");
                desejaRepetir = leitor.next().charAt(0);

                if (desejaRepetir == 'n' || desejaRepetir == 'N') {
                    repetir = false;
                }
            }
        }

        System.out.println("Total carros até ano 2000: " + totalAntigos);
        System.out.println("Total carros geral: " + totalGeral);
    }
}
