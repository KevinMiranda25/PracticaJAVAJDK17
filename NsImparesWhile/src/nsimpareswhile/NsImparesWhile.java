
package nsimpareswhile;

import java.util.Scanner;


public class NsImparesWhile {

 
    public static void main(String[] args) {
        Scanner pedirNumero = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Digite un número positivo: ");
        numero = pedirNumero.nextInt();
        System.out.println("Números impares entre 0 y " + numero + ":");
        
        int contador = 1;
        while (contador <= numero) {
            System.out.println(contador);
            contador += 2;
        }
    }
    
}
