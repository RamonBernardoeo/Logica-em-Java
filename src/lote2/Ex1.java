/*
 * Autor: Ramon Bernardo
 * Data: 23/02/2023
 * Objetivo: Criar e coletar um vetor [50] inteiro. Calcular e exibir:
            a. A média dos valores entre 10 e 200;
            b. A soma dos números ímpares.
 */
package lote_vetor;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int media = 0, mediat = 0, soma = 0;
        int vet[] = new int[50];
        int cont=0;
        Scanner sc = new Scanner(System.in);

        for(int i = 0;i<=50;i++){
            System.out.println("Digite 50 numeros: ");
            vet[i] = sc.nextInt();

        }

        for(int i=10; i<=200; i++){
            media += vet[i];    
            cont += 1;

        }

        mediat = media/cont;
        
        for(int i=0; i<=50; i++){
            if(vet[i]%2!=0){
                soma += vet[i];
            }
        }
        System.out.println("Media = " + mediat + "Soma dos impares = " + soma);
    }
}
