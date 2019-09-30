/*13. Dizemos que um número i é congruente módulo m a j se i % m = j % m.
 Exemplo: 35 é congruente módulo 4 a 39, pois 35 % 4 = 3 = 39 % 4.
Dados inteiros positivos n, j e m, imprimir os n primeiros naturais congruentes a j módulo m.*/
package lista1exercicio13;

import java.util.Scanner;

/* @author Jair */
public class Lista1Exercicio13 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro");
        int n = entrada.nextInt();
        System.out.println("Digite o segundo número inteiro");
        int j = entrada.nextInt();
        System.out.println("Informe o último número inteiro");
        int m = entrada.nextInt();
        System.out.println("\n");
        int aux = j;
        
        System.out.println("Os primeiros naturais congruentes são:");
        for(int i = 0; i < n; i++){
            System.out.println(aux);
            aux = aux + m;
       }
    }
 }
