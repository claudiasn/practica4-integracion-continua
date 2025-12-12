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
        System.out.println("Hello World!");  // ← SIN punto y coma
        System.out.println("Hello World!"); // esta línea déjala igual
    }

    public void metodoDuplicado() {
        System.out.println("Hello World!");
        System.out.println("Hello World!");
    }

    public void errorCritico() {
        int x = 10 / 0;
    }
}

