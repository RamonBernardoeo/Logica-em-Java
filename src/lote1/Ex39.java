package lote1;
/* Autor: Ramon Bernardo    
 * Data: 19/02/2023
 * Objetivo: Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
    Casa: 1 2 3 4 ... 64
    Qte: 1 2 4 8 ... N 
 */


import java.util.Scanner;

public class Ex39 {
    public static void main(String[] args) {
        int casa[] = new int[64];
        int quant=1;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero desejado:");
        n = sc.nextInt();
        for(int i=1;i<casa.length; i++){
            casa[i]=quant;
            quant *= 2;
        }

        for(int x=0; x<n;x++){
            System.out.println(casa[x]);
        }
        sc.close();
    }
}