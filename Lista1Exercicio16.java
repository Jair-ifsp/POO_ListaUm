/*16. Dados três números naturais, verificar se eles formam os lados de um triângulo retângulo.*/

package lista1exercicio16;

import java.util.Scanner;

/* @author Jair */
public class Lista1Exercicio16 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o primeiro número");
        int ladoA = in.nextInt();
        System.out.println("Informe o segundo número");
        int ladoB = in.nextInt();
        System.out.println("Informe o terceiro número");
        int ladoC = in.nextInt();
        int aux;
        
        if(ladoB > ladoA){
            aux = ladoA;
            ladoA = ladoB;
            ladoB = aux;
        }
        
        if(ladoC > ladoA){
            aux = ladoA;
            ladoA = ladoC;
            ladoC = aux;
        }
        
        if(ladoA*ladoA == ladoB*ladoB + ladoC*ladoC)
            System.out.println("Sim, formam um triângulo retângulo");
        else
            System.out.println("Não formam um triângulo retângulo");
    }
}
