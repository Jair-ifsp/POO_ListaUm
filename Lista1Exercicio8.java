/*8. Dizemos que um número natural é triangular se ele é produto de três números naturais
consecutivos.
*Exemplo: 120 é triangular, pois 4.5.6 = 120.
Dado um inteiro não-negativo n, verificar se n é triangular.*/
package lista1exercicio8;

import java.util.Scanner;

/* @author Jair */
public class Lista1Exercicio8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int n = teclado.nextInt();
        int i;
        
        for(i = 1; i*(i+1) * (i+2) < n; i++);
        if(i*(i+1) * (i+2) == n){
            System.out.println(n + " é o produto de " + i + (i+1) + (i+2) + " sendo assim, é um número triangular");
        }else{
            System.out.println(n + " não é triangular");
        }
    }
}
    

