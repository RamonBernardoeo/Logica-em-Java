// Autor: Ramon Bernardo
//Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. Calcule o salário que serão as horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.
package lote1;
import java.util.Scanner;


public class ex16 {
    public static void main(String[] args) {
        double valorHora, salLiquido, salBruto,desconto;
        int horasTrabalhadas,descendentes;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva as horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();


        System.out.println("Digite o valor da horas: ");
        valorHora = sc.nextDouble();

        System.out.println("Digite o valor do desconto: ");
        desconto = sc.nextDouble();

        System.out.println("Digite quantos descendentes o senhor possuí: ");
        descendentes = sc.nextInt();


        salBruto = valorHora*horasTrabalhadas;
        salLiquido = (salBruto - (desconto/100) + (descendentes*100));
        
        System.out.println("O salário Bruto é de: " + salBruto);
        System.out.println("O salario liquido será de: " + salLiquido);

        sc.close();
        
    }
}
