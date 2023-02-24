// Autor: Ramon Bernardo
/* Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média:
a.	Se a média for >= 6,0 exibir “APROVADO”;
b.	Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
c.	Se a média for < 3,0 exibir “RETIDO */
package lote1;
import java.util.Scanner;



public class ex21 {
    public static void main(String[] args) {
    double n1,n2,n3,n4,media;
    
    Scanner nota = new Scanner(System.in);
    System.out.println("Digite a primeira nota: ");
    n1 = nota.nextDouble();
    
    System.out.println("Digite a segunda nota; ");
    n2 = nota.nextDouble();

    System.out.println("Digite a terceira nota: ");
    n3 = nota.nextDouble();

    
    System.out.println("Digite a quarta nota: ");
    n4 = nota.nextDouble();

    media = (n1+n2+n3+n4)/4;

    if(media>=6){
        System.out.println("Aluno Aprovado!!");
    }

    else if(media>=3){
        System.out.println("Exame!!");
    }

    else if(media<3){
        System.out.println("Aluno Reprovado!!");
    }

    nota.close();

    }
    
}
