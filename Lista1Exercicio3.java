/*3. Dado um número inteiro positivo n, imprimir os n primeiros naturais ímpares.
Exemplo: Para n=4 a saída deverá ser 1,3,5,7.*/
package lista1exercicio3;

import java.util.Scanner;

/*@author Jair*/
public class Lista1Exercicio3 {

    public static void main(String[] args) {
        System.out.println("Digite um número");    
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        int i = 0;
        int impar = 1;
        
        while(i < n){
            System.out.println(impar);
            impar = impar+2;
            i+=1;
        }
    }
}
