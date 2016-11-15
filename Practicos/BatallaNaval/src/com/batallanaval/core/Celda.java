package com.batallanaval.core;

/**
 * Created by arcangel on 14/11/16.
 */
public class Celda {
    private String valor = " ~ ";
    private boolean activo = true;
    private boolean enuso = false;

    public void cambiarValor(){
        this.valor = " * ";
        this.activo = false;
    }

    public boolean getEnUso(){
        return this.enuso;
    }

    public void setEnUso(){
        this.enuso = true;
    }
    @Override
    public String toString(){
        return this.valor;
    }


}
