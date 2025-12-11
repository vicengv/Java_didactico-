public class MainTest {
  public static void main(String[] args) {
    System.out.println("Hello World");
    System.out.println("Programa de cálculo de promedio - Versión de prueba");
    System.out.println("=================================================");

    // 1. PREPARACIÓN - Datos de prueba
    double sumaCalificaciones = 0;
    int totalAlumnos = 5;
    
    // Datos de prueba simulando entrada del usuario
    String[] nombres = {"Juan", "María", "Pedro", "Ana", "Luis"};
    double[] calificaciones = {8.5, 9.2, 7.8, 9.5, 8.0};

    // 2. EL CICLO FOR (La repetición)
    for (int i = 0; i < totalAlumnos; i++) {
        String nombre = nombres[i];
        double calificacion = calificaciones[i];
        
        // Mostramos lo que habría sido la interacción
        System.out.println("Alumno " + (i+1) + ": " + nombre);
        System.out.println("Calificación: " + calificacion);
        System.out.println("---");

        // 3. ACUMULACIÓN
        sumaCalificaciones = sumaCalificaciones + calificacion;
    }

    // 4. CALCULO FINAL
    double promedio = sumaCalificaciones / totalAlumnos;

    // Mostramos el resultado final
    System.out.println("--------------------------");
    System.out.println("El promedio del grupo es: " + promedio);
    System.out.println("--------------------------");
  }
}