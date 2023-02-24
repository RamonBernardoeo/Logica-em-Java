// Autor: Ramon Bernardo
/* Receba a data de nascimento e atual em ano, mês e dia. Calcule e mostre a idade em anos, meses e dias, considerando os anos bissextos.
*/
package lote1;
import java.util.Scanner;
public class Ex30 {
    public static void main(String[] args) {
        int anoNasc, anoAtual, ano,mes,dia;

        Scanner tempo = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento: ");
        anoNasc = tempo.nextInt();

        System.out.println("Digite o ano atual: ");
        anoAtual = tempo.nextInt();


        ano = anoAtual - anoNasc;
        mes = ano*12;
        dia = (365*ano) + (ano/4);

        System.out.println("Você viveu " + ano +" anos " + mes + " meses " + dia + " dias ");
        tempo.close();
    }
}
