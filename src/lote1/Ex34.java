// Autor: Ramon Bernardo
// Objetivo: Receba um número. Calcule e mostre os resultados da tabuada desse número
package lote1;
import java.util.Scanner;

public class Ex34 {
    public static int tabuada(int num){
        int result = 0;
        for(int x=0; x<=10; x++){
            result = num * x;
            System.out.println(num + "x" + x + "=" +result);
        }
        return (result);
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero desejado: ");
        int num = sc.nextInt();

        System.out.println(tabuada(num));
        sc.close();
    }

}
