import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
      //Crie um programa que recebe a idade
      //de uma pessoa e verifica se ela é 
      //menor de idade (menor que 18 anos) ou maior de idade.

      // solicite a idade da pessoa.
      Scanner scanner = new Scanner (System.in);
      
      //2 vrifique se ela e maior ou igual a 18
      System.out.println("digite SUA IDADE: ");
      double idade = scanner.nextDouble();
      
      if ( idade < 18 ) {
      System.out.println("você é MENOR de idade");
    }  else {
      System.out.println("você é MAIOR de idade");
      scanner.close();
      
    }
      

} 
}
