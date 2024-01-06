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
public class Aplicación10elementos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] primerarreglo = new int[10];

        System.out.println("Ingrese 10 valores enteros:");
        for (int i = 0; i < primerarreglo.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            primerarreglo[i] = teclado.nextInt();
        }

        int[] segundoarreglo = new int[primerarreglo.length - 3];
        int j = 0; 

        for (int i = 0; i < primerarreglo.length; i++) {
            if (i != 2 && i != 4 && i != 8) {
                segundoarreglo[j] = primerarreglo[i];
                j++;
            }
        }
        System.out.println("Se eliminarán los elementos en las posiciones 2, 4 y 8:");
        for (int elemento : segundoarreglo) {
            System.out.print(elemento + " ");
        }

    
    }
}
