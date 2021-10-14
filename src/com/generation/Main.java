package com.generation;


public class Main {

    public static void main(String[] args) {
        /*
        String mensaje = saludar( "Alfonso cruz");
        System.out.println(mensaje);
        int resultado = suma(5, 3);
        System.out.println(resultado);
        alerta("mensaje de prueba");
        */
        /*
        //libreria math
        double numero1 = 13.75;
        double numero2 = 23.12;
        System.out.println(Math.ceil(numero1));
        System.out.println(Math.sqrt(numero1));
        */

        String mensaje1 = "hola";
        String mensaje2 = "adios";
        // lenght devuelve el numero de caracteres de una cadena (string)
        System.out.println(mensaje2.length());
        //equals reaaliza la comparacion de dos cadenas y devuelve un true si son iguales y falce si son distintas
        System.out.println(mensaje1.equals(mensaje1));
        //equalsIgnoreCase compara dos cademas pero no importa si estas estan escritas con mausculas o minusculas
        System.out.println(mensaje2.equalsIgnoreCase(mensaje1));



    }

    public static String saludar(String nombre) {
        return "Hola como estas " + nombre;

    }

    public static int suma(int num1, int num2) {
        return num1 + num2;
    }
    public void alerta(String mensaje) {
        System.out.println(mensaje);
    }
}
