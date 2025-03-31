import java.util.Scanner;

public class MediadeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Apresentação
        System.out.println("Olá! Este programa calcula a média de 4 notas bimestrais.\n");
        
        // Pedindo as notas
        System.out.print("Digite a primeira nota: ");
        Double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        Double nota2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        Double nota3 = scanner.nextDouble();
        System.out.print("Digite a quarta nota: ");
        Double nota4 = scanner.nextDouble();

        // Cálculo
        Double media;
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        // Apresentação do resultado
        System.out.println("A média das notas é: " + media);

        scanner.close();
    }
}
