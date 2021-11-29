package practicasemana3;

import java.util.Scanner;

public class Estudiantes {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
        int numEstudiantes;
        String[] estudiantes;
        //double suma=0, promedio, max, min;
        //int numAprobados=0, numSuspendidos=0;
        //---
        // Array Estudiantes
        System.out.print("Numero de estudiantes: ");
        numEstudiantes = leer.nextInt();
        estudiantes = new String[numEstudiantes];

        System.out.println("Ingrese un total de " + numEstudiantes + " estudiantes con nombre y apellido seguido de la tecla enter: ");
        for(int i=0; i<estudiantes.length; i++){
            System.out.print("Estudiante "+ (i+1) + ": ");
            
            estudiantes[i] = leer.nextLine();
        }
        
        System.out.println("Los estudiantes a evaluar: ");
        for (String estudiante : estudiantes) {
            System.out.print(estudiante + "   ");
        }
        leer.close();

	}

}
