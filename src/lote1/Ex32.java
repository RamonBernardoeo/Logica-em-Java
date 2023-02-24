// Autor: Ramon Bernardo
// Objetivo: Receba um número inteiro. Calcule e mostre o seu fatorial.
package lote1;
import java.util.Scanner;

public class Ex32 {

    public static int fatorial(int num){
        int result = 1;
        for(int i = 1; i<=num; i++){
            result = result * i;
        }
        return result;
    }
    public static void main(String[] args) {
       Scanner numero = new Scanner(System.in);
       System.out.println("Digite o numero desejado: ");
       int num = numero.nextInt();
       
       System.out.println("O fatorial equivale a: " + fatorial(num));
    }
    
}
