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
        System.out.println("Hello World!"); // Código duplicado (violación SonarCloud)
    }

    // Método duplicado para generar otra violación
    public void metodoDuplicado() {
        System.out.println("Hello World!");
        System.out.println("Hello World!"); // Código duplicado
    }

    // Error crítico detectado por SonarCloud
    public void errorCritico() {
        int x = 10 / 0; // División entre cero (bug crítico)
    }
}


