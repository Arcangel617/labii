package com.batallanaval.core;

/**
 * Created by arcangel on 14/11/16.
 */
public class Tablero {
    private Celda celdas[] = new Celda[50];
    private int vidas;

    /**
     * Constructor de la clase Tablero.
     * Al instanciarse se instancian los barcos de manerá automática.
     * @param barcos
     */
    public Tablero(int barcos){
        this.instanciarBarcos(barcos);
        this.completarTablero();
        this.vidas = barcos;
    }

    /**
     * Retorna la vida restante de un jugador. Este valor está dado por
     * el numero de barcos que se indiquen.
     * @return int
     */
    public int getVidas(){
        return this.vidas;
    }

    /**
     * Se encarga de actualizar el estado del objeto al efectuarse un
     * ataque exitoso. Caso contrario informará del fallo.
     * @param posicion
     */
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
            System.out.println("Ups! Parece que ya habias atacado esa posición.");
        }
    }

    /**
     * Se ejecuta al instanciarse un Tablero. Recibe como parámetro el
     * número de barcos los cuales serán instanciados en el tablero de manera
     * aleatoria.
     * @param barcos
     */
    private void instanciarBarcos(int barcos){
        while(barcos > 0) {
            for (int i = 0; i < this.celdas.length; i++) {
                if (Math.round(Math.random()) == 1 && celdas[i] == null) {
                    celdas[i] = new Celda();
                    celdas[i].setEnUso();
                    barcos--;
                    /*
                    * Si durante la primer recorrida se logran instanciar todos
                    * los barcos, se forzará la salida del bucle.
                    * */
                    if (barcos == 0) {
                        break;
                    }
                }
            }
        }
    }

    /**
     * Se ejecuta luego de instanciar los barcos. Completará las celdas restantes
     * con valores por defecto.
     */
    private void completarTablero(){
        for (int i = 0; i < this.celdas.length; i++) {
            if (this.celdas[i] == null){
                this.celdas[i] = new Celda();
            }
        }
    }

    /**
     * Muestra el tablero de un jugador. A diferencia del método
     * mostrarBarcos() éste método muestra el estado actual del tablero
     * durante un determinado turno.
     */
    public void mostrarTablero(){
        System.out.println("==============================");
        for (int i = 1; i <= this.celdas.length; i++) {
            if (i % 10 == 0){
                System.out.println(this.celdas[i-1]);
            } else {
                System.out.print(this.celdas[i-1]);
            }
        }
        System.out.println("==============================");
    }

    /**
     * Muestra la posición de todos los barcos en el tablero.
     */
    public void mostrarBarcos(){
        System.out.println("==============================");
        for (int i = 1; i <= this.celdas.length; i++) {
            if (i % 10 == 0){
                if (celdas[i-1].getTieneBarco() && celdas[i-1] != null){
                    System.out.println(" X ");
                } else {
                    System.out.println(this.celdas[i-1]);
                }
            } else {
                if (celdas[i-1].getTieneBarco() && celdas[i-1] != null){
                    System.out.print(" X ");
                } else {
                    System.out.print(this.celdas[i-1]);
                }
            }
        }
        System.out.println("==============================");
    }
}
