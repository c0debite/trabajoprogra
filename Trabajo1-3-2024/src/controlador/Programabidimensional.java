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
public class Programabidimensional {
    public static void main(String[] args) {
        
Scanner teclado = new Scanner(System.in);

        // Se define el arreglo de 4x4
        
        int[][] arreglo = new int[4][4];

        System.out.println("Ingrese los elementos del arreglo 4x4:");
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                arreglo[i][j] = teclado.nextInt();
            }
        }
        System.out.println("Ingrese los elementos del arreglo 4x4:");
   

        
        int valorMayor = arreglo[0][0];
        int valorMenor = arreglo[0][0];
        int sumatotal = 0;

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                int valoractual = arreglo[i][j];

          
                if (valoractual > valorMayor) {
                    valorMayor = valoractual;
                }

                if (valoractual < valorMenor) {
                    valorMenor = valoractual;
                }

            
                sumatotal += valoractual;
            }
        }

     
        double valorPromedio = (double) sumatotal / (arreglo.length * arreglo[0].length);

        System.out.println("Valor Mayor: " + valorMayor);
        System.out.println("Valor Menor: " + valorMenor);
        System.out.println("Valor Promedio: " + valorPromedio);

    }

    
    
}