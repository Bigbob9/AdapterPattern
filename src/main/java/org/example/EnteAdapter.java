package org.example;

public class EnteAdapter implements Truthahn{

    Ente ente;

    public EnteAdapter(Ente ente){
        this.ente = ente;
    }

    @Override
    public void fliegen() {
        ente.fliegen();
    }

    @Override
    public void kollern() {
        ente.quaken();
    }
}
