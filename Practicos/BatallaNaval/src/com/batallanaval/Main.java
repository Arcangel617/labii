package com.batallanaval;

import com.batallanaval.core.Tablero;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        escenarioDos(15);
    }

    public static void escenarioUno(){
        Scanner s = new Scanner(System.in);
        System.out.println("Batalla Naval");
        System.out.print("Numero de barcos: ");
        int nb = s.nextInt();
        int turno = 1;
        int posicion = -1;

        // Se inicializan los tableros de los jugadores
        Tablero jugador1 = new Tablero(nb);
        Tablero jugador2 = new Tablero(nb);

        while(turno <= 10){
            // turno jugador 1
            System.out.println("Turno["+turno+"] del Jugador 1:");
            System.out.println("Vidas oponente: "+jugador2.getVidas());
            while(posicion > 50 || posicion < 0){
                System.out.print("Atacar posicion [1-50]: ");
                posicion = s.nextInt();
            }
            jugador2.atacar(posicion-1);
            jugador2.mostrarTablero();
            if (jugador2.getVidas() == 0){
                System.out.println("Has ganado!!");
                jugador2.mostrarBarcos();
                break;
            }
            posicion = -1;



            // turno jugador 2
            System.out.println("Turno["+turno+"] del Jugador 2:");
            System.out.println("Vidas oponente: "+jugador1.getVidas());
            while(posicion > 50 || posicion < 0){
                System.out.print("Atacar posicion [1-50]: ");
                posicion = s.nextInt();
            }
            jugador1.atacar(posicion-1);
            jugador1.mostrarTablero();
            if (jugador1.getVidas() == 0){
                System.out.println("Has ganado!!");
                jugador1.mostrarBarcos();
                break;
            }
            posicion = -1;

            turno++;
        }
    }

    public static void escenarioDos(int nroBarcos){
        System.out.println("Simulando escenario con "+nroBarcos+" barcos");

        // Se inicializan los tableros de los jugadores
        Tablero jugador1 = new Tablero(nroBarcos);
        Tablero jugador2 = new Tablero(nroBarcos);
        int turno = 1;
        int posicion = 0;

        while(turno <= 50){

            // turno jugador 1
            System.out.println("Turno["+turno+"] del Jugador 1:");
            System.out.println("Vidas oponente: "+jugador2.getVidas());
            jugador2.atacar(posicion);
            //jugador2.mostrarTablero();
            if (jugador2.getVidas() == 0){
                System.out.println("Has ganado!!");
                //jugador2.mostrarBarcos();
                break;
            }

            // turno jugador 2
            System.out.println("Turno["+turno+"] del Jugador 2:");
            System.out.println("Vidas oponente: "+jugador1.getVidas());
            jugador1.atacar(posicion);
            //jugador1.mostrarTablero();
            if (jugador1.getVidas() == 0){
                System.out.println("Has ganado!!");
                //jugador1.mostrarBarcos();
                break;
            }
            turno++;
            posicion++;
        }

    }
}
