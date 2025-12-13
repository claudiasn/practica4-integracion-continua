/* package com.practica;

public class App 
{
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Hello World!"); // código duplicado
    }

    // Código duplicado para asegurar fallo en SonarCloud
    public void metodoDuplicado() {
        System.out.println("Hello World!");
        System.out.println("Hello World!"); // código duplicado
    }

    // Error crítico para provocar Quality Gate FAILED
    public void errorCritico() {
        int x = 10 / 0; // Bug crítico detectado por SonarCloud
    }
} */

package com.practica;

public class App 
{
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ejecutarErrorCritico(); // <-- ahora el método problemático SÍ se usa
    }

    // Método que provoca un bug crítico detectado por SonarCloud
    public static void ejecutarErrorCritico() {
        int resultado = 10 / 0; // BUG: división entre cero
        System.out.println("Resultado: " + resultado);
    }
}


