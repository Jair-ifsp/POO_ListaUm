/*6. Dado um inteiro não-negativo n, determinar n!.*/
package lista1exercicio6;

import java.util.Scanner;

/* @author Jair */
public class Lista1Exercicio6 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo");
        int num, fatorial;
        num = teclado.nextInt();
        fatorial = num;
        
        for(int i = 1; i < num;) {
            fatorial = fatorial * (num-1);
            num--;
        }
        System.out.println("O fatorial é: " + fatorial);
    }
}
