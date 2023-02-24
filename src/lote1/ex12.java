// Autor: Ramon Bernardo
//Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade atual e quantos anos terá daqui a 17 anos
package lote1;
import java.util.Scanner;


public class ex12 {

    public static void main(String[] args) {
        int anoAtual, anoNasc, idadeAtual,idadeFutura;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o ano atual: ");
        anoAtual = sc.nextInt();

        System.out.println("Digite o ano de nascimento: ");
        anoNasc = sc.nextInt();

        idadeAtual = anoAtual - anoNasc;
        idadeFutura = idadeAtual + 17;
        System.out.println("A sua idade atual é: " + idadeAtual + "\n Sua idade depois de 17 anos será: " + idadeFutura);

        sc.close();

    }
    
}
