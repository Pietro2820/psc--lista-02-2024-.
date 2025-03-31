import java.util.Scanner;

public class LitrosGasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Apresentação
        System.out.println("Olá! Este programa calcula o valor a ser pago pela gasolina.\n");

        // Pedindo valores
        System.out.print("Digite o preço do litro da gasolina: ");  
        Double gasolina = scanner.nextDouble();
        System.out.print("Digite a quantidade de litros vendidos: ");  
        Double litros = scanner.nextDouble();

        // Cálculo
        Double preco = gasolina * litros;
        
        // Apresentação do resultado
        System.out.println("O total a ser pago é: R$ " + preco);
        
        scanner.close();
    }
}
