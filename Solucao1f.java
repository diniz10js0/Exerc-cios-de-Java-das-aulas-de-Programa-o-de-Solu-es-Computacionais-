import javax.swing.JOptionPane;
public class Solucao1f {
    public static void main(String[] args) {
        // Definindo os caracteres que representam milhar, centena, dezena e unidade
        char milhar = '2';
        char centena ='7';
        char dezena = '1';
        char unidade ='5';

        // Concatenando os caracteres para formar a String
        String numeroCompleto = "" + milhar + centena + dezena + unidade;

        // Exibindo o número completo
        System.out.println(numeroCompleto);
    }
}
