package practicasemana3;

import java.util.Scanner;

public class CalificacionesEstudiantes {

	public static void main(String[] args) {
		
	
		
		/*Variables principales*/
		
		//Nombre de los alumnos
		String[] nombres = new String[5];
		//Materias que cursan los alumnos
		String[] apellidos = new String[5];
		//Matriz con las 3 notas de los 5 alumnos
		double[][] notas = new double[5][3];
		
		Scanner teclado = new Scanner(System.in);
		
		//Registramos 5 alumnos
		for (int i = 0; i < 5; i++) {
			System.out.println("Registrando alumno #" + (i+1));
			System.out.print("Nombres: ");
			nombres[i] = teclado.nextLine();
			System.out.print("Apellidos: ");
			apellidos[i] = teclado.nextLine();
			System.out.print("Nota Examen 1: ");
			notas[i][0] = Double.parseDouble(teclado.nextLine());
			System.out.print("Nota Examen 2: ");
			notas[i][1] = Double.parseDouble(teclado.nextLine());
			System.out.print("Nota Examen 3: ");
			notas[i][2] = Double.parseDouble(teclado.nextLine());
			System.out.println("Alumno registrado...\n");
		}
		
		
		//Promedio
		
		
		/*
		 * Una forma de obtener las tres notas más bajas
		 * sería construir un array unidimensional con todas
		 * las notas, ordenarlo de menor a mayor, y mostrar
		 * las tres primeras tras haber ordenado.
		 */
		
		//Construimos array con todas las notas
		double[] todasNotas = new double[15]; //5 alumnos, 3 notas: 5x3 = 15 notas
		int z = 0; //Indice para el array unidimenional
		for (int i = 0; i < notas.length; i++)
			for (int j = 0; j < notas[0].length; j++) {
				todasNotas[z] = notas[i][j];
				z++;
			}
		//Array construido, ordenamos de menor a mayor
		for (int i = 0; i < todasNotas.length -1; i++) {
			for (int j = 0; j < todasNotas.length-i-1; j++) {
				if (todasNotas[j + 1] < todasNotas[j]) {
					double aux = todasNotas[j + 1];
					todasNotas[j + 1] = todasNotas[j];
					todasNotas[j] = aux;
				}
			}
		}
		//Array ordenado, mostramos los tres primeros
		
		System.out.println("\nLas tres notas más bajas son:");
		for (int i = 0; i < 3; i++) {
			System.out.println("- " + todasNotas[i]);
		}
	}
	

}
