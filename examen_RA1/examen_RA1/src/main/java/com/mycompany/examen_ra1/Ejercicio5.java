/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_ra1;
import java.util.Scanner;
/**
 *
 * @author andro
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("======================================");
        System.out.println("Este programa calcula la media de 3 alquileres y dice si se pueden realizar nuevas reservas.");
        System.out.println("Cual es el coste del primer alquiler?");
        double primer_alquiler = scanner.nextDouble();
        System.out.println("Cual es el coste del segundo alquiler?");
        double segundo_alquiler = scanner.nextDouble();
        System.out.println("Cual es el coste del tercer alquiler?");
        double tercer_alquiler = scanner.nextDouble();
        System.out.println("======================================");
        double gasto_total = primer_alquiler+segundo_alquiler+tercer_alquiler;
        double media_calculada = gasto_total / 3;
        boolean superaLimite = gasto_total > 600;
        boolean contratoFirmado = true;
        boolean sinMultas = true;
        boolean condiciones = superaLimite && contratoFirmado && sinMultas;
        System.out.printf("La media calculada de los tres alquileres: %.2f euros\n", media_calculada);
        System.out.printf("El cliente puede realizar nuevas reservas (supera limite y contrato firmado y sin multas): %b\n", condiciones);
        System.out.println("======================================");
    }  
}
