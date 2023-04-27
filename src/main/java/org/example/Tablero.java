package org.example;

import java.util.ArrayList;
import java.util.List;

public class Tablero {
    private List<List<Casillero>> casilleros;
    private Integer largoTablero = 8;

    public Tablero(){
        this.casilleros = llenarTablero(largoTablero);
    }

    private List<List<Casillero>> llenarTablero(Integer largoTablero){
        Color colorCasillero = Color.BLANCO;
        List<List<Casillero>> filasDeCasilleros = new ArrayList<>();
        for(int i = 0; i < largoTablero; i++){
            List<Casillero> filaDeCasilleros = new ArrayList<Casillero>();
            for(int j = 0; j < largoTablero; j++){
                Casillero tempCasillero = new Casillero(colorCasillero, null);
                colorCasillero = colorCasillero.colorOpuesto();
                filaDeCasilleros.add(tempCasillero);
            }
            colorCasillero = colorCasillero.colorOpuesto();
            filasDeCasilleros.add(filaDeCasilleros);
        }
        return filasDeCasilleros;
    }

}
