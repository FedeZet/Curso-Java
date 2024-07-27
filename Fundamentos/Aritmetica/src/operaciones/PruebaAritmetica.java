package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 2;
        aritmetica1.sumar();

        int resultado = aritmetica1.sumarConRetorno();
        // Es necesario que la variable sea igual al tipo de
        // dato que retornará el método en este caso un int.
        System.out.println("resultado desde la clase PruebaAritmetica = " + resultado);

        resultado = aritmetica1.sumarConArgumentos(5, 8);
        // Cuando pasamos los valores hacia el método se le llaman parámetros
        // al definir el método se le llaman argumentos.
        System.out.println("resultado usando argumentos = " + resultado);
    }
}
