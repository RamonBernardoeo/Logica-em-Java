// Autor: Ramon Bernardo
// Objetivo: Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia
package lote1;
import java.util.Scanner;

public class ex13{
public static void main(String[] args) {
    double quantidadeAlimento, quantidadeFinal;
    int dias;

    System.out.println("Escreva a quantidade de alimentos em quilos ");
    Scanner sc = new Scanner(System.in);
    quantidadeAlimento = sc.nextDouble();

    System.out.println("Digite a quantidade de dias que irá comer: ");
    dias = sc.nextInt();


    quantidadeFinal = quantidadeAlimento - (dias * 0.50);

    System.out.println(quantidadeFinal);
    
    sc.close();
}
}