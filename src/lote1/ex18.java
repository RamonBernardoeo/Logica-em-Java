// Autor: Ramon Bernardo
// Receba dois valores inteiros. Calcule e mostre o resultado da diferença entre o maior e menor
package lote1;
import java.util.Scanner;


public class ex18 {
    public static void main(String[] args) {
        int n1, n2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        n2 = sc.nextInt();

        if (n1>n2){
            System.out.println("A diferença é: " + (n1-n2));
        }
        else if(n2>n1){
            System.out.println("A diferença é: " + (n2-n1));
        }
        else 
        System.out.println("Os numeros são iguais, o resultado é zero");
    sc.close();
    }

        
}
