
import java.util.ArrayList; // Importar ArrayList
import java.util.Scanner; // Importar Scanner

public class ExamenCodigo {
    public static void main(String[] args) {
        // 1. Preparar el Scanner
        Scanner nl = new Scanner(System.in);

        // 2. Crear la lista
        // Corregido: 'ArrayList' con mayúsculas y tipo <String>
        ArrayList<String> lista = new ArrayList<>();

        // 3. Pedir datos
        // Corregido: Usar nextLine() para texto
        System.out.println("Ingresa el nombre:");
        String nombre = nl.nextLine();

        System.out.println("Ingresa el sexo:");
        String sexo = nl.nextLine();

        // Corregido: Leer como texto y convertir a entero para evitar errores de salto
        // de línea
        System.out.println("Ingresa la edad:");
        int edad = Integer.parseInt(nl.nextLine());

        System.out.println("Ingresa la calificacion:");
        int calificacion = Integer.parseInt(nl.nextLine());

        // 4. Guardar en la lista
        // Como la lista es de <String>, convertimos los números a texto
        lista.add(nombre);
        lista.add(sexo);
        lista.add(String.valueOf(edad)); // Convertir int a String
        lista.add(String.valueOf(calificacion)); // Convertir int a String

        // 5. Mostrar la lista
        System.out.println("--- Datos Guardados ---");

        // Corregido: Condición 'i < lista.size()' y nombre de variable único
        for (int i = 0; i < lista.size(); i++) {
            String elemento = lista.get(i); // Corregido: No usar 'lista' como nombre de variable
            System.out.println(elemento); // Corregido: Imprimir el elemento, no la palabra "alumno"
        }

        nl.close();
    }
}
