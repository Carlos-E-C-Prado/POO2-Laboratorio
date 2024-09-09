// Classe Main para demonstrar o funcionamento
public class Main {
    public static void main(String[] args) {
        Ave patoDomestico = new PatoDomestico();
        Ave pavaoAzul = new PavaoAdapter(new PavaoAzul());

        System.out.println("Pato Doméstico:");
        patoDomestico.voar();
        patoDomestico.emitirSom();

        System.out.println("\nPavão Azul:");
        pavaoAzul.voar();
        pavaoAzul.emitirSom();
    }
}
