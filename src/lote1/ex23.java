// Autor: Ramon Bernardo
// Objetivo: Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não
// necessariamente em ordem. Mostre os 4 números em ordem crescente.

package lote1;
import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
       int n1, n2, n3,n4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 4 numeros, sendo 3 em ordem crescente: ");
        System.out.println("N1: ");
        n1 = sc.nextInt();
        System.out.println("N2: ");
        n2 = sc.nextInt();
        System.out.println("N3: ");
        n3 = sc.nextInt();
        System.out.println("N4: ");
        n4 = sc.nextInt();

        if(n1 < n2 && n2 < n3){
            System.out.println(n1 +  " " + n2 + " " + n3 + " " + n4);
        }
        else{
            System.out.println("Digite novamente! ");
        }
        sc.close();
        }
    }

    

