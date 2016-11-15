package com.batallanaval.core;

/**
 * Created by arcangel on 14/11/16.
 */
public class Celda {
    private String valor = " ~ ";
    private boolean activo = true;
    private boolean tieneBarco = false;

    public void cambiarValor(){
        this.valor = " * ";
        this.activo = false;
    }

    public boolean activo(){
        return this.activo;
    }

    public boolean getTieneBarco(){
        return this.tieneBarco;
    }

    public void setEnUso(){
        this.tieneBarco = true;
    }
    @Override
    public String toString(){
        return this.valor;
    }


}
