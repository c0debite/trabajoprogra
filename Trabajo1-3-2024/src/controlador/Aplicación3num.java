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
public class Aplicación3num {
    public static void main(String[] args) {

        int[] arregloNumeros = new int[3];

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            arregloNumeros[i] = teclado.nextInt();
        }



        System.out.println("Valores en el arreglo:");

        for (int i = 0; i < 3; i++) {
            System.out.println("Posición " + i + ": " + arregloNumeros[i]);
        }
    }
}
