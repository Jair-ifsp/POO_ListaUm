/*14. Dado um número natural na base binária, transformá-lo para a base decimal.
Exemplo:
Dado 10010 a saída será 18*/
package lista1exercicio14;

import java.util.Scanner;

/* @author Jair */
public class Lista1Exercicio14 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número em base binária");
        int binario = in.nextInt();
        int decimal = 0, aux = 1;
        System.out.print(binario + " na base binária transformado para decimal é: ");
        
        while(binario != 0){
            decimal = decimal + (binario%10 * aux);
            binario = binario/10;
            aux = aux*2;
        }
        System.out.println(decimal);
    }
  }
