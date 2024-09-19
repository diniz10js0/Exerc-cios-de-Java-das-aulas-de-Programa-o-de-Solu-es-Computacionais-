import javax.swing.JOptionPane;
public class Solucao2d {
    public static void main(String[] args) {
        // Lendo três Strings usando JOptionPane
        String str1 = JOptionPane.showInputDialog("Digite a primeira String:");
        String str2 = JOptionPane.showInputDialog("Digite a segunda String:");
        String str3 = JOptionPane.showInputDialog("Digite a terceira String:");

        // Calculando a soma dos comprimentos
        int comprimentoTotal = somarComprimentos(str1, str2, str3);

        // Exibindo o resultado
        JOptionPane.showMessageDialog(null, "A soma dos comprimentos é: " + comprimentoTotal);
    }

    public static int somarComprimentos(String s1, String s2, String s3) {
        return s1.length() + s2.length() + s3.length();
    }
}
