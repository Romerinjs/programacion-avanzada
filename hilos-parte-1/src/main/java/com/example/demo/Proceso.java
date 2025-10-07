package com.example.demo;

public class Proceso extends Thread{
    int num_int;

    public void valorDeLaCondicion(int num_int){
        this.num_int=num_int;
    }

    public Proceso(String nombreHilo){
        super(nombreHilo);
    }

    @Override
    public void run(){
        for(int i=0;i<num_int;i++){
            System.out.println(i + this.getName());
        }
    }

}
