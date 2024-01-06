/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.Scanner;

/**
 *
 * @author steven
 */
public class Arreglochar {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo (entre 10 y 20): ");
        int tamanoArreglo = scanner.nextInt();

        if (tamanoArreglo < 10 || tamanoArreglo > 20) {
            System.out.println("El tamaño del arreglo debe estar entre 10 y 20.");
            return;
        }
      
        char[] arregloChar = new char[tamanoArreglo];

        for (int i = 0; i < tamanoArreglo; i++) {
            System.out.print("Ingrese el valor para el elemento " + (i + 1) + ": ");
            arregloChar[i] = scanner.next().charAt(0);
        }

        System.out.println("Valores en orden inverso:");

        for (int i = tamanoArreglo - 1; i >= 0; i--) {
            System.out.print(arregloChar[i] + " ");
        }
    }
}

