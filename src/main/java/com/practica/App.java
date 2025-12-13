package com.practica;

public class App {

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.calcular());
    }

    /**
     * Método de ejemplo que realiza una operación simple.
     * @return resultado de la operación
     */
    public int calcular() {
        int a = 5;
        int b = 1;

        return a / b;
    }
}
