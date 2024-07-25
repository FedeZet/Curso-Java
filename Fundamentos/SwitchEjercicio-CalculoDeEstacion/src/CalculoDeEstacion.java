import java.util.Scanner;

public class CalculoDeEstacion {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Escribe el número del mes:");
        var mes = Integer.parseInt(consola.nextLine());
        var estacion = "Estación desconocida";

        switch (mes) {
            case 1: case 2: case 12:
                estacion = "Verano";
                break;
            case 3: case 4: case 5:
                estacion = "Otoño";
                break;
            case 6: case 7: case 8:
                estacion = "Invierno";
                break;
            case 9: case 10: case 11:
                estacion = "Primavera";
                break;
        }

        System.out.println("estacion = " + estacion);
    }
}
