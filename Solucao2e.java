import javax.swing.JOptionPane;
public class Solucao2e {
    public static void main(String[] args) {
        // Definindo os valores iniciais
        double valorInicial = 800.0; // Valor da dívida
        double juros = 40.0; // Taxa de juros em %
        int meses = 4; // Número de meses

        // Calculando o valor final da dívida
        double valorFinal = calcularValorFinal(valorInicial, juros, meses);

        // Exibindo o resultado
        System.out.printf("Apos %d meses, o valor a ser pago e: R$ %.2f%n", meses, valorFinal);
    }

    public static double calcularValorFinal(double valorInicial, double juros, int meses) {
        return valorInicial * Math.pow(1 + (juros / 100), meses);
    }
}
