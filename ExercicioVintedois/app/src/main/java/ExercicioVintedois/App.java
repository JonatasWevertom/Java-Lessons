package ExercicioVintedois;

import java.util.Scanner;

public class App {

    // Receber o valor de 40 produtos, exibir se teve lucro ou nao, e media de custo e venda.

    public static void main(String[] args) {
        int qtdProdutos = 40;
        float precoCusto = 0.0f;
        float precoVenda = 0.0f;
        float somaPrecoCusto = 0.0f;
        float somaPrecoVenda = 0.0f;
        float mediaPrecoCusto = 0.0f;
        float mediaPrecoVenda = 0.0f;

        try (Scanner leitor = new Scanner(System.in)) {
            for (int i = 0; i < qtdProdutos; i++) {
                System.out.print("Digite o valor de custo do produto " + i + ": ");
                precoCusto = leitor.nextFloat();

                System.out.print("Digite o valor de venda do produto " + i + ": ");
                precoVenda = leitor.nextFloat();

                if (precoCusto - precoVenda < 0) {
                    System.out.println("Lucro! ");
                } else if (precoCusto - precoVenda == 0) {
                    System.out.println("Empate! ");
                } else {
                    System.out.println("Prejuizo! ");
                }

                somaPrecoCusto = precoCusto + somaPrecoCusto;
                somaPrecoVenda = precoVenda + somaPrecoVenda;
            }
            mediaPrecoCusto = somaPrecoCusto / qtdProdutos;
            mediaPrecoVenda = somaPrecoVenda / qtdProdutos;

            System.out.println(mediaPrecoCusto);
            System.out.println(mediaPrecoVenda);
        }
    }
}
