import javax.swing.JOptionPane;
public class Solucao2j {

    public static void main(String[] args) {
        //Frases definidas
        String frase1 = "Professor isso esta";
        String frase2 = "ficando mais dificil";
        String frase3 = "do que eu imaginava..";

        //Separando as frases ao meio
        String metade1Frase1 = frase1.substring(0, frase1.length() / 2);
        String metade2Frase1 = frase1.substring(frase1.length() / 2);

        String metade1Frase2 = frase2.substring(0, frase2.length() / 2);
        String metade2Frase2 = frase2.substring(frase2.length() / 2);

        String metade1Frase3 = frase3.substring(0, frase3.length() / 2);
        String metade2Frase3 = frase3.substring(frase3.length() / 2);

        //Criando a frase embaralhada
        String fraseEmbaralhada = metade1Frase2 + // primeira metade da segunda
                                  metade2Frase3 + // segunda metade da terceira
                                  metade2Frase2 + // segunda metade da segunda
                                  metade1Frase1 + // primeira metade da primeira
                                  metade1Frase3 + // primeira metade da terceira
                                  metade2Frase1;  // segunda metade da primeira

        // Concatenando as frases originais
        String concatenacaoFrases = frase1 + " " + frase2 + " " + frase3;

        // Exibindo a concatenação das frases originais
        System.out.println("Frases concatenadas: " + concatenacaoFrases);
        // Exibindo a frase embaralhada
        System.out.println("Frase embaralhada: " + fraseEmbaralhada);
        // Comparação
        System.out.println("Sao iguais? " + concatenacaoFrases.equals(fraseEmbaralhada));
    }
}

