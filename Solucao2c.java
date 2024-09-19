import javax.swing.JOptionPane;
public class Solucao2c {
    public static void main(String[] args) {
        // Definindo o número inteiro
        int numero = 8; // exemplo de valor do número

        // Elevando o número ao quadrado
        double resultado = elevarAoQuadrado(numero);

        // Exibindo o resultado
        System.out.println("O quadrado de " + numero + " e: " + resultado);
    }

    public static double elevarAoQuadrado(int base) {
        return Math.pow(base, 2);
    }
}
