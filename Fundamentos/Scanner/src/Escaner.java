import java.util.Scanner;

public class Escaner {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("Escribe tu nombre:");
        var usuario = consola.nextLine(); // El programa se detiene hasta que el usuario ingrese un dato.
        // Cuando el usuario escribe el dato y da enter, se guarda en la variable "usuario"
        System.out.println("Escribe tu título:");
        var titulo = consola.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuario);

        // Tarea: Detalles Libro
        System.out.println("Proporciona el título del libro:");
        var libro = consola.nextLine();
        System.out.println("Proporciona el autor del libro:");
        var autor = consola.nextLine();

        System.out.println(libro + " fue escrito por " + autor);
    }
}
