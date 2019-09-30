/*5. Sabe-se que um número da forma n3 é igual a soma de n ímpares consecutivos.
Exemplo: 13= 1, 23= 3+5, 33= 7+9+11, 43= 13+15+17+19,...
Dado m, determine os ímpares consecutivos cuja soma é igual a n3 para n assumindo valores de 1 a m.*/
package lista1bexercicio5;

import java.util.Scanner;

/**
 *
 * @author Jair
 */
public class Lista1bExercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int m, inicio, n, i;
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um valor inteiro");
        m = in.nextInt();
        
        inicio = 1;
        for(n = 1; n <= m; n++){
            System.out.print(n + "*" + n + "*" + n + "=" + inicio);
            /*System.out.print(n);
            System.out.print(" * ");
            System.out.print(n);
            System.out.print(" * ");
            System.out.print(n);
            System.out.print(" = ");
            System.out.print(inicio);*/
            System.out.println("\n");

            for(i = 1; i < n; i++)
                System.out.println("+" + (inicio+2*i));
                inicio = inicio+2*i;
                /*System.out.println("+");
                System.out.print(inicio + 2 * i);
                inicio = inicio + 2 * n;
            */
        }
    }
    
}
