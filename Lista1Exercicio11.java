/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1exercicio11;

import java.util.Scanner;

/**
 *
 * @author Jair
 */
public class Lista1Exercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int n = teclado.nextInt();
        int aux = 0;
        
        for(int i=1; i<n; i++){
            if(n%i == 0)
                aux = aux + i;
        }
        if(n == aux){
            System.out.println("O número " + n + " é perfeito!");
        }else{
            System.out.println("O número " + n + " não é perfeito!");
        }
    }
}
