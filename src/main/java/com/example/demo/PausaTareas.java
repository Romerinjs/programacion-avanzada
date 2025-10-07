package com.example.demo;

class SensorTemperatura extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Leyendo temperatura... " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }

    public static void main(String[] args) {
        new SensorTemperatura().start();
    }
}

