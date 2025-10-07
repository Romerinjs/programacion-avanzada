package com.example.demo;

class ServidorCarga extends Thread {
    String nombre;

    ServidorCarga(String nombre) {
        this.nombre = nombre;
    }

    public void run() {
        for (int i = 1; i <= 100; i += 20) {
            System.out.println(nombre + " - Progreso: " + i + "%");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
        System.out.println(nombre + " - Carga completa");
    }

    public static void main(String[] args) {
        new ServidorCarga("Servidor 1").start();
        new ServidorCarga("Servidor 2").start();
        new ServidorCarga("Servidor 3").start();
    }
}
