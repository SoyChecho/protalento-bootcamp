package practica;

import java.util.Scanner;

public class Estudiantes {

	public static void main(String[] args) {
		 Scanner leer = new Scanner(System.in);
		    int numEstudiantes;
		    String[] estudiantes;
		    int numExamenes;
		    //int numNotas;
		    double [] notas;
		    
		    double suma=0, promedio, max, min;
		    int numAprobados=0, numSuspendidos=0;
		    //---------------------------------------------------
		    // Array Estudiantes
		    
		    System.out.print("Numero de estudiantes: ");
		    numEstudiantes = leer.nextInt();
		    estudiantes = new String[numEstudiantes];
		    
		    leer.nextLine();
		    
		    System.out.println("Ingrese un total de " + numEstudiantes + " estudiantes con nombre y apellido seguido de la tecla enter: ");
		    for(int i=0; i<estudiantes.length; i++){
		        System.out.print("Estudiante "+ (i+1) + ": ");
		        
		        estudiantes[i] = leer.nextLine();
		    }
		    
		    System.out.println("Los estudiantes a evaluar: ");
		    for (String estudiante : estudiantes) {
		        System.out.print(estudiante + "   " );
		    }
		    
		    //Array Notas
		    System.out.print("\nNumero de examenes por estudiante: ");
		    numExamenes = leer.nextInt();
		    notas = new double[numExamenes];
		    
		    System.out.println("Ingrese un total de: " + numExamenes + " notas de examen por estudiante");
		    for(int i=0; i<notas.length; i++){
		        System.out.print("Nota Examen "+ (i+1) + ": ");
		        notas[i] = leer.nextDouble();
		    }
		    
		    
		    System.out.println("Las Notas a evaluar: ");
		    for (double nota : notas) {
		        System.out.print(nota + "   ");
		    }
		    
		    //Mezclar los array estudiante y nota en matriz intentar for each o algun for
		    
		    
		    
		    
		    //Hacemos los calculos deseados..
		    //suma de las notas
		    for (double nota : notas) {
		        suma += nota;
		    }
		    System.out.println("\nSuma total de Notas: " + suma);

		    //promedio de todas las notas
		    promedio = suma / numExamenes;
		    System.out.println("El promedio es: " + promedio);
		    
		    //nota mas alta
		    max = notas[0];
		    for (int i=0; i<notas.length; i++) {
		        if(notas[i] > max){
		            max = notas[i];
		        }
		    }
		    System.out.println("Nota mas alta: " + max);

		    //nota mas baja
		    min = notas[0];
		    for (int i=0; i<notas.length; i++) {
		        if(notas[i] < min){
		            min = notas[i];
		        }
		    }
		    System.out.println("Nota mas baja: " + min);
		    
		    //alumnos aprobados y suspendidos
		    for (double nota : notas) {//Este FOR deberia ir en relacion al array donde mezclo estudiantes y notas
		        if(nota >= 7) {
		            numAprobados++;
		        } else {
		            numSuspendidos++;
		        }
		    }
		    System.out.println("Alumnos aprobados: " + numAprobados);
		    System.out.println("Alumnos suspendidos: " + numSuspendidos);
		    
		    
		    
		    
		    //Array notas
		    /*for (int i = 0; i < 5; i++) {
		        System.out.println("Registrando alumno #" + (i+1));
		        System.out.print("Nombres: ");
		        estudiantes[i] = leer.nextLine();
		        System.out.print("Nota Examen 1: ");
		        notas[i][0] = Double.parseDouble(leer.nextLine());
		        System.out.print("Nota Examen 2: ");
		        notas[i][1] = Double.parseDouble(leer.nextLine());
		        System.out.print("Nota Examen 3: ");
		        notas[i][2] = Double.parseDouble(leer.nextLine());
		        System.out.println("Alumno registrado...\n");
		    }*/
		    
		    
		    /*//# de examenes
		    System.out.println("Ingrese el numero de examenes de cada alumno: ");
		    numExamenes = leer.nextInt();
		    System.out.print("Numero de examenes: " + numExamenes);*/
		    
		   
		    
		    
		    
		    
		    
		    
		    leer.close();
		    
		    
	}

}
