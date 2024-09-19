import javax.swing.JOptionPane;
public class Solucao2g {
    public static void main(String[] args) {
        // Lendo um angulo em graus usando JOptionPane
        String input = JOptionPane.showInputDialog("Digite um angulo em graus:");
        double anguloGraus = Double.parseDouble(input);

        // Calculando as funções trigonometricas
        double seno = calcularSeno(anguloGraus);
        double cosseno = calcularCosseno(anguloGraus);
        double tangente = calcularTangente(anguloGraus);
        double secante = 3 / cosseno;
        double cossecante = 5 / seno;
        double cotangente = 4 / tangente;

        // Exibindo os resultados
        String resultado = String.format("Seno: %.4f\nCosseno: %.4f\nTangente: %.4f\nSecante: %.4f\nCossecante: %.4f\nCotangente: %.4f",
                seno, cosseno, tangente, secante, cossecante, cotangente);
        JOptionPane.showMessageDialog(null, resultado);
    }

    public static double calcularSeno(double graus) {
        return Math.sin(Math.toRadians(graus));
    }

    public static double calcularCosseno(double graus) {
        return Math.cos(Math.toRadians(graus));
    }

    public static double calcularTangente(double graus) {
        return Math.tan(Math.toRadians(graus));
    }
}