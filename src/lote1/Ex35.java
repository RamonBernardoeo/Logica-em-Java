// Autor: Ramon Bernardo
// Objetivo: Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e
// mostre o resultado da somatória dos números ímpares entre esses valores.

package lote1;
import java.util.Scanner;

public class Ex35{
    public static int funcao(int num1, int num2){
        int soma = 0;
        if(num1>num2){
            for(int x = num2; x<=num1; x++){
                if(x%3==0){
                    soma = soma+x;
        
                }
            }
        }

        if(num2>num1){
            for(int x = num1;x<=num2;x++){
                if(x%3==0){
                    soma = soma+x;
                
            }

        }
        }
        return(soma);
    }

    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = sc.nextInt();
        System.out.println(funcao(num1, num2));
        sc.close();

    }
}