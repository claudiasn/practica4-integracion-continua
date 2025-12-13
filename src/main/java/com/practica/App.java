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
        generarErrorCritico();
    }

    public static void generarErrorCritico() {
        try {
            int x = 10 / 0; // división por cero
        } catch (Exception e) {  // <-- BUG CRÍTICO según SonarCloud
            System.out.println("Error ignorado");
        }
    }
}


