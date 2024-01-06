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
public class Matriz5x5 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        System.out.println("Ingrese los valores para la matriz de 5x5:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento en la fila " + (i + 1) + " y columna " + (j + 1) + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Muestra la matriz
        System.out.println("Matriz ingresada:");
        mostrarMatriz(matriz);

        // Calcular y mostrar la sumatoria de cada fila
        for (int i = 0; i < 5; i++) {
            int sumatoriaFila = 0;
            for (int j = 0; j < 5; j++) {
                sumatoriaFila += matriz[i][j];
            }
            System.out.println("Sumatoria de la fila " + (i + 1) + ": " + sumatoriaFila);
        }

        // Calcular y mostrar la sumatoria de cada columna
        for (int j = 0; j < 5; j++) {
            int sumatoriaColumna = 0;
            for (int i = 0; i < 5; i++) {
                sumatoriaColumna += matriz[i][j];
            }
            System.out.println("Sumatoria de la columna " + (j + 1) + ": " + sumatoriaColumna);
        }

 
    }

    // Método para mostrar la matriz
    private static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}    

