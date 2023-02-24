//  Autor: Ramon Bernardo
// Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
package lote1;
import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        int tempo, vM, litros;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva o tempo gasto na viagem: ");
        tempo = sc.nextInt();

        System.out.println("Digite a velocidade média do percurso: ");
        vM = sc.nextInt();

        litros = (tempo * vM)/12;

        System.out.println("O total de litros gastos foi de: " + litros);

        sc.close();

    }
}
