package com.example.demo;

class TareaPrioridad extends Thread {
    public void run() {
        System.out.println("Ejecutando hilo: " + getName() + " con prioridad " + getPriority());
    }

    public static void main(String[] args) {
        TareaPrioridad h1 = new TareaPrioridad();
        TareaPrioridad h2 = new TareaPrioridad();
        TareaPrioridad h3 = new TareaPrioridad();

        h1.setName("Baja");
        h2.setName("Media");
        h3.setName("Alta");

        h1.setPriority(Thread.MIN_PRIORITY);
        h2.setPriority(Thread.NORM_PRIORITY);
        h3.setPriority(Thread.MAX_PRIORITY);

        h1.start();
        h2.start();
        h3.start();
    }
}
