// Autor: Ramon Bernardo
// Receba o raio de uma circunferência. Calcule e mostre o comprimento da circuferência
package lote1;
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        double raio, comprimento;

        System.out.println("Escreva o raio da circunferência: "); 
        
        Scanner sc = new Scanner(System.in);
        raio = sc.nextDouble();

        comprimento = 2*3.14*raio;

        System.out.println("O comprimento corresponde a: " + comprimento);

        sc.close();

        
    }
}
