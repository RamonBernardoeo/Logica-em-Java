// Autor:Ramon Bernardo
// Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.
package lote1;
import java.util.Scanner;
public class ex06 {
    public static void main(String[] args) {
        int x,y;
        int z = 0;
        
        System.out.println("Escreva o primeiro valor: ");
        Scanner n1 = new Scanner(System.in);
        x = n1.nextInt();
        
        System.out.println("Escreva o segundo valor: ");
        Scanner n2 = new Scanner(System.in);
        y = n2.nextInt();
        
        
        x = z;
        y = x;
        z = y;

        System.out.println("X = " + x + "Y = "  + y);

        n1.close();
        n2.close();
        



    }
    
}
