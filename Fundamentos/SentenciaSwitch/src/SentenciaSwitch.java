public class SentenciaSwitch {
    public static void main(String[] args) {
        var numero = 2;
        var numeroTexto = "Valor desconocido";

        // Es una buena sentencia de control para menús y tareas que con if-else sería engorroso
        switch (numero) {
            case 1:
                numeroTexto = "Número 1";
                break;
            case 2:
                numeroTexto = "Número 2";
                break;
            case 3:
                numeroTexto = "Número 3";
                break;
            case 4:
                numeroTexto = "Número 4";
                break;
            default: // Opcional
                numeroTexto = "Caso no encontrado";
        }

        System.out.println("numeroTexto = " + numeroTexto);
    }
}
