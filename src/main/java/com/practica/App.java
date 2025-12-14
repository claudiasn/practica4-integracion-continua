package com.practica;

public class App {

    // Método simple sin code smells ni errores
    public int calcular() {
        return 5 + 3;
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.calcular());
    }
}



