
package mostrarnsimpares;

import java.util.Scanner;


public class MostrarNsImpares {

  
    public static void main(String[] args) {
        Scanner pedirNumero = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Digite un número positivo: ");
        numero = pedirNumero.nextInt();
        System.out.println("Números impares entre 0 y " + numero + ":");
        
        for (int i = 1; i <= numero; i += 2) {
            System.out.println(i);
        }
    }
    
}
