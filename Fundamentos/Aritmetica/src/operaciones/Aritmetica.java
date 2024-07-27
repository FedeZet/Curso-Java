package operaciones;

public class Aritmetica {
    // Atributos de la clase
    int a;
    int b;

    // Métodos de la clase
    public void sumar() { // Es un método void (vacío en inglés) no retorna nada
        int resultado = a + b; // Esta variable es local al método, al finalizar se elimina
        System.out.println("resultado = " + resultado);
    }

    public int sumarConRetorno() { // Es un método que retornará una información tipo int
        // int resultado = a + b;
        // return resultado;

        return a + b;
    }

    public int sumarConArgumentos(int a, int b) {
        // This es para hacer referencia a información de la propia clase (opcional)
        // Es una buena práctica para saber que utilizamos un atributo o método de la clase
        this.a = a; // El argumento a se asigna al atributo this.a (atributo de la clase)
        this.b = b;
        // return a + b;
        return this.sumarConRetorno(); // Se puede llamar un método desde otro método (Reutilizar)
        // Esto es una manera para no repetir código en el caso de que sea complejo
        // y/o sea necesario
    }
}
