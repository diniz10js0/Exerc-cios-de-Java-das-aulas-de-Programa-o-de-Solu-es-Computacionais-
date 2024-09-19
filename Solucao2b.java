import javax.swing.JOptionPane;
public class Solucao2b {
    public static void main(String[] args) {
        // Definindo as medidas do retângulo
        double base = 9.0; // valor exemplo da base
        double altura = 14.0; // valor exemplo da altura

        // Calculando a área
        double area = calcularArea(base, altura);

        // Exibindo o resultado
        System.out.println("A area do retangulo e: " + area);
    }

    public static double calcularArea(double base, double altura) {
        return base * altura;
    }
}
