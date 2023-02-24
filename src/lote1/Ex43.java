package lote1;
/*
 * Autor: Ramon Bernardo    
 * Data: 19/02/2023 
 * Objetivo: Calcule e mostre quantos anos serão necessários para que Ana seja maior que
 * Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m
 * e cresce 2 cm ao ano.
 */
public class Ex43 {
    public static void main(String[] args) {
        int maria = 150;
        int ana = 110;
        int anos = 0;        
        while (maria!=ana){
            anos += 1;
            ana += 3;
            maria += 2;
        }
        System.out.println(anos);
    }
}
