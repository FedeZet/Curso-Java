public class Ciclos {
    public static void main(String[] args) {
        var contador = 0;

        System.out.println("While:");
        while (contador < 3) {
            System.out.println("contador = " + contador);
            contador++;
        }

        // Ciclo Do While
        var contador2 = 0;
        System.out.println("Do While:");
        do {
            System.out.println("contador2 = " + contador2);
            contador2++;
        } while (contador2 < 3);

        // Ciclo For
        System.out.println("For:");
        for (var i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("Break:");
        for (var i = 0; i < 3; i++) {
            if (i % 2 == 0) {
                System.out.println("i = " + i);
                break; // Termina el ciclo for
            }
        }

        System.out.println("Continue:");
        for (var i = 0; i < 3; i++) {
            if (i % 2 != 0) {
                continue; // Ir a la siguiente iteración
            }
            System.out.println("i = " + i);
        }

        // Etiquetas - NO es recomendada su utilización
        System.out.println("Etiquetas:");
        inicio:
        for (var i = 0; i < 3; i++) {
            if (i % 2 != 0) {
                continue inicio; // Ir a la línea de código de la etiqueta
            }
            System.out.println("i = " + i);
        }
    }
}
