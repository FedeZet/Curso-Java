public class OperadoresCondicionales {
    public static void main(String[] args) {
        var a = -1;
        var valorMinimo = 0;
        var valorMaximo = 10;

        var resultado = a >= valorMinimo && a <= valorMaximo; // En ambos caso es true.
        // Operador Condicional AND (&&): Verifica si en ambos caso el resultado es true, si no es así, entonces será false

        if(resultado) {
            System.out.println("Dentro de rango");
        } else {
            System.out.println("Fuera de rango");
        }

        // Operador Condicional OR (||): Verifica si en uno u otro resultado es verdadero
        var vacaciones = false;
        var diaDescanso = true;

        if (vacaciones || diaDescanso) {
            System.out.println("Padre puede asistir al juego del hijo");
        } else {
            System.out.println("El padre esta ocupado");
        }
    }
}
