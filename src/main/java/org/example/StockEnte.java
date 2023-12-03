package org.example;

public class StockEnte implements Ente{

    @Override
    public void fliegen() {
        System.out.println("Ich fliege 500 meter");
    }

    @Override
    public void quaken() {
        System.out.println("Quak");
    }
}
