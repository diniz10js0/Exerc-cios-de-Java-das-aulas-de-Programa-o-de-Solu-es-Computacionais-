import javax.swing.JOptionPane;
public class Solucao2o {

    public static void main(String[] args) {
        // Dois números inteiros: dividendo e divisor (pré-definidos)
        int dividendo = 45; // Exemplo: dividendo = 25
        int divisor = 8;    // Exemplo: divisor = 4

        // Calculando o quociente (divisão inteira)
        int quociente = dividendo / divisor;

        // Calculando o resto (divisão com o operador de módulo)
        int resto = dividendo % divisor;

        // Imprimindo o dividendo, divisor, quociente e resto
        System.out.println("Dividendo: " + dividendo);
        System.out.println("Divisor: " + divisor);
        System.out.println("Quociente: " + quociente);
        System.out.println("Resto: " + resto);
    }
}
