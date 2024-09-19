import javax.swing.JOptionPane;
public class Solucao2k {

    public static void main(String[] args) {
        // Data no formato ddmmaa armazenada como um inteiro
        int data = 221125; // Exemplo: 22/11/2025 (formato ddmmaa)

        // Extraindo o dia (dd)
        int dia = data / 10000;

        // Extraindo o mês (mm)
        int mes = (data / 100) % 100;

        // Extraindo o ano (aa)
        int ano = data % 100;

        // Imprimindo o dia, mês e ano
        System.out.println("Dia: " + dia);
        System.out.println("Mês: " + mes);
        System.out.println("Ano: " + ano);
    }
}
