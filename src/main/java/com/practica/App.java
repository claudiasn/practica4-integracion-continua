package com.practica;

public class App 
{
    // VULNERABILIDAD BLOCKER: credencial hardcodeada
    private static final String PASSWORD = "123456"; 

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.calcular());
    }

    // Code smell menor (no rompe el flujo, pero suma puntos)
    public int calcular() {
        int a = 5;
        int b = 0;

        try {
            return a / b; // Bug: división por cero detectada por Sonar
        } catch (Exception e) {
            // ❌ CATCH VACÍO → Vulnerabilidad / Bug mayor
        }

        return -1;
    }

    // Método duplicado → code smell (añade ruido al análisis)
    public void metodoDuplicado() {
        System.out.println("Hola");
        System.out.println("Hola");
    }
}

