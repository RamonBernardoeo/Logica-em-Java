// Autor: Ramon Bernardo
// Objetivo: Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N
package lote1;
import java.util.Scanner;

public class ex33 {
    public static double op(int num){
        double op=1;
        for(double x=1; x==num; x++){
            op = op + (1/x);
        }
        return (op);
    }


    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Digite o numero desejado: ");
        int num = numero.nextInt();
        System.out.println(op(num));
        numero.close();
    }
}
