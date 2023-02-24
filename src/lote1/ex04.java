// Autor: Ramon Bernardo
// Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit 
package lote1;
import java.util.Scanner;
public class ex04 {
    public static void main(String[] args) {
        int celsius,fahrenheit;
        System.out.println("Digite a temperatura em Celsius: ");
        Scanner temperatura = new Scanner(System.in);
        celsius = temperatura.nextInt();
        fahrenheit = (9*celsius+160)/5;
        System.out.println("Celsius: " + celsius + "\nFahrenheit: " + fahrenheit );

        temperatura.close();
        
    }
    
}
