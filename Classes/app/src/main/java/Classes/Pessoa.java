package Classes;

// Programação Orientada a Objetos, Abstração e Encapsulamento.
public class Pessoa {

    // Atributos.
    private float peso;
    private float altura;

    // Método construtor, necessario para valores default.
    public Pessoa(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }

    // Metodos.
    public float calcularImc() {
        float imc = (peso / (altura * altura));
        return imc;
    }

    // Metodos acessores Geters e Seters.
    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }
}
