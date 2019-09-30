/*10. Dados dois números inteiros positivos, determinar o máximo divisor comum entre eles
usando o algoritmo de Euclides*/
package lista1exercicio10;

import java.util.Scanner;

/* @author Jair */
public class Lista1Exercicio10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Encontre o MDC - Máximo Divisor Comum - entre dois números\n");
        System.out.println("Informe o primeiro número inteiro");
        int num1 = entrada.nextInt();
        System.out.println("Informe o segundo número inteiro");
        int num2 = entrada.nextInt();
        int aux;
        aux = num2%num1;
        
        while(aux != 0) {
            aux = num1%num2;
            num1 = num2;
            num2 = aux;
        }
        System.out.println("O MDC é : " + num1);
    }
}


