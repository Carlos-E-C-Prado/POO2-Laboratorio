public class Main {
    public static void main(String[] args) {
        CalcularBinario calculadoraBinaria = new CalcularBinario();
        CalcularDecimal calculadora = new CalculadoraAdapter(calculadoraBinaria);

        // Testando a calculadora decimal com operações suportadas usando binário
        String a = "1010"; // 10 em decimal
        String b = "0101"; // 5 em decimal

        System.out.println("Soma: " + calculadora.somar(a, b));        // 1111 (15 em decimal)
        System.out.println("Subtração: " + calculadora.subtrair(a, b)); // 0101 (5 em decimal)
        System.out.println("Multiplicação: " + calculadora.multiplicar(a, b)); // 11110 (50 em decimal)
    }
}
