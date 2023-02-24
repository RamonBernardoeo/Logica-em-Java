// Autor: Ramon Bernardo
// Objetivo: Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3
package lote1;
import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        
        int n1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        n1 = sc.nextInt();
        if(n1%2==0){
                System.out.println("O numero é divisivel por 2!");
        }
        if(n1%3==0){
                System.out.println("O numero é divisivel por 3!");
        }
        sc.close();


 }
}
