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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el valor del primer importe:");
        double importe1 = scanner.nextDouble();
        System.out.println("Introduzca el valor del segundo importe:");
        double importe2 = scanner.nextDouble();
        System.out.println("Introduzca el valor del tercer importe:");
        double importe3 = scanner.nextDouble();
        double importe_total = importe1+importe2+importe3;
        double media_calculada = importe_total/3;
        boolean superaLimit = importe_total>600;
        boolean polizaActiva = true;
        boolean sinFraude = true;
        boolean condiciones = superaLimit == true && polizaActiva == true && sinFraude == true;
        System.out.printf("La media de los tres importes ha sido: %.2f euros\n", media_calculada);
        System.out.printf("La poliza es valida para pago (supera limite y poliza activa y sin fraude): %b\n", condiciones);
        
    }
    
}
