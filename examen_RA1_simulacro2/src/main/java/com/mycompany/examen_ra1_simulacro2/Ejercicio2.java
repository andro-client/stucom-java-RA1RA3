/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_ra1_simulacro2;

/**
 *
 * @author andro
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int prima_euros = 150;
        double cambio_a_dolares = 1.15;
        double impuesto_adicional = 2.50;
        double recibo = (prima_euros+impuesto_adicional)*cambio_a_dolares;
        System.out.printf("El recibo final en dolares estadounidenses es: %.2f dolares", recibo);
    }
    
}
