import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");

    // 1. PREPARACIÓN
    Scanner scanner = new Scanner(System.in);

    double sumaCalificaciones = 0;
    int totalAlumnos = 5;

    for (int i = 1; i <= totalAlumnos; i++) {
      System.out.println("Ingrese el nombre del alumno " + i + ":");
      String nombre = scanner.nextLine();

      System.out.println("Ingrese la calificación de " + nombre + ":");
      double calificacion = Double.parseDouble(scanner.nextLine());

      sumaCalificaciones = sumaCalificaciones + calificacion;
    }

    double promedio = sumaCalificaciones / totalAlumnos;

    System.out.println("--------------------------");
    System.out.println("El promedio del grupo es: " + promedio);

    scanner.close();
  }
}