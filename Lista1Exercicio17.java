/*17. Dados três números, imprimi-los em ordem crescente.*/
package lista1exercicio17;

import java.util.Scanner;

/* @author Jair */
public class Lista1Exercicio17 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número");
        int num1 = in.nextInt();
        System.out.println("Digite mais um número");
        int num2 = in.nextInt();
        System.out.println("Digite o último número");
        int num3 = in.nextInt();
        
        if(num3 > num1)
            if(num1 > num2)
                System.out.println(num2 + " - " + num1 + " - " + num3);
            else if(num2 < num3)
                System.out.println(num1 + " - " + num2 + " - " + num3);
        if(num1 > num2)
            if(num2>num3)
                System.out.println(num3 + " - " + num2 + " - " + num1);
            else if(num3 < num1)
                System.out.println(num2 + " - " + num3 + " - " + num1);
        if(num1 < num2)
            if(num3 < num1)
                System.out.println(num3 + " - " + num1 + " - " + num2);
            else if(num3 < num2)
                System.out.println(num1 + " - " + num3 + " - " + num2);
    }
}
