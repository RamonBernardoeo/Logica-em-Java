// Autor: Ramon Bernardo    
// Objetivo: Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo
// do menor.
package lote1;
import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
        int n1,n2;
        Scanner numeros = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        n1 = numeros.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = numeros.nextInt();

        if(n1>n2 && n1%n2==0){
            System.out.println("o numero maior " + n1 + " é divisivel pelo " + n2);
        }
        else if (n2>n1 && n2%n1==0){
            System.out.println("O numero maior " + n2 + " é divisivel pelo " + n1);
        }

        else 
        System.out.println("Os numeros não são divisiveis");

        numeros.close();
    }
}
