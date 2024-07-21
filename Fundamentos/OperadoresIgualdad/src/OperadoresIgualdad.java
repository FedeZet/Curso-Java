public class OperadoresIgualdad {
    public static void main(String[] args) {
        // Operadores de igualdad
        var a = 3;
        var b = 2;

        var c = (a == b); // Si a es igual a b. Resultado: False
        System.out.println("c = " + c);
        
        var d = a != b; // Si a es diferente de b. Resultado: True
        System.out.println("d = " + d);

        var cadena = "Hola";
        var cadena2 = "Hola";
        var e = cadena == cadena2; // No compara solamente el contenido de un string
        System.out.println("e = " + e);

        var f = cadena.equals(cadena2); // Esta es manera correcta de comparar el contenido de un string
        System.out.println("f = " + f);

        // Operadores relacionales

        var g = a >= b; // > (mayor que) ó >= (mayor o igual que)
        System.out.println("g = " + g);

        if (a % 2 == 0) {
            System.out.println("Es número par");
        } else {
            System.out.println("Es número impar");
        }

        var edad = 30;
        var adulto = 18;

        if (edad >= adulto) {
            System.out.println("Es un adulto");
        } else {
            System.out.println("Es menor de edad");
        }
    }
}
