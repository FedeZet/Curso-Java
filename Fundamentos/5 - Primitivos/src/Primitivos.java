public class Primitivos {
    public static void main(String[] args) {
        /*
        Tipos primitivos enteros: byte, short, int y long
         */

        // Byte (8 bits)
        byte numeroByte = 10;
        System.out.println("numeroByte = " + numeroByte);
        byte numeroByteConvertido = (byte)129; // Convertirlo a un tipo Byte, obliga al compilar convertir el dato a un tipo Byte
        System.out.println("numeroByteConvertido = " + numeroByteConvertido); // Resultado: -127, no puede superar el valor permitido
        System.out.println("Valor mínimo del byte: " + Byte.MIN_VALUE); // -128
        System.out.println("Valor máximo del byte: " + Byte.MAX_VALUE); // 127

        // Short (16 bits)
        short numeroShort = 10;
        System.out.println("numeroShort = " + numeroShort);
        short numeroShortConvertido = (short)32768; // Convertirlo a un tipo Short, obliga al compilar convertir el dato a un tipo Short
        System.out.println("numeroShortConvertido = " + numeroShortConvertido); // Resultado: -127, no puede superar el valor permitido
        System.out.println("Valor mínimo del short: " + Short.MIN_VALUE); // -32768
        System.out.println("Valor máximo del short " + Short.MAX_VALUE); // 32767

        // Int (32 bits) - Más común
        int numeroInt = 10;
        System.out.println("numeroInt = " + numeroInt);
        int numeroIntConvertido = (int)2147483648L; // Convirtiendo a una Long utilizando la literal "L"
        System.out.println("numeroIntConvertido = " + numeroIntConvertido);
        System.out.println("Valor mínimo del int " + Integer.MIN_VALUE); // -2147483648
        System.out.println("Valor máximo del int " + Integer.MAX_VALUE); // 2147483647

        // Long (64 bits)
        long numeroLong = 10;
        System.out.println("numeroLong = " + numeroLong);
        long numeroLongConvertido = (long)9223372036854775808D;
        System.out.println("numeroLongConvertido = " + numeroLongConvertido);
        System.out.println("Valor mínimo del long: " + Long.MIN_VALUE); // -9223372036854775808
        System.out.println("Valor máximo del long: " + Long.MAX_VALUE); // 9223372036854775807

        /*
        Tipos Primitivos Flotantes: float y double
         */

        // Float (32 bits)
        float numeroFloat = (float)10.0;
        System.out.println("numeroFloat = " + numeroFloat);
        float numeroFloatConvertido = (float)3.4028236E38D;
        System.out.println("numeroFloatConvertido = " + numeroFloatConvertido);
        System.out.println("Valor mínimo del float: " + Float.MIN_VALUE); // 1.4E-45
        System.out.println("Valor máximo del float: " + Float.MAX_VALUE); // 3.4028235E38

        // Double (64 bits)
        double numeroDouble = 10;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor mínimo del double: " + Double.MIN_VALUE); // 4.9E-324
        System.out.println("Valor máximo del double: " + Double.MAX_VALUE); // 1.7976931348623157E308

        // Inferencias
        var numEntero = 10;
        System.out.println("numEntero = " + numEntero);

        var numDouble = 10.0;
        System.out.println("numDouble = " + numDouble);
        
        var numFloat = 10.0F;
        System.out.println("numFloat = " + numFloat);

        // Char (16 bits) - La variable char solo admite un carácter y se debe escribir con comillas simples
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);
        char varChar = '\u0021'; // Se pueden utilizar valores Unicode
        System.out.println("varChar = " + varChar);
        char varCharDecimal = 33; // Se puede usar los decimales para definir un símbolo
        System.out.println("varCharDecimal = " + varCharDecimal);
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);

        var varChar1 = '\u0021';
        System.out.println("varChar1 = " + varChar1);
        var varCharDecimal2 = (char)33; // Se debe especificar que tipo es, ya que si no el compilador considerará que es un int.
        System.out.println("varCharDecimal2 = " + varCharDecimal2);
        var varCharSimbolo3 = '!';
        System.out.println("varCharSimbolo3 = " + varCharSimbolo3);

        int variableEnteraSimbolo = '!'; // Convierte el char a int, obtiene el código decimal del símbolo
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);
        int letra = 'A';
        System.out.println("letra = " + letra);

        // Boolean - true or false
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);

        if (varBoolean) {
            System.out.println("La bandera es verdadera");
        } else {
            System.out.println("La bandera es falsa");
        }

        var edad = 30;
        // var esAdulto = edad >= 18;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
}
