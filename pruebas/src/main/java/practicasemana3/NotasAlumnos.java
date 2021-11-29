package practicasemana3;

import java.util.Scanner;

public class NotasAlumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
        int numNotas;
        double[] notas;
        double suma=0, promedio, max, min;
        int numAprobados=0, numSuspendidos=0;
        //---
        System.out.print("Numero de notas: ");
        numNotas = leer.nextInt();
        notas = new double[numNotas];

        System.out.println("Ingrese un total de: " + numNotas + " notas");
        for(int i=0; i<notas.length; i++){
            System.out.print("Nota "+ (i+1) + ": ");
            notas[i] = leer.nextDouble();
        }

        //Hacemos los calculos deseados..
        System.out.println("Las Notas a evaluar: ");
        for (double nota : notas) {
            System.out.print(nota + "   ");
        }

        //suma de las notas
        for (double nota : notas) {
            suma += nota;
        }
        System.out.println("\nSuma total de Notas: " + suma);

        //promedio de todas las notas
        promedio = suma / numNotas;
        System.out.println("El promedio es: " + promedio);

        //alumnos aprobados y suspendidos
        for (double nota : notas) {
            if(nota >= 3) {
                numAprobados++;
            } else {
                numSuspendidos++;
            }
        }
        System.out.println("Alumnos aprobados: " + numAprobados);
        System.out.println("Alumnos suspendidos: " + numSuspendidos);

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
        leer.close();

	}

}
