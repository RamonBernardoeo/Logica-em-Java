// Autor: Ramon Bernardo
// Receba 2 valores reais. Calcule e mostre o maior deles.
package lote1;
import java.util.Scanner;
public class ex19 {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Digite o primeiro numero: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Digite o seguno número: ");
        b = sc.nextInt();

        if(a>b){
            System.out.println("Maior = " + a);
        }
        
        if(b>a){
            System.out.println("Maior = " + b);
        }
   sc.close();

}
}
    