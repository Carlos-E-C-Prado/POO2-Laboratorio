public class CalculadoraAdapter implements CalcularDecimal {
    private final CalcularBinario calculadoraBinaria;

    public CalculadoraAdapter(CalcularBinario calculadoraBinaria) {
        this.calculadoraBinaria = calculadoraBinaria;
    }

    @Override
    public String somar(String a, String b) {
        String resultadoBinario = calculadoraBinaria.somar(a, b);
        return formatarResultado(resultadoBinario);
    }

    @Override
    public String subtrair(String a, String b) {
        String resultadoBinario = calculadoraBinaria.subtrair(a, b);
        return formatarResultado(resultadoBinario);
    }

    @Override
    public String multiplicar(String a, String b) {

        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);

        String resultadoBinario = Integer.toBinaryString(num1 * num2);
        return formatarResultado(resultadoBinario);
    }

    private String formatarResultado(String binario) {
        int decimal = Integer.parseInt(binario, 2);
        return "Decimal: " + decimal + ", Binário: " + binario;
    }
}
