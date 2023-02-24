// Autor: Ramon Bernardo
//Objetivo: Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.

package lote1;
import java.util.Scanner;
public class ex14 {

    public static void main(String[] args) {
        double angulo1, angulo2, angulo3;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro ângulo: ");
        angulo1 = sc.nextDouble();

        System.out.println("Digite o valor do segundo angulo: ");
        angulo2 = sc.nextDouble();

        angulo3 = 180 - (angulo1 + angulo2);
        if (angulo3 <= 180){
            System.out.println("O terceiro angulo é: " + angulo3);
        }

        else{
            System.out.println("Por meio dos angulo notamos que o formato não corresponde a um triangulo ");
        }
        sc.close();

    }
    
}
