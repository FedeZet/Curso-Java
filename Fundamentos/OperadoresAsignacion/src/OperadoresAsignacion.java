public class OperadoresAsignacion {
    public static void main(String[] args) {
        int a = 3, b = 2;
        int c = a + 5 - b; // La evaluación se ocurre de izquierda a derecha

        System.out.println("c = " + c);

        a += 1; // a = a + 1
        System.out.println("a = " + a);

        a += 3; // a = a + 3
        System.out.println("a = " + a);

        a -= 2; // a = a - 2
        System.out.println("a = " + a);

        a *= 3; // a = a * 3
        System.out.println("a = " + a);

        a /= 2; // a = a / 2
        System.out.println("a = " + a);

        a %= 5; // a = a % 5
        System.out.println("a = " + a);
    }
}
