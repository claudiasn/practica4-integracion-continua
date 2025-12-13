package com.practica;

public class App 
{
    public static void main(String[] args) {
        App app = new App();
        app.errorCritico();
    }

    // BUG CRÍTICO REAL: división entre cero
    public int errorCritico() {
        int a = 10;
        int b = 0;
        return a / b;   // <-- CRITICAL: Division by zero (sonar-java:S3516)
    }
}

