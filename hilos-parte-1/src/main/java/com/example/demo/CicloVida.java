package com.example.demo;

class DescargaHilo extends Thread {
    public void run() {
        System.out.println("Estado durante ejecución: " + getState());
    }

    public static void main(String[] args) {
        DescargaHilo hilo = new DescargaHilo();
        System.out.println("Estado antes de iniciar: " + hilo.getState());
        hilo.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {}
        System.out.println("Estado después de ejecución: " + hilo.getState());
    }
}
