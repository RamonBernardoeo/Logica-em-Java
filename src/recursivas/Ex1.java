// Autor: Ramon Bernardo
// Data: 22/03/2023
// Objetivo: Serie1 = (1+2+3+...+100)

public class Ex1 {
    public static int calc(){
        int calculo =0;
        for(int i=0; i<=100;i++){
            calculo += i;
        }
        return calculo;
    }
    public static void main(String[] args) {
       System.out.println(calc()); 
    }
}
