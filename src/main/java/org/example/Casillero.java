package org.example;

public class Casillero {
    private Color color;
    private Pieza pieza;
    private String notacionAlgebraica;

    public Casillero(Color color, Pieza pieza){
        this.color = color;
        this.pieza = pieza;
    }

    private boolean estaOcupado(){
        return pieza != null;
    }

    @Override
    public String toString(){
        return "Casillero|Color:" + color.toString() /*+ "|Pieza:" + pieza.toString()*/;
    }
}
