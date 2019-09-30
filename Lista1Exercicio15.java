/*15. Dado um número natural na base decimal, transformá-lo para a base binária.
Exemplo: Dado 18 a saída deverá ser 10010.*/

package lista1exercicio15;

import java.util.Scanner;

/* @author Jair */
public class Lista1Exercicio15 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número decimal");
        int decimal = in.nextInt();
        int binario = 0, aux = decimal, registro, potencia = 1;
        
        while(aux > 0){
            registro = aux%2;
            aux = aux/2;
            binario = binario+registro*potencia;
            potencia = potencia*10;
        }
        System.out.println(decimal + " na base decimal transformado em binário é: " + binario);
    }
}
