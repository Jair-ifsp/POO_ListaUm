/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1exercicio4a;

import java.util.Scanner;

/**
 *
 * @author Jair
 */
public class Lista1Exercicio4A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        int diaAnterior = i, discos, data;
        
        for(int i = 1; i <= 30; i++){
            System.out.println("Informe as vendas de discos do dia " + i);
            int dia = teclado.nextInt();
            
            if(dia > diaAnterior){
                discos = dia;
               
            } else {
                discos = diaAnterior;
            }
            data = i;
             System.out.println("Dia de maior venda de discos: " + i);
            System.out.println("Total vendido : " + discos);
        }
        
       
    }
    
}
