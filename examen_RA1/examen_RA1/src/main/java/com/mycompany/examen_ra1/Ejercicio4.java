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
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("======= Elija una categoria de vehiculo. =======\nEconomico=1, Ejecutivo=2 y Independencia=3: ");
        int economico = 1;
        int ejecutivo = 2;
        int independencia = 3;
        int categoriaVehiculo = scanner.nextInt();
        boolean contrato_firmado = true;
        boolean valido = (categoriaVehiculo == economico || categoriaVehiculo == ejecutivo || categoriaVehiculo == independencia) && contrato_firmado;
        System.out.printf("La opcion %d es valida y el contrato esta firmado?: %b", categoriaVehiculo, valido);
    }
}
