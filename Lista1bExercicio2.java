/*2. Dado um número inteiro positivo n, determinar todos os inteiros entre 1 e n que são
comprimento da hipotenusa de um triângulo retângulo com catetos inteiros.*/
package lista1bexercicio2;

import java.util.Scanner;

/* @author Jair */
public class Lista1bExercicio2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Informe o valor da hipotenusa");
        int n = in.nextInt();
        int num1, num2, verifica;
        for(int i = 1; i <= n; i++){
            verifica = 0;
            for(num1 = 1; num1 < i && num1 != verifica; num1++){
                num2 = num1;
                while(num1*num1 + num2*num2 < i*i){
                    num2++;
                    if(num1*num1 + num2*num2 == i*i){
                        System.out.println("Hipotenusa = " + i + ", catetos " + num1 + " e " + num2 + ".");
                        verifica = 1;
                    }
                }
            }
        }
    }
}
