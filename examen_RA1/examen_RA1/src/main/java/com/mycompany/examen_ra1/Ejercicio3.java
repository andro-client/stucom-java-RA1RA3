/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_ra1;
import java.util.Random;
/**
 *
 * @author andro
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Random random = new Random();
        double precio_diario = 42.75;
        int duracion_alquiler = (int)random.nextDouble(10)+5;
        int tarifa_gestion = 35;
        double precio_final = precio_diario*duracion_alquiler+tarifa_gestion;
        System.out.printf("El alquiler de un vehiculo durante %d dias es: %.2f euros", duracion_alquiler, precio_final);
        
    }
}
