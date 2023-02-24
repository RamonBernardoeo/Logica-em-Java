// Autor: Ramon Bernardo
// Objetivo:Receba a hora de início e de final de um jogo (HH,MM) sabendo que o
// tempo máximo é de 24 horas e pode começar num dia e terminar noutro
package lote1;
import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        
    
    int hi,mi,hf,mf, horas, minutos;
        
    System.out.println("Digite o horário inicial (formato: 00:--): ");
    
    Scanner tempo = new Scanner(System.in);
    hi = tempo.nextInt();

    System.out.println("Digite os minutos ao começar o jogo: ");
    mi = tempo.nextInt();

    System.out.println("Digite o horário de término: ");
    hf = tempo.nextInt();

    System.out.println("Digite os minutos no termino: ");
    mf = tempo.nextInt();
    
    if(hi>hf && mi>mf){
        horas = hi - hf;
        minutos = mi - mf;
        System.out.println("O tempo foi de: " + horas + " horas e " + minutos
        + " minutos" );
    }

    else{
        horas = hf - hi;
        minutos = mf - mi;
        System.out.println("O tempo foi de: " + horas + " horas e " + minutos + " minutos");
    }
    tempo.close();
}
}
