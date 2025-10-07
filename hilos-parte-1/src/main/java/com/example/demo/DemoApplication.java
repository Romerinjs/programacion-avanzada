package com.example.demo;

public class DemoApplication {

    public static void main(String[] args) {

        Proceso a = new Proceso("Hilo 1");
        Proceso b = new Proceso("Hilo 2");

        a.valorDeLaCondicion(2);
        b.valorDeLaCondicion(3);

        a.start();
        b.start();
    }
}
