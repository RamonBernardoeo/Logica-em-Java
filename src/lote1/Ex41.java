package lote1;
/*  Autor: Ramon Bernardo   
 *  Data: 19/02/2023
 *  Objetivo: Mostre todas as possibilidades de 2 dados de forma que a soma tenha como
 *  resultado 7.
 * 
 */

public class Ex41 {
    public static void main(String[] args) {
        for(int i=0; i<=7; i++ ){
            for(int x = 0; x<=7; x++){
                if(i+x==7){
                    System.out.println(x + " + " + i + " = 7 " );
                }
            }
        }
    }
}
