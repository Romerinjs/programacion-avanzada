package com.example.demo;

class RegistroPaquete extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Registrando paquete");
        }
    }
}

class CalculoCosto extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Calculando costo");
        }
    }
}

 class DosTareas {
    public static void main(String[] args) {
        new RegistroPaquete().start();
        new CalculoCosto().start();
    }
}
