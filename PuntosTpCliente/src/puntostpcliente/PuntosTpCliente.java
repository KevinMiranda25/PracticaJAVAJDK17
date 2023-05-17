
package puntostpcliente;

import java.util.Scanner;


public class PuntosTpCliente {


    public static void main(String[] args) {
        Scanner cliente = new Scanner(System.in);
        
        int puntos;
        
        System.out.println("Digite la cantidad de puntos que tiene");
        puntos = cliente.nextInt();
        
        String tipoCliente = TipoCliente(puntos); 
        
        System.out.println("El cliente es de tipo " + tipoCliente);
    }
     public static String TipoCliente(int puntos) {
        if (puntos < 1000) {
            return "Bronce";
        } else if (puntos >= 1000 && puntos <= 3000) {
            return "Plata";
        } else {
            return "Oro";
        }
     }
    
}
