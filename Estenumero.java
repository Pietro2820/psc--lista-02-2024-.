import java.util.Scanner;

public class Estenumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        // Pedindo número
        System.out.println("Escreva um número: ");
        Double n1 = entrada.nextDouble();
        
        // Apresentando resultado
        System.out.println("O número apresentado é: " + n1);
        
        entrada.close();
    }
}
