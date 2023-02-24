// Autor: Ramon Bernardo
// Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados
package lote1;
import java.util.Scanner;


public class ex09 {
    public static void main(String[] args) {
        int a,b, resultado;

        System.out.println("Escreca o primeiro valor: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        System.out.println("Escreva o segundo valor: ");
        b = sc.nextInt();

        resultado = (a*a) + (b*b);

        System.out.println("A soma dos quadrados é: " + resultado);

        sc.close();


    }
}
