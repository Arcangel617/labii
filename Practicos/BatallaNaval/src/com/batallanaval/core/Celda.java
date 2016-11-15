package com.batallanaval.core;

/**
 * Created by arcangel on 14/11/16.
 */
class Celda {
    private String valor = " ~ ";
    private boolean activo = true;
    private boolean tieneBarco = false;

    /**
     * Al efectuarse un ataque exitoso, el valor de celda cambia
     * y su estado pasa a ser inactivo.
     */
    void cambiarValor(){
        this.valor = " X ";
        this.activo = false;
    }

    /**
     * Al iniciar el juego todas las celdas se encuentran activas por lo
     * tanto el método devolverá VERDADERO. En caso de que un barco resulte
     * atacado, el estado de la celda pasará a ser inactiva, por lo tanto
     * el método devolverá FALSO.
     * @return boolean
     */
    boolean activo(){
        return this.activo;
    }

    /**
     * Verifica si una determinada celda tiene un barco instanciado.
     * En caso afirmativo el método devolverá VERDADERO. Caso Cotrario
     * el método devolverá FALSO.
     * @return boolean
     */
    boolean getTieneBarco(){
        return this.tieneBarco;
    }

    /**
     * Al instanciarse un barco se setea ese valor en la celda.
     */
    void setEnUso(){
        this.tieneBarco = true;
    }

    @Override
    public String toString(){
        return this.valor;
    }
}
