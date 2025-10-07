package com.example.demo;

class Temporizador extends Thread {
    int segundos;

    Temporizador(int segundos) {
        this.segundos = segundos;
    }

    public void run() {
        System.out.println("Iniciando tarea por " + segundos + " segundos...");
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {}
        System.out.println("Tarea completada.");
    }

    public static void main(String[] args) {
        new Temporizador(5).start();
    }
}
