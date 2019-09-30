/*9.Dado um inteiro positivo n, verificar se n é primo.*/
package lista1exercicio9;

import java.util.Scanner;

/* @author Jair */
public class Lista1Exercicio9 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int n = entrada.nextInt();
        int aux = 0, i;
        
        for(i = 1; i <= n; i++){
            if(n%i == 0){
                aux++;
            }
        }
        if(aux == 2){
            System.out.println(n + " é um número primo!");
        }else{
            System.out.println(n + " não é um número primo!");
        }
    }
}
