/*1. Dada uma seqüência de números inteiros não-nulos, seguida por 0, imprimir seus
quadrados.*/
package lista1exercicio1;

import java.util.Scanner;

/* @author Jair */
public class Lista1Exercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num;
        num = entrada.nextInt();
        int resul;
        
        while(num!=0){
            resul = num*num;
            System.out.println("O quadrado de " + num + " é: " + resul + "\n");
            System.out.println("Digite um número inteiro ou 0 para sair");
            num = entrada.nextInt();
        }
    }
}
