public class OperadoresAritmeticos {
    public static void main(String[] args) {
        /*
        Operadores aritméticos: +, -, *, /, %
        Operadores relación: <, >, <=, >=, !=, ==
        Operadores lógicos: && o &, || o |, !, ^
        Operadores unitarios: ~, -
        Operadores a nivel de bits: &, |, ^, <<, >>, >>>
        Operadores de asignación: ++, --, =, *=, /=, %=, -=, <<=, >>=, >>>=, &=, |=, ^=
        Operador condicional: ?:
         */

        int a = 3, b = 2; // Se puede definir varias variables en la misma línea separando por coma, esto no se puede con var
        var resultado = a + b;
        System.out.println("resultado suma = " + resultado);

        resultado = a - b;
        System.out.println("resultado resta = " + resultado);

        resultado = a * b;
        System.out.println("resultado multiplicación = " + resultado);

        var resultado2 = 3D / b;
        System.out.println("resultado división = " + resultado2);

        resultado = a % b;
        System.out.println("resultado modulo = " + resultado);

        // Comprobar si es par o impar
        if (b % 2 == 0)
            System.out.println("Es número par");
        else
            System.out.println("Es número impar");
    }
}
