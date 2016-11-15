package com.batallanaval;

import com.batallanaval.core.Tablero;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        System.out.println("Batalla Naval");
        System.out.print("Numero de barcos: ");
        int nb = s.nextInt();
        int turno = 1;
        int posicion = -1;

        // Se inicializan los tableros de los jugadores
        Tablero jugador1 = new Tablero(nb);
        Tablero jugador2 = new Tablero(nb);

        while(turno <= 5){
            // turno jugador 1
            System.out.println("Turno["+turno+"] del Jugador 1:");
            System.out.println("Vidas oponente: "+jugador2.getVidas());
            while(posicion > 50 || posicion < 0){
                System.out.print("Atacar posicion [1-50]: ");
                posicion = s.nextInt();
            }
            jugador2.atacar(posicion-1);
            jugador2.mostrarTablero();



            // turno jugador 2
            System.out.println("Turno["+turno+"] del Jugador 2:");
            System.out.println("Vidas oponente: "+jugador1.getVidas());
            while(posicion > 50 || posicion < 0){
                System.out.print("Atacar posicion [1-50]: ");
                posicion = s.nextInt();
            }
            jugador1.atacar(posicion-1);
            jugador1.mostrarTablero();

            turno++;
        }

    }
}

