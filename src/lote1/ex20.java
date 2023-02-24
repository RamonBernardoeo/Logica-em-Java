// Autor: Ramon Bernardo
// Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0.
// Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
package lote1;
import java.util.Scanner;


public class ex20 {
    public static void main(String[] args) {
        double a,b,c;
        double x1,x2;
        double bhaskara;
        
        System.out.println("Digite coeficiente A: ");

        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();

        System.out.println("Digite o coeficiente B: ");

        b = sc.nextDouble();

        System.out.println("Digite o coeficiente C: ");

        c = sc.nextDouble();

        bhaskara = Math.pow(b, 2) - 4*a*c;

        x1 = ((-b + Math.sqrt(bhaskara))/(2*a));
        x2 = ((-b - Math.sqrt(bhaskara))/(2*a));
        
         if (bhaskara > 0){
        System.out.println("X1 = " + x1 + "\nX2= " + x2);
         }

         else if (bhaskara==0){
            System.out.println("Só haverá uma raiz: " + x1);
        
    
        }
        else {
            System.out.println(" Raizes inexistentes ");
        }
    
        sc.close();
    
    }
}
