import javax.swing.JOptionPane;
public class Solucao2r {

    public static void main(String[] args) {
        // Definir os valores das diagonais (pré-definidos)
        double diagonalMaior = 42.0; // Exemplo: diagonal maior = 42.0
        double diagonalMenor = 28.0;   // Exemplo: diagonal menor = 28.0

        // Calcular a área do losango
        double area = (diagonalMaior * diagonalMenor) / 2;

        // Imprimir o resultado
        System.out.println("A area do losango e: " + area);
    }
}
