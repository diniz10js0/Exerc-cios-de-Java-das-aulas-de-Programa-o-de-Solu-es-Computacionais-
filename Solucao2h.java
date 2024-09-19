import javax.swing.JOptionPane;
public class Solucao2h {
    public static void main(String[] args) {
        // Lendo um número e a base para o logaritmo usando JOptionPane
        String inputNumero = JOptionPane.showInputDialog("Digite um número:");
        double numero = Double.parseDouble(inputNumero);
        
        String inputBase = JOptionPane.showInputDialog("Digite a base do logaritmo:");
        double base = Double.parseDouble(inputBase);

        // Calculando o logaritmo
        double resultado = calcularLogaritmo(numero, base);

        // Exibindo o resultado
        JOptionPane.showMessageDialog(null, "O logaritmo de " + numero + " na base " + base + " é: " + resultado);
    }

    public static double calcularLogaritmo(double numero, double base) {
        return Math.log(numero) / Math.log(base);
    }
}
