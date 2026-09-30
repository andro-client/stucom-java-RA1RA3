/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_ra1_simulacro2;

/**
 *
 * @author andro
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double precio_empleado = 32.75;
        int cuota_fija = 50;
        int empleados = (int)(Math.random()*151+100);
        double precio_final = precio_empleado*empleados+cuota_fija;
        System.out.println("En la empresa hay "+empleados+" empleados");
        System.out.printf("El coste total de polizas ha sido: %.2f euros", precio_final);
    }
    
}
