/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.examen_ra3_simulacro;

import java.util.Scanner;

/**
 *
 * @author andro
 */
public class Examen_RA3_simulacro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MIN_ALUMNO = 1;
        final int MAX_ALUMNO = 10;
        final int MIN_MODULOS = 1;
        final int MAX_MODULOS = 4;
        final int NOTA_MAXIMA = 10;
        final int NOTA_MINIMA = 0;


        int[][] matrizAlumnos = new int[MAX_ALUMNO][MAX_MODULOS];
        for (int i = 0; i < matrizAlumnos.length; i++) {
            for (int j = 0; j < matrizAlumnos[i].length; j++) {
                matrizAlumnos[i][j] = -1;
            }
        }

        boolean running = true;
        int opcion;
        do {
            System.out.println();
            System.out.println("--------------------------------");
            System.out.println("1. Alta notas de un alumno");
            System.out.println("2. Nota media del alumnado por modulo");
            System.out.println("3. Alumno con nota mas alta por modulo");
            System.out.println("4. Porcentaje de aprobados por modulo");
            System.out.println("5. Salir");
            System.out.println("--------------------------------");
            System.out.print("Introduzca el numero de la opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1: //ALTA NOTAS DE UN ALUMNO
                    String continuar;
                    int entradaAlumno;
                    int entradaModulo;
                    int nota;
                    System.out.println("--------------------------------");
                    System.out.println("Introduzca el numero de alumno:");
                    entradaAlumno = scanner.nextInt();
                    if (entradaAlumno > MAX_ALUMNO || entradaAlumno < MIN_ALUMNO) {
                        do {
                            System.out.printf("El alumno numero %d no existe, por favor vuelva a introducir el numero\n", entradaAlumno);
                            entradaAlumno = scanner.nextInt();
                        } while (entradaAlumno > MAX_ALUMNO || entradaAlumno < MIN_ALUMNO);
                    }
                    do {
                        System.out.println("Introduzca el modulo de alumno (1-4):");
                        entradaModulo = scanner.nextInt();
                        if (entradaModulo > MAX_MODULOS || entradaModulo < MIN_MODULOS) {
                            do {
                                System.out.printf("No existe modulo %d, por favor vuelva a introducir el numero de modulo (1-4)\n", entradaModulo);
                                entradaModulo = scanner.nextInt();
                            } while (entradaModulo > MAX_MODULOS || entradaModulo < MIN_MODULOS);
                        }
                        System.out.println("Introduzca la nota de alumno (1-10):");
                        nota = scanner.nextInt();
                        scanner.nextLine();
                        if (nota > NOTA_MAXIMA || nota < NOTA_MINIMA) {
                            do {
                                System.out.printf("El valor %d no se puede asignar a la nota, por favor vuelva a introducir el numero (1-10)\n", nota);
                                nota = scanner.nextInt();
                                scanner.nextLine();
                            } while (nota > NOTA_MAXIMA || nota < NOTA_MINIMA);
                        }
                        matrizAlumnos[entradaAlumno - 1][entradaModulo - 1] = nota;
                        System.out.println("Desea poner mas notas para este alumno? (S/N)");
                        continuar = scanner.nextLine(); //V
                        if (!"S".equalsIgnoreCase(continuar) && !"N".equalsIgnoreCase(continuar)) {
                            do {
                                System.out.println("Por favor introduzca 'S' para continuar o 'N' para salir");
                                continuar = scanner.nextLine();
                            } while (!"S".equalsIgnoreCase(continuar) && !"N".equalsIgnoreCase(continuar));
                        }
                    } while (!"N".equalsIgnoreCase(continuar));
                    System.out.println("\nSaliendo al menu principal...");
                    break;

                case 2: //NOTA MEDIA DEL ALUMNADO POR MODULO
                    double sumMedia = 0;
                    int counter = 0;
                    System.out.println("--------------------------------");
                    System.out.println("Para comprobar la media del alumnado escriba el numero del modulo:");
                    entradaModulo = scanner.nextInt();
                    if (entradaModulo > MAX_MODULOS || entradaModulo < MIN_MODULOS) {
                        do {
                            System.out.printf("No existe modulo %d, por favor vuelva a introducir el numero de modulo (1-4)\n", entradaModulo);
                            entradaModulo = scanner.nextInt();
                        } while (entradaModulo > MAX_MODULOS || entradaModulo < MIN_MODULOS);
                    }
                    for (int i = 0; i < matrizAlumnos.length; i++) {
                        if (matrizAlumnos[i][entradaModulo - 1] != -1) {
                            sumMedia += matrizAlumnos[i][entradaModulo - 1];
                            counter++;
                        }
                    }
                    double average = sumMedia / counter;
                    System.out.printf("La nota media del alumnado del modulo %d es: %.2f", entradaModulo, average);
                    break;

                case 3: //ALUMNO CON NOTA MAS ALTA POR MODULO
                    System.out.println("--------------------------------");
                    System.out.println("Para mirar la nota mas alta de un modulo introduzca su numero:");
                    entradaModulo = scanner.nextInt();
                    if (entradaModulo > MAX_MODULOS || entradaModulo < MIN_MODULOS) {
                        do {
                            System.out.printf("No existe modulo %d, por favor vuelva a introducir el numero de modulo (1-4)\n", entradaModulo);
                            entradaModulo = scanner.nextInt();
                        } while (entradaModulo > MAX_MODULOS || entradaModulo < MIN_MODULOS);
                    }
                    int mejorNota = matrizAlumnos[0][entradaModulo - 1];
                    int mejorAlumno = 0;
                    for (int i = 0; i < matrizAlumnos.length; i++) {
                        if (matrizAlumnos[i][entradaModulo - 1] > mejorNota) {
                            mejorNota = matrizAlumnos[i][entradaModulo - 1];
                            mejorAlumno = i;
                        }
                    }
                    if (mejorNota == -1) {
                        System.out.println("No hay notas en este modulo");
                    } else {
                        System.out.printf("La nota mas alta del modulo %d es del alumno %d que es: %d", entradaModulo, mejorAlumno + 1, mejorNota);
                    }
                    break;

                case 4: //PORCENTAJE APROBADOS POR MODULO
                    System.out.println("--------------------------------");
                    System.out.println("Para mirar el porcentaje de aprobados por modulo introduzca su numero:");
                    entradaModulo = scanner.nextInt();
                    if (entradaModulo > MAX_MODULOS || entradaModulo < MIN_MODULOS) {
                        do {
                            System.out.printf("No existe modulo %d, por favor vuelva a introducir el numero de modulo (1-4)\n", entradaModulo);
                            entradaModulo = scanner.nextInt();
                        } while (entradaModulo > MAX_MODULOS || entradaModulo < MIN_MODULOS);
                    }
                    int counter_aprobados = 0;
                    int counter_suspenso = 0;
                    double porcentaje_aprobados = 0;
                    for (int i = 0; i < matrizAlumnos.length; i++) {
                        if (matrizAlumnos[i][entradaModulo - 1] >= 5 && matrizAlumnos[i][entradaModulo - 1] != -1) {
                            counter_aprobados++;
                        } else if (matrizAlumnos[i][entradaModulo - 1] < 5 && matrizAlumnos[i][entradaModulo - 1] != -1) {
                            counter_suspenso++;
                        }
                    }
                    int alumnos = counter_suspenso + counter_aprobados;
                    if (alumnos == 0) {
                        System.out.println("No hay alumnos de este modulo en la base de datos");
                    } else {
                        porcentaje_aprobados = (double) counter_aprobados / alumnos * 100;
                        System.out.printf("El porcentaje de aprobados del modulo %d es: %.2f%%\n", entradaModulo, porcentaje_aprobados);
                    }
                    break;

                case 5: //SALIDA
                    running = false;
                    break;
            }
        } while (running != false);
        System.out.println("Saliendo del programa...");
    }
}
