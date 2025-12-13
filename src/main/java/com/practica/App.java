package com.practica;

public class App {

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.calcular());
    }

    public int calcular() {
        int a = 5;
        int b = 1;

        return a / b; // operación segura, sin warnings
    }
}
