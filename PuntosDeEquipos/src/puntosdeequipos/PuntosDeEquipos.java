
package puntosdeequipos;

import java.util.Scanner;


public class PuntosDeEquipos {

    public static void main(String[] args) {
        Scanner masconcito = new Scanner(System.in);
        
        int masconesGanados, masconesEmpatados, masconesPerdidos;
        
        System.out.println("Ingrese el número de mascones ganados:");
        masconesGanados = masconcito.nextInt();
        
        System.out.println("Ingrese el número de mascones empatados:");
        masconesEmpatados = masconcito.nextInt();
        
        System.out.println("Ingrese el número de mascones perdidos:");
        masconesPerdidos = masconcito.nextInt();
        
        int puntos = calcularPuntos(masconesGanados, masconesEmpatados);
        System.out.println("El equipo tiene " + puntos + " puntos ");       
    }
    public static int calcularPuntos(int ganados, int empatados) {
        int puntos = (ganados * 3) + empatados;
        return puntos;
    }
    
}
