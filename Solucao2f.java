import javax.swing.JOptionPane;
public class Solucao2f {
    public static void main(String[] args) {
        // Lendo um número inteiro de 3 casas decimais usando JOptionPane
        String input = JOptionPane.showInputDialog("Digite um numero inteiro de 3 digitos:");
        int numero = Integer.parseInt(input);

        // Obtendo o algarismo da casa das dezenas
        int algarismoDezena = obterAlgarismoDezena(numero);

        // Exibindo o resultado
        JOptionPane.showMessageDialog(null, "O algarismo da casa das dezenas e: " + algarismoDezena);
    }

    public static int obterAlgarismoDezena(int numero) {
        return (numero / 10) % 10;
    }
}
