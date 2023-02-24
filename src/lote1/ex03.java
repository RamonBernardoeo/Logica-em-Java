// Autor: Ramon Bernardo
// Receba a base e a altura de um triângulo. Calcule e mostre a sua área
package lote1;
import java.util.Scanner;

public class ex03{
    public static void main(String[] args) {
        double area, base, altura;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a altura do triangulo: ");
        altura = sc.nextDouble();
        System.out.println("Digite a base do triangulo: ");
        base = sc.nextDouble();
        area = (altura*base)/2;
        System.out.println("A area do triangulo é: " + area);
        sc.close();

        
    }
}