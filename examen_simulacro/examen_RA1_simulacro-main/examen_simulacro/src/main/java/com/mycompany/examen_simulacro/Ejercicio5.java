package com.mycompany.examen_simulacro;
import java.util.Scanner;
        
public class Ejercicio5 {
    public static void main(String[] args) {
        //escribe aqui tu codigo
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el precio del primer pedido:");
        double pedido1 = scanner.nextDouble();
        System.out.println("Introduce el precio del segundo pedido:");
        double pedido2 = scanner.nextDouble();
        System.out.println("Introduce el precio del tercer pedido:");
        double pedido3 = scanner.nextDouble();
        double gasto_total=pedido1+pedido2+pedido3;
        double media = gasto_total/3;
        System.out.printf("La media del precio de los tres pedidos es: %.2f euros\n",media);
        System.out.printf("El gasto total ha sido: %.2f euros\n",gasto_total);
        boolean superado80 = (gasto_total>80);
        System.out.println("El gasto total ha superado los 80 euros: "+superado80);
        
        
    }
}