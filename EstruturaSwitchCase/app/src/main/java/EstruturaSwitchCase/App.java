package EstruturaSwitchCase;

public class App {

    public static void main(String[] args) {
        int codigoProduto = 2;

        switch (codigoProduto) {
            case 1:
                System.out.println("Caso 1");
                break;
            case 2:
                System.out.println("Caso 2");
                break;
            default:
                System.out.println("Opção invalida");
        }
    }
}
