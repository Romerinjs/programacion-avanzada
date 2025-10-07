package com.example.demo;

class PrepararPlato extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println("Preparando plato");
    }
}

class AtenderPedido extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println("Atendiendo pedido");
    }
}

 class Restaurante {
    public static void main(String[] args) {
        new PrepararPlato().start();
        new AtenderPedido().start();
    }
}
