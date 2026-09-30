/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_ra1_simulacro2;
import java.util.Scanner;

/**
 *
 * @author andro
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el tipo de cobertura disponible.");
        System.out.print("1=Basica, 2=Estandar y 3=Premium: ");
        int basica = 1;
        int estandar = 2;
        int premium = 3;
        int tipoCobertura = scanner.nextInt();
        boolean poliza_activa = true;
        boolean disponible = (tipoCobertura == basica || tipoCobertura == estandar || tipoCobertura == premium) && poliza_activa == true;
        System.out.println("El tipo de cobertura es disponible? "+disponible);
    }
    
}
