/*2. Dado um número inteiro positivo n, calcular a soma dos n primeiros números inteiros
positivos.*/
package lista1exercicio2;

import java.util.Scanner;

/*@author Jair*/
public class Lista1Exercicio2 {

    public static void main(String[] args) {
        
        System.out.println("Soma dos números anteriores: ");
        Scanner ent = new Scanner(System.in);
        int num = ent.nextInt();
        int soma = 0, i = 1;
        while(i<=num){
            soma = soma+i;
            i = i+1;
        }
        System.out.println(soma);
    }
}
