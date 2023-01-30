package Herenca;

import java.util.Date;

public class App {

    public static void main(String[] args) {
        Vendedor v = new Vendedor();
        v.setNome("jonatas");
        v.setSalario(100.0f);
        v.setCpf("90090090090");
        v.setDataNascimento(new Date());
        v.setComissaoPorItem(10.0f);
        v.setTotalItensVendidos(10);

        System.out.println("O salario do vendedor é: " + v.calcularSalario());

        Motorista m = new Motorista();
        m.setNome("João");
        m.setSalario(200.0f);
        m.setCpf("80080080080");
        m.setDataNascimento(new Date());
    }
}
