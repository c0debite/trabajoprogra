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
public class Diagonalsecundaria {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] arreglo = new int[4][4];

      
        System.out.println("Ingrese los elementos del arreglo (4x4):");
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                arreglo[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Elementos en la diagonal secundaria:");

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
 
                if (i + j == arreglo.length - 1) {
                    System.out.print(arreglo[i][j] + " ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println(); 
        }

    }
}