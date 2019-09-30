/*12. Um matemático italiano da idade média conseguiu modelar o ritmo de crescimento da população de coelhos 
(1) através de uma seqüência de números naturais que passou a ser conhecida como seqüência de Fibonacci 
( 2). O n-ésimo número da seqüência de Fibonacci Fn é dado pela seguinte fórmula de recorrência:
 Faça um programa que, dado n, calcula Fn.*/
package lista1exercicio12;

import java.util.Scanner;

/* @author Jair */
public class Lista1Exercicio12 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int n = entrada.nextInt();
        int a = 0, b = 1, c, cont = 1;
        
        while(cont < n){
            c = b + a;
            a = b;
            b = c;
            cont = cont + 1;
        }
        System.out.println("O Fibonacci de " + n + " é: " + b);
    }
}
