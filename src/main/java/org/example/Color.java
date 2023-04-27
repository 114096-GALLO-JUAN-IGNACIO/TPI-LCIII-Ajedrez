package org.example;

public enum Color {
    BLANCO,
    NEGRO;

    public Color colorOpuesto(){
        return this == Color.BLANCO ? Color.NEGRO : Color.BLANCO;
    }
}
