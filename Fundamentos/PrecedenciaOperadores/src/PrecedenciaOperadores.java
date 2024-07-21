public class PrecedenciaOperadores {
    public static void main(String[] args) {
        var x = 5;
        var y = 10;
        var z = ++x + y--;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        var resultado = 4 + 5 * 6 / 3; // Orden de prioridad: 4 + ((5 * 6) / 3)
        System.out.println("resultado = " + resultado); // 14

        resultado = (4 + 5) * 6 / 3; // Los paréntesis son orden de prioridad
        System.out.println("resultado = " + resultado); // 18
    }
}
