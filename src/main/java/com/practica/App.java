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
        App app = new App();
        app.errorCritico();  // Sonar lo detecta como BUG BLOQUEANTE
        System.out.println("Programa funcionando");
    }

    // BUG CRÍTICO: división por cero → SonarCloud lo marca como Blocker Issue
    public void errorCritico() {
        int x = 10 / 0;  
    }
}

