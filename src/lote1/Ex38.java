package lote1;
import java.util.Scanner;

// Autor: Ramon Bernardo
// Dia: 15/02/2023
/*  Ex: Receba 100 números inteiros reais. Verifique e mostre o maior e o menos
valor. Obs.: somente valores positivos.
*/
public class Ex38 {
    public static void main(String[] args) {
        int vet[]= new int [100];
        int n;
        int maior, menor;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<100; i++){
            System.out.println("Digite um numero positivo: ");
                n=sc.nextInt();
            if(n>0){
                vet[i]=n;
            }
            else{
                System.out.println("Digite novamente, número inválido! ");
            }
        }

        maior = vet[0];
        menor = vet[0];
        for(int i=0; i<100; i++){
            if(vet[i]> maior){
                maior = vet[i];
            }
            if(vet[i]<menor){
                menor = vet[i];
            }
        }
     
    

    System.out.println("Maior = " + maior + " " + "Menor = " + menor);
    sc.close();
}

}