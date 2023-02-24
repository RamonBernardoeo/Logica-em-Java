// Autor: Ramon Bernardo
//Objetivo: Mostre a área de um quadrado
package lote1;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args){
        int area;
        int lado;
        System.out.println("Digite o lado: ");
        Scanner lados = new Scanner(System.in);
        lado = lados.nextInt();
        area = lado*lado;
        System.out.println("A area do quadrado equivale a: " + area);
        lados.close();
        


    }
}
