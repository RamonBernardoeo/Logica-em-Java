package lote1;
import java.util.Scanner;

/* Autor: Ramon Bernardo    
 * Data: 19/02/2023
 * Objetivo: Receba o número da base e do expoente. Calcule e mostre o valor da
 potência.
 */
public class Ex44 {
    public static void main(String[] args) {
        int base, expo;
        double result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a base: ");
        base = sc.nextInt();
        System.out.println("Digite o expoente: ");
        expo = sc.nextInt();
        result = Math.pow(base, expo);
        System.out.println(result);
        sc.close();
    }   
}
