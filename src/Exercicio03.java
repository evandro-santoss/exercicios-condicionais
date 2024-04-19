import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
     // 1 - Solicitar ao usuário uma temperatura em graus celsius
     Scanner scanner = new Scanner(System.in);
     System.out.println("Informe a temperatura em graus celsius: ");
     double temperaturaCelsius = scanner.nextDouble();
     // 2 - Validar se a temperatura em Celsius é menor que -273.15
     final double zeroAbsolutoEmCelsius = -273.15;
     if (temperaturaCelsius < zeroAbsolutoEmCelsius) {
       // 3 - Se sim, imprimir a temperatura e uma mensagem informando que a
       // temperatura é inválida
       System.out.println("Temperatura inválida");
     } else {
       // 4 - Senão, imprimir a temperatura em Fahrenheit.
       double temperaturaFahrenheit = (temperaturaCelsius * (9 / 5)) + 32;
       System.out.printf("A temperatura em Fahrenheith é %.2f", temperaturaFahrenheit);
     }
     scanner.close();


    }
}

