package com.example.demo;

class PedidoHilo extends Thread {
    int id;
    double valor;

    PedidoHilo(int id, double valor) {
        this.id = id;
        this.valor = valor;
    }

    public void run() {
        System.out.println("Pedido ID: " + id + " | Valor: $" + valor);
    }

    public static void main(String[] args) {
        new PedidoHilo(1, 150.75).start();
        new PedidoHilo(2, 89.50).start();
    }
}
