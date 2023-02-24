// Autor: Ramon Bernardo
// Receba dois numeros reais. Calcule e mostre a difereça desses valores.
package lote1;
import java.util.Scanner;


public class ex10 {
 public static void main(String[] args) {
     double a,b, diferenca;
    
     System.out.println("Digite o primeiro numero: ");
     Scanner sc = new Scanner(System.in);
     a = sc.nextDouble();

    System.out.println("Digite o segundo numero: ");
    b = sc.nextDouble();

    diferenca = a-b;
    System.out.println("A diferença é: " + diferenca);

    sc.close();



 }
    

}
