
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

