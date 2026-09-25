package com.mycompany.examen_simulacro;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //escribe aqui tu codigo
        Scanner scanner = new Scanner(System.in);
        System.out.print("Seleccione un tipo de mesa. Para hacerlo introduce su numero de asigancion.\n1=Terraza, 2=Interior y 3=VIP: ");
        int terraza = 1;
        int interior = 2;
        int vip = 3;
        int tipoMesa = scanner.nextInt();
        boolean disponible = (tipoMesa == terraza) || (tipoMesa == interior) || (tipoMesa == vip);
        System.out.println("Es disponible?: "+disponible);
    }
}