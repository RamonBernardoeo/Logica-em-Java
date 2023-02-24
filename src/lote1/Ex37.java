// Autor: Ramon Bernardo
// Objetivo: Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu
// N’nésimo termo.

package lote1;
import java.util.Scanner;
public class Ex37 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um numero para a série de Fibonacci: ");
            int n = sc.nextInt();
            int [] vet = new int[n];
            vet[0] = 0;
            vet[1]= 1;
            for(int i=2;i<n;i++){
                vet[i]= vet[i-1] + vet[i-2];
            }
        
            for(int a = 0; a<n; a++){
                System.out.println("A serie fibonacci: " + vet[a] + " ");
            }
            sc.close();
        }
    }

        

