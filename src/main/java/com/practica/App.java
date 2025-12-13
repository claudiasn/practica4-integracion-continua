package com.practica;

public class App 
{
    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.calcular());
    }

    public int calcular() {
        int a = 5;
        int b = 1; // evitar división por cero

        try {
            return a / b;
        } catch (Exception e) {
            System.out.println("Error en el cálculo: " + e.getMessage());
        }

        return -1;
    }

    public void metodoDuplicado() {
        System.out.println("Hola");
    }
}
