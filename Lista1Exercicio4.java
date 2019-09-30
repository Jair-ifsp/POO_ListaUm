/*4. Dados um inteiro x e um inteiro não-negativo n, calcular x elevado a n*/
package lista1exercicio4;

import java.util.Scanner;

/* @author Jair */
public class Lista1Exercicio4 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int x = teclado.nextInt();
        System.out.println("Digite um número inteiro positivo");
        int n = teclado.nextInt();
        int resul = (int) Math.pow(x, n);
        System.out.println(x + " elevado a " + n + " é: " + resul);
    }
}

