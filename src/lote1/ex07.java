// Autor:Ramon Bernardo
// Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.
package lote1;
import java.util.Scanner;


public class ex07 {
    public static void main(String[] args) {
        double altura,largura,comprimento;
        double volume;

        System.out.println("Digite a altura: ");
        Scanner sc = new Scanner(System.in);
        altura = sc.nextDouble();

        System.out.println("Digite o comprimento: ");
        comprimento = sc.nextDouble();

        System.out.println("Digite a largura: ");
        largura = sc.nextDouble();

        
        volume = comprimento * altura * largura;

        System.out.println("Volume = " + volume);

        sc.close();
    }
}
