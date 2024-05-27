public class Variables {
    public static void main(String[] args) {
        /*
        Tipos de variables: Primitivas y Referenciales
        Primitivas: Enteros y Flotantes
        Referenciales: Clases, Interfaces, Arrays
         */

        int miVariableEntera = 10; // Variable de números enteros, inicializar/definir variable en 10, Notación camelCase
        System.out.println(miVariableEntera); // Imprimir variable en consola

        // Redefinir/Reasignar dato a una variable
        // Al reasignar un nuevo dato, ya no es necesario definir el tipo de variable.
        miVariableEntera = 5;
        // Al escribir "sout" el IDE automáticamente ingresa "System.out.println();"
        System.out.println(miVariableEntera);

        String miVariableCadena = "Saludos"; // Variable de cadena/texto
        System.out.println(miVariableCadena);

        miVariableCadena = "Adiós";
        System.out.println(miVariableCadena); // Con Ctrl + Clic el IDE te lleva a la definición de la variable.

        /*
         var - Inferencia de tipos en Java, dependiendo del dato que se le asigne,
         si es una cadena inferirá que es String, si es un número entero entonces Integer
         */
        var miVariableEntera2 = 15; // Infiere que es de tipo Int
        System.out.println(miVariableEntera2);

        var miVariableCadena2 = "Esta nueva variable";
        System.out.println("miVariableCadena2 = " + miVariableCadena2); // soutv

        // Reglas de variables, valores permitidos en el nombre de las variables.
        // Se recomienda la notación de camelCase (la primera letra en minúscula y por cada palabra la primera
        // letra en mayúscula)
        var miVariable = 1; // La más común
        var _miVariable = 2;
        var $miVariable = 3;
        // var áVariable = 4; // NO se recomienda utilizar letras con acentos en las variables.
        // var #miVariable = 5; // No se pueden utilizar carácteres especiales
        System.out.println(miVariable + _miVariable + $miVariable);

        // ==== Concatenación ====
        var usuario = "Juan";
        var titulo = "Ingeniero";

        var union = titulo + " " + usuario; // Concatenar dos variables string, el espacio es un dato cadena más
        System.out.println("union = " + union);

        // No se debe utilizar una palabra reservada de Java para nombrar una variable. Ej. void
        var i = 3; // No se recomienda tener una letra como nombre de variable
        var j = 4;
        System.out.println(i + j); // Al agregar el "+" entre dos variables de enteros, en vez de concatenar, se suman
        System.out.println(i + j + usuario); // Primero se suma y después se concatena el resultado con el string
        System.out.println(usuario + i + j);
        // Contexto cadena: Si encuentra una cadena de izquierda a derecha, entonces lo demás se concatena
        System.out.println(usuario + (i + j));
        // Si están entre paréntesis, primero se realiza la suma y después la concatenación

        // ==== Caracteres especiales ====
        var nombre = "Yamila";

        System.out.println("Nueva línea: \n" + nombre); // Para hacer un salto de línea se utiliza "\n"
        System.out.println("Tabulador: \t" + nombre); // Con "\t" imprime una tabulación
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("Comillas simples: \'" + nombre + "\'");
        System.out.println("Comillas dobles: \"" + nombre + "\"");
    }
}
