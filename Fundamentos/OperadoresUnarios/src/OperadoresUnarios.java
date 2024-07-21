public class OperadoresUnarios {
    public static void main(String[] args) {
        var a = 3;
        var b = -a; // -3
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        var c = true;
        var d = !c; // false
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        // -- Incremento --
        // 1. Preincremento (simbolo antes de la variable)
        var e = 3;
        var f = ++e; // Primero se incrementa la variable e y después se asigna el valor a la variable f
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        
        // 2. Posincremento (simbolo después de la variable)
        var g = 5;
        var h = g++; // Primero se asigna el valor a la variable h y después se incrementa la variable g
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        // -- Decremento --
        // 1. Predecremento
        var i = 2;
        var j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // 2. Posdecremento
        var k = 4;
        var l = k--;
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
