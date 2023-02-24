// Autor: Ramon Bernardo
// Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
package lote1;
import java.util.Scanner;


public class ex08 {
    public static void main(String[] args) {
        double rendimento,deposito;
        int meses;

        System.out.println("De quanto será o depósito: ");
        Scanner sc = new Scanner(System.in);
        deposito = sc.nextDouble();
        
        System.out.println("Por quantos meses: ");
        meses = sc.nextInt();

        rendimento = (meses * 1.03) + deposito;
        System.out.println("O valor final após o valor aplicado será de: " + rendimento);
        
        sc.close();




    }
    
}
