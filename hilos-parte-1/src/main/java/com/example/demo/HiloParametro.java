package com.example.demo;

class CajeroHilo extends Thread {
    int transacciones;

    CajeroHilo(int transacciones) {
        this.transacciones = transacciones;
    }

    public void run() {
        for (int i = 1; i <= transacciones; i++) {
            System.out.println("Procesando transacción " + i);
        }
    }

    public static void main(String[] args) {
        new CajeroHilo(5).start();
    }
}
