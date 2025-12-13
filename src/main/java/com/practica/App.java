package com.practica;

public class App 
{
    public static void main(String[] args) {
        App app = new App();
        app.errorCritico();  // <-- Bug crítico ejecutándose
    }

    // ERROR CRÍTICO: división entre cero
    public int errorCritico() {
        int x = 10 / 0; // SonarCloud lo marca como "Bug crítico"
        return x;
    }

    // DUPLICACIÓN PARA WARNING EXTRA
    public void duplicado() {
        System.out.println("Hola");
        System.out.println("Hola");
    }
}
