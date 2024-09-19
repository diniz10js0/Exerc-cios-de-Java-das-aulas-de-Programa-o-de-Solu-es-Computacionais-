import javax.swing.JOptionPane;
public class Solucao2l {

    public static void main(String[] args) {
        // Data no formato dd/mm/aa armazenada como uma String
        String data = "19/09/24"; // Exemplo: 12 de abril de 2021

        // Separando a data em dia, mês e ano usando o método split("/")
        String[] partes = data.split("/");

        // Atribuindo cada parte a uma variável
        String dia = partes[0]; // Dia
        String mes = partes[1]; // Mes
        String ano = partes[2]; // Ano

        // Imprimindo o dia, mês e ano separados
        System.out.println("Dia: " + dia);
        System.out.println("Mes: " + mes);
        System.out.println("Ano: " + ano);
    }
}
