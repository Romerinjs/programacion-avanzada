package com.example.demo;

class Cronometro extends Thread {
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println("Cuenta regresiva: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }

    public static void main(String[] args) {
        new Cronometro().start();
    }
}
