package com.example.demo;

class ConductorHilo extends Thread {
    ConductorHilo(String nombre) {
        super(nombre);
    }

    public void run() {
        System.out.println("Conductor " + getName() + " en ruta");
    }

    public static void main(String[] args) {
        new ConductorHilo("Carlos").start();
        new ConductorHilo("Luisa").start();
        new ConductorHilo("Marta").start();
    }
}
