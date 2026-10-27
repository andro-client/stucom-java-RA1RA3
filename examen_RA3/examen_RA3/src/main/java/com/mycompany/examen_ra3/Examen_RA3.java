/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.examen_ra3;

import java.util.Scanner;

/**
 *
 * @author andro
 */
public class Examen_RA3 {

    public static void main(String[] args) {
        final int MAX_CLASE = 3;
        final int MIN_CLASE = 1;
        final int MAX_PLAZAS = 12;
        final int MIN_PLAZAS = 1;
        boolean[][] gimnasio = new boolean[MAX_CLASE][MAX_PLAZAS];
        String LINES = "---------------------------------------------------";
        Scanner scanner = new Scanner(System.in);
        boolean corriendo = true;
        int opcion = 0;
        int tipoClase = 0;
        int numeroPlaza = 0;
        int claseFila = 0;
        int plazaColumna = 0;
        
        //LLENAR EL ARRAY CON FALSE 3x12
        for (int i = 0; i < gimnasio.length; i++) {
            for (int j = 0; j < gimnasio[i].length; j++) {
                gimnasio[i][j] = false;
            }
        }
        //MENU
        do {
            System.out.println(LINES);
            System.out.println("1. Reservar una plaza");
            System.out.println("2. Cancelar una reserva");
            System.out.println("3. Mostrar todas las plazas por tipo de clase");
            System.out.println("4. Porcentaje reservado por clase");
            System.out.println("5. Salir del menu");
            System.out.println("Seleccione una opcion del menu:");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1: //RESERVAR UNA PLAZA
                    tipoClase = 0;
                    do {
                        System.out.println(LINES);
                        System.out.println("En que tipo de clase quiere hacer la reserva?\n1-Yoga, 2-Spinning, 3-Boxeo:");
                        tipoClase = scanner.nextInt();
                    } while (tipoClase < MIN_CLASE || tipoClase > MAX_CLASE);
                    claseFila = tipoClase - 1;
                    boolean inscrito = false;
                    for (int i = 0; i < gimnasio[claseFila].length; i++) {
                        if (!gimnasio[claseFila][i]) {
                            gimnasio[claseFila][i] = true;
                            int plazaLibre = i + 1;
                            inscrito = true;
                            System.out.printf("Reserva confirmada en la clase %d, plaza %d\n", tipoClase, plazaLibre);
                            break;
                        }
                    }
                    if (!inscrito) {
                        System.out.println("No hay plazas disponibles para esta clase");
                    }
                    break;

                case 2: //CANCELAR UNA RESERVA
                    tipoClase = 0;
                    do {
                        System.out.println(LINES);
                        System.out.println("En que tipo de clase quiere cancelar la reserva?\n1-Yoga, 2-Spinning, 3-Boxeo:");
                        tipoClase = scanner.nextInt();
                    } while (tipoClase < MIN_CLASE || tipoClase > MAX_CLASE);
                    claseFila = tipoClase - 1;
                    numeroPlaza = 0;
                    do {
                        System.out.println(LINES);
                        System.out.println("En que plaza quiere cancelar la reserva? (1-12):");
                        numeroPlaza = scanner.nextInt();
                    } while (numeroPlaza < MIN_PLAZAS || numeroPlaza > MAX_PLAZAS);
                    plazaColumna = numeroPlaza - 1;
                    if (gimnasio[claseFila][plazaColumna]) {
                        gimnasio[claseFila][plazaColumna] = false;
                        System.out.printf("Reserva clase %d plaza %d anulada\n", tipoClase, numeroPlaza);
                    } else {
                        System.out.println("Reserva no encontrada");
                    }
                    break;

                case 3: //MOSTRAR TODAS LAS PLAZAS POR TIPO DE CLASE
                    System.out.println(LINES);
                    for (int i = 0; i < gimnasio.length; i++) {
                        System.out.printf("Clase %d: ", (i + 1));
                        switch (i) {
                            case 0:
                                System.out.print("Yoga, ");
                                break;
                            case 1:
                                System.out.print("Spinning, ");
                                break;
                            case 2:
                                System.out.print("Boxing, ");
                                break;
                        }
                        for (int j = 0; j < gimnasio[i].length; j++) {
                            if (j == gimnasio[i].length - 1) {
                                System.out.print(gimnasio[i][j] + "\n");
                            } else {
                                System.out.print(gimnasio[i][j] + ", ");
                            }
                        }
                    }
                    break;

                case 4:
                    tipoClase = 0;
                    do {
                        System.out.println(LINES);
                        System.out.println("En que tipo de clase quiere mirar el porcentaje de reservado?\n1-Yoga, 2-Spinning, 3-Boxeo:");
                        tipoClase = scanner.nextInt();
                    } while (tipoClase < MIN_CLASE || tipoClase > MAX_CLASE);
                    claseFila = tipoClase - 1;
                    int contadorReserva = 0;
                    for (int i = 0; i < gimnasio[claseFila].length; i++) {
                        if (gimnasio[claseFila][i]) {
                            contadorReserva++;
                        }
                    }
                    double porcentajeFinal = (contadorReserva / 12.00) * 100;
                    System.out.printf("Para %d plazas reservadas de un total de %d el resultado seria %.2f%%\n", contadorReserva, MAX_PLAZAS, porcentajeFinal);
                    break;

                case 5:
                    corriendo = false;
                    break;

                default:
                    System.out.println("Opcion del menu invalida, escoja un valor del 1 al 5");
                    break;
            }
        } while (corriendo);
        System.out.println(LINES);
        System.out.println("Saliendo del programa...");

    }
}
