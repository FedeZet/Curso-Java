import java.util.Objects;
import java.util.Scanner;

public class ConversionPrimitivos {
    public static void main(String[] args) {
        // Convertir un tipo String a un tipo int
        var edad = Integer.parseInt("20"); // Llamando el método "parseInt" de la clase "Integer"
        System.out.println("edad = " + (edad + 1)); // 21
        var edad2 = "20";
        System.out.println("edad2 = " + (edad2 + 1)); //201

        // Convertir un tipo String a un tipo double
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);

        // Pedir un valor utilizando la clase Scanner
        var consola = new Scanner(System.in);
        System.out.println("Proporciona tu edad:");
        edad = Integer.parseInt(consola.nextLine());
        System.out.println("edad = " + edad);

        // Convertir un tipo int a un tipo String
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);

        var caracter = "hola".charAt(3); // El método "charAt" pide que se le asigne un index de la cadena. Empezando por 0
        System.out.println("caracter = " + caracter);

        System.out.println("Proporciona un carácter:");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);


        // Tarea: Tienda de Libros
        // Se solicita capturar la siguiente información de una tienda de libros
        var scanner = new Scanner(System.in);
        System.out.println("Proporciona el nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Proporciona el ID:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el precio:");
        double precio = Double.parseDouble(scanner.nextLine());
        System.out.println("Proporciona el envío gratuito:");
        boolean envio = Boolean.parseBoolean(scanner.nextLine());

        System.out.println(nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envío gratuito: " + envio);
    }
}
