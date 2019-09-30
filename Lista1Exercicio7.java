/*7. Dados n e dois números inteiros positivos i e j diferentes de 0, imprimir em ordem
crescente os n primeiros naturais que são múltiplos de i ou de j e ou de ambos.
Exemplo: Para n = 6 , i = 2 e j = 3 a saída deverá ser : 0,2,3,4,6,8.*/
package lista1exercicio7;

import java.util.Scanner;

/* @author Jair */
public class Lista1Exercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor");
        int n = entrada.nextInt();
        System.out.println("Informe o valor de i");
        int i = entrada.nextInt();
        System.out.println("Informe o valor de j");
        int j = entrada.nextInt();
        System.out.println("\n");
        int auxI = 0, auxJ = 0;
        
        for(int k = 0; k < n; k++){
            if(auxI<auxJ){
                System.out.println(auxI);
                auxI = auxI + i;
            }else{
                if(auxI>auxJ){
                    System.out.println(auxJ);
                    auxJ = auxJ + j;
                }else{
                    System.out.println(auxJ);
                    auxI += i;
                    auxJ += j;
                }
            }
        }
    }
}
