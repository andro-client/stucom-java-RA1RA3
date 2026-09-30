package com.mycompany.examen_simulacro;

public class Ejercicio1 {
    public static void main(String[] args) {
        //escribe aqui tu codigo
        double menu = 18.50;
        double iva = 0.21;
        double preciofinal = menu+(menu*iva);
        System.out.printf("El precio del menu es: %.2f euros\n", menu);
        System.out.printf("El precio final con IVA es: %.2f euros\n", preciofinal);
    }
}