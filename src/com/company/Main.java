package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Bienvenido. \n Introduzca un número para analizar, por favor.");
	double a=scanner();
	comprobar(a);
    }

    private static double scanner(){
        Scanner scan = new Scanner(System.in);
        while(!scan.hasNextDouble()){ //bucle para comprobar si lo introducido por el usuario son números
            System.out.println("Valor incorrecto, por favor introduzca un número");
            scan= new Scanner(System.in);
        }
        return scan.nextDouble();
    }
    /*
    En esta función comprobamos que los valores asignados son doubles y no valores no válidos como letras o símbolos
    de batman.
     */

    private static void comprobar (double a){
        if (a < 0) {
            System.out.println("Número negativo.");
        }else{
            System.out.println("Número positivo.");
        }
    }
    /*
    Función para comprobar si el número introducido es positivo o negativo.
     */
}
