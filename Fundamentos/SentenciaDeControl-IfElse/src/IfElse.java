public class IfElse {
    public static void main(String[] args) {
        var condicion = true;

        // 1. Sin llaves, la sentencia debe ser de una línea
        if (condicion == true)
            System.out.println("Condición verdadera");
        else
            System.out.println("Condición falsa");

        // 2. Con llaves, si la sentencia tiene más líneas, solamente funciona con llaves. RECOMENDADA
        if (condicion) { // Automáticamente si no se iguala a nada, la condición igualará a true
            System.out.println("Condición verdadera");
        } else {
            System.out.println("Condición falsa");
        }

        var numero = 3;
        var numeroTexto = "Número desconocido";

        // Ligando las sentencias if, esta es manera correcta, ya que cuando la condición es true
        // dejará de comprobar las siguientes condiciones.
        if (numero == 1) {
            numeroTexto = "Número 1";
        } else if (numero == 2) {
            numeroTexto = "Número 2";
        } else if (numero == 3) {
            numeroTexto = "Número 3";
        } else if (numero == 4) {
            numeroTexto = "Número 4";
        } else {
            numeroTexto = "Número no encontrado";
        }

        /*
        El siguiente código es ineficiente, ya que el compilador deberá corroborar por cada
        sentencia if si es true. El método anterior simplemente al encontrar la condición true
        dejará de comprobar las demás condiciones.

        if (numero == 1) {
            numeroTexto = "Número 1";
        }
        if (numero == 2) {
            numeroTexto = "Número 2";
        }
        if (numero == 3) {
            numeroTexto = "Número 3";
        }
        if (numero == 4) {
            numeroTexto = "Número 4";
        } else {
            numeroTexto = "Número no encontrado";
        }
         */

        System.out.println("numeroTexto = " + numeroTexto);
    }
}
