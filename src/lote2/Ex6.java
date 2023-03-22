// Autor: Ramon Bernardo
// Data:11/03/2023
// Objetivo: Criar e coletar em um vetor [20] com números aleatórios. Classificar este
// vetor em ordem crescente e mostre os dados.
import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        int troca;
        int vet[] = new int[20];
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i<20;i++){
            System.out.println("Digite numeros aleatorios");
            vet[i] = sc.nextInt();
        }
        // ordenamento
        for(int i = 0 ; i<19; i++){
            for(int j=i+1;j<20;j++){
                if(vet[i]>vet[j]){
                    troca = vet[j];
                    vet[j] = vet[i];
                    vet[i] = troca;
                }
            }
        }

        for(int i=0; i<20;i++){
            System.out.println(vet[i]);
        }
    }
}
