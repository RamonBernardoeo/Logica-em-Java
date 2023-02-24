package lote1;
/*  Autor: Ramon Bernardo   
 *  Data: 19/02/2023
 *  Objetivo:   Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
 */
public class Ex42 {
    
    public static void main(String[] args) {
        double formula = 1;
            for(int i=1; i<=50; i++){
            for(int x=3; x<99; x+=2){
                formula += i/x;
            }
        }
        System.out.println(formula);
    }
}
