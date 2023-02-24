// Autor: Ramon Bernardo   
// Objetivo: Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa
package lote1;
import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        double cateto1, cateto2, hipotenusa;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do priemiro cateto: ");
        cateto1 = sc.nextDouble();

        System.out.println("Digite o valor do segundo cateto: ");
        cateto2 = sc.nextDouble();

        hipotenusa = (cateto1*cateto1) + (cateto2*cateto2);

        System.out.println("A hipotenusa é: " + hipotenusa);

        sc.close();
        

    }
}
