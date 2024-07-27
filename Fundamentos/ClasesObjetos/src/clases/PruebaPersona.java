package clases;

public class PruebaPersona {
    public static void main(String[] args) {
        // Declarando una variable de tipo Persona
        // Persona persona1;
        // Creando un objeto de tipo Persona. Solo así se puede acceder a los atributos
        // o métodos de la clase, para poder leerlos o modificarlos.
        // persona1 = new Persona();

        // Manera correcta de hacerlo. Al declarar la variable, también se puede crear el objeto:
        Persona persona1 = new Persona();

        persona1.nombre = "Federico";
        persona1.apellido = "Coelho";
        persona1.desplegarInformacion();

        // Se pueden crear múltiples objetos
        Persona persona2 = new Persona();

        System.out.println("persona1 = " + persona1); // persona1 = clases.Persona@2d98a335
        System.out.println("persona2 = " + persona2); // persona2 = clases.Persona@16b98e56
        // Los últimos números son el valor que asigna el compilador en memoria

        persona2.desplegarInformacion();
        // Nombre: null
        // Apellido: null
        // Cada objeto es independiente en información, al no haber asignado ningún dato, el valor es nulo

        persona2.nombre = "Juan";
        persona2.apellido = "Perez";
        persona2.desplegarInformacion();

        // Dato: Instancia de clase u objeto es exactamente lo mismo.
    }
}
