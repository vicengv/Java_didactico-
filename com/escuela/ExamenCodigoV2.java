package com.escuela;

import java.util.ArrayList;
import java.util.Scanner;

public class ExamenCodigoV2 {
    public static void main(String[] args) {
        // 1. Preparar el Scanner
        Scanner nl = new Scanner(System.in);

        // 2. Crear la lista de alumnos (cada alumno es una lista de Strings)
        ArrayList<ArrayList<String>> alumnos = new ArrayList<>();

        int sumaCalificaciones = 0;

        // 3. Pedir datos de 3 alumnos
        for (int a = 1; a <= 3; a++) {
            System.out.println("=== Captura del alumno " + a + " de 3 ===");

            System.out.print("Ingresa el nombre: ");
            String nombre = nl.nextLine();

            System.out.print("Ingresa el sexo: ");
            String sexo = nl.nextLine();

            System.out.print("Ingresa la edad: ");
            int edad = Integer.parseInt(nl.nextLine());

            System.out.print("Ingresa la calificacion: ");
            int calificacion = Integer.parseInt(nl.nextLine());

            ArrayList<String> alumno = new ArrayList<>();
            alumno.add(nombre);
            alumno.add(sexo);
            alumno.add(String.valueOf(edad));
            alumno.add(String.valueOf(calificacion));

            alumnos.add(alumno);
            sumaCalificaciones += calificacion;
        }

        // 4. Mostrar la información capturada
        System.out.println("--- Datos Guardados ---");
        for (int i = 0; i < alumnos.size(); i++) {
            ArrayList<String> alumno = alumnos.get(i);
            System.out.println("Alumno " + (i + 1) + ":");
            System.out.println("  Nombre: " + alumno.get(0));
            System.out.println("  Sexo: " + alumno.get(1));
            System.out.println("  Edad: " + alumno.get(2));
            System.out.println("  Calificacion: " + alumno.get(3));
        }

        // 5. Calcular y mostrar el promedio de las calificaciones
        double promedio = sumaCalificaciones / 3.0;
        System.out.println("Promedio de las 3 calificaciones: " + promedio);

        nl.close();
    }
}