/*
 * Autor: Ramon Bernardo
 * Objetivo: Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem
   crescente.
 */
package lote1;
import java.util.Scanner;
public class ex22{
  public static void main(String[] args) {
    int n1,n2;
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o primeiro numero: ");
    n1 = sc.nextInt();
    System.out.println("Digite o segundo numero: ");
    n2 = sc.nextInt();
    if(n1>n2){
      System.out.println(n1 + " " + n2);
    }
    if(n2>n1){
      System.out.println(n2 + " " + n1);
    }
    sc.close();
}
}

