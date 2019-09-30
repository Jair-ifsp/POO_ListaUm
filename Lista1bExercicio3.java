/*3. Dados dois naturais m e n determinar, entre todos os pares de números naturais (x,y)
tais que x < m e y < n, um par para o qual o valor da expressão xy - x2 + y seja máximo e
calcular também esse máximo.*/
package lista1bexercicio3;

import java.util.Scanner;

/* @author Jair */
public class Lista1bExercicio3 {

    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um número natural");
        int m = entrada.nextInt();
        System.out.println("Informe o próximo número");
        int n = entrada.nextInt();
        int i, j, val;
        int maxJ = 0;
        int maxI = maxJ;
        int maxVal = 0;
        
        for(i = 0; i <= n; i++){
            for(j = 0; j <= m; j++){
                val = i*j - i*i+j;
                if(val > maxVal){
                    maxVal = val;
                    maxI = i;
                    maxJ = j;
                }
            }
        }
        System.out.println("O máximo é " + maxVal + " e foi obtido com " + maxI + " e " + maxJ);
    }
}
