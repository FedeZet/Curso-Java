package clases;

// Los nombre de las clases siempre deben empezar con mayúsculas y cada primera letra
// de una palabra también debe estar en mayúscula. (PascalCase)
public class Persona { // Nombre de la clase
    // Atributos de la clase.
    // Recomendación: Los atributos deben ser definidos al inicio de la clase
    String nombre;
    String apellido;

    // Métodos de la clase
    // Los métodos se estructuran de la siguiente manera: nombredelmetodo(argumentos)
    public void desplegarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);

    }

}
