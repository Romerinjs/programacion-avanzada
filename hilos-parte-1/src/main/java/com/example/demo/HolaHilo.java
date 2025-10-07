package com.example.demo;
class HiloActivo extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("El sistema está activo - " + getName());
        }
    }

    public static void main(String[] args) {
        HiloActivo hilo = new HiloActivo();
        hilo.start();
    }
}
