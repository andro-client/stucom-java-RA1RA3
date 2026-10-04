/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen_ra1;

/**
 *
 * @author andro
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        double alquiler_base = 95.00;
        double iva = 1.21;
        double precio_total = alquiler_base*iva;
        System.out.printf("El precio final del alquiler de un vehiculo es: %.2f euros", precio_total);
    }
}
