import java.util.Scanner;

public class ViagemEurotrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Apresentação
        System.out.println("Olá! Bem-vindo ao programa de cálculo da Eurotrip!\n");

        System.out.println("A viagem será para os seguintes locais:\n1. Alemanha\n2. Portugal\n3. Itália");
        
        // Pedindo os valores
        System.out.print("Digite o valor total da viagem (Eurotrip): ");
        Double valor = scanner.nextDouble();
        System.out.print("Digite o número de amigos do grupo: ");
        Double amigos = scanner.nextDouble();

        // Cálculo
        Double resultado = valor / amigos;

        // Apresentação do resultado
        System.out.println("Cada amigo deverá pagar: R$ " + resultado);

        scanner.close();
    }
}
