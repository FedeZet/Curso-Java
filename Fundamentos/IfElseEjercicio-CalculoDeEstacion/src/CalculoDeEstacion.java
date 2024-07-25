import java.util.Scanner;

public class CalculoDeEstacion {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Escribe el número del mes:");
        var mes = Integer.parseInt(consola.nextLine());
        var estacion = "Estación desconocida";

        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Verano";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Otoño";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Invierno";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Primavera";
        }

        System.out.println("estacion = " + estacion);
    }
}
