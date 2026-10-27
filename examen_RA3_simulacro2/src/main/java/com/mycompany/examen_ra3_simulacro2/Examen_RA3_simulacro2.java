/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.examen_ra3_simulacro2;

import java.util.Scanner;

/**
 *
 * @author andro
 */
public class Examen_RA3_simulacro2 {

    public static void main(String[] args) {
        final int MAX_PLANTAS = 4;
        final int MAX_PLAZAS = 10;
        Scanner scanner = new Scanner(System.in);
        String LINES = "---------------------";
        boolean corriendo = true;
        boolean[][] parking = new boolean[MAX_PLANTAS][MAX_PLAZAS];
        for (int i = 0; i < parking.length; i++) {
            for (int j = 0; j < parking[i].length; j++) {
                parking[i][j] = false;
            }
        }

        do {
            System.out.println(LINES);
            System.out.println("Control de ocupacion del parking.");
            System.out.println("1. Ocupar una plaza");
            System.out.println("2. Liberar una plaza");
            System.out.println("3. Mostrar estado del parking");
            System.out.println("4. Plazas libres y ocupadas por planta");
            System.out.println("5. Salir del menu");
            System.out.println("Por favor escoja una opcion del menu:");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1: //OCUPAR UNA PLAZA
                    int planta;
                    boolean aparcado = false;
                    System.out.println(LINES);
                    do {
                        System.out.println("En que planta desea aparcar el vehiculo? (1-4)");
                        planta = scanner.nextInt();
                    } while (planta < 1 || planta > 4);
                    int planta_fila = planta - 1;
                    for (int i = 0; i < MAX_PLAZAS; i++) {
                        if (!parking[planta_fila][i]) {
                            parking[planta_fila][i] = true;
                            int plaza_libre = i + 1;
                            System.out.printf("Vehiculo aparcado en planta %d, plaza %d\n", planta, plaza_libre);
                            aparcado = true;
                            break;
                        }
                    }
                    if (!aparcado) {
                        System.out.println("No hay plazas disponibles en la planta " + planta);
                    }
                    break;

                case 2: //LIBERAR UNA PLAZA
                    planta = 0;
                    int plaza = 0;
                    planta_fila = 0;
                    int plaza_columna = 0;
                    System.out.println(LINES);
                    do {
                        System.out.println("Introduzca el numero de la planta (1-4)");
                        planta = scanner.nextInt();
                    } while (planta < 1 || planta > 4);
                    do {
                        System.out.println("Introduzca el numero de la plaza (1-10)");
                        plaza = scanner.nextInt();
                    } while (plaza < 1 || plaza > 10);
                    planta_fila = planta - 1;
                    plaza_columna = plaza - 1;
                    if (parking[planta_fila][plaza_columna]) {
                        parking[planta_fila][plaza_columna] = false;
                        System.out.printf("Plaza %d de la planta %d liberada correctamente\n", plaza, planta);
                    } else {
                        System.out.println("Esa plaza ya esta libre");
                    }
                    break;

                case 3: //MOSTRAR ESTADO DEL PARKING
                    System.out.println("El estado del parking actual es:");
                    for (int i = 0; i < parking.length; i++) {
                        System.out.print("Planta " + (i + 1) + ": ");
                        for (int j = 0; j < parking[i].length; j++) {
                            if (j == 9) {
                                System.out.print(parking[i][j] + "\n");
                            } else {
                                System.out.print(parking[i][j] + ", ");
                            }
                        }
                    }
                    break;

                case 4: //PLAZAS LIBRES Y OCUPADAS POR PLANTA
                    int counter_libres = 0;
                    int counter_ocupadas = 0;
                    planta = 0;
                    System.out.println(LINES);
                    do {
                        System.out.println("Introduzca el numero de la planta (1-4)");
                        planta = scanner.nextInt();
                    } while (planta < 1 || planta > 4);
                    planta_fila = planta - 1;
                    for (int i = 0; i < parking[planta_fila].length; i++) {
                        if (parking[planta_fila][i]) {
                            counter_ocupadas++;
                        } else {
                            counter_libres++;
                        }
                    }
                    System.out.printf("Planta %d - Ocupadas: %d | Libres: %d\n", planta, counter_ocupadas, counter_libres);
                    break;

                case 5: //SALIDA
                    corriendo = false;
                    break;
            }
        } while (corriendo);
        System.out.println(LINES);
        System.out.println("Saliendo del programa...");
        System.out.println(LINES);
    }
}
