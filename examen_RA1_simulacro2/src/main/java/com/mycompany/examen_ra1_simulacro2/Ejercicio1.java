/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen_ra1_simulacro2;

/**
 *
 * @author andro
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int prima_base = 45;
        int cobertura_adicional = 8;
        double iva = 1.21;
        double prima_final = (prima_base+cobertura_adicional)*iva;
        System.out.printf("La prima final del seguro de hogar es: %.2f euros", prima_final);
    }
}
