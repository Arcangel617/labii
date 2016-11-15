package com.batallanaval.core;

/**
 * Created by arcangel on 14/11/16.
 */
public class Tablero {
    private Celda celdas[] = new Celda[50];
    private int vidas;

    public Tablero(int barcos){
        this.instanciarBarcos(barcos);
        this.completarTablero();
        this.vidas = barcos;
    }

    public int getVidas(){
        return this.vidas;
    }

    public void atacar(int posicion){
        if (this.celdas[posicion].activo()){
            if (this.celdas[posicion].getTieneBarco()){
                this.celdas[posicion].cambiarValor();
                this.vidas--;
                System.out.print("Hit!  ");
            } else {
                System.out.print("Miss! ");
            }
        } else {
            System.out.println("Ya habias seleccionado esa posición. Pierdes un turno!");
        }
    }

    private void instanciarBarcos(int barcos){
        while(barcos > 0){
            for (int i = 0; i < this.celdas.length; i++) {
                if (Math.round(Math.random()) == 1 && celdas[i] == null){
                    celdas[i] = new Celda();
                    celdas[i].setEnUso();
                    barcos--;
                }
            }
        }
    }

    private void completarTablero(){
        for (int i = 0; i < this.celdas.length; i++) {
            if (this.celdas[i] == null){
                this.celdas[i] = new Celda();
            }
        }
    }

    public void mostrarTablero(){
        for (int i = 1; i <= this.celdas.length; i++) {
            if (i % 10 == 0){
                System.out.println(this.celdas[i-1]);
            } else {
                System.out.print(this.celdas[i-1]);
            }
        }
    }

    /**
     * Muestra la posición de los barcos en el tablero
     * Nota: lo utilizo solo para debug.
     */
    public void mostrarBarcos(){
        for (int i = 1; i <= this.celdas.length; i++) {
            if (i % 10 == 0){
                if (celdas[i-1].getTieneBarco()){
                    System.out.println(" X ");
                } else {
                    System.out.println(this.celdas[i-1]);
                }
            } else {
                if (celdas[i-1].getTieneBarco()){
                    System.out.print(" X ");
                } else {
                    System.out.print(this.celdas[i-1]);
                }
            }
        }
    }
}
