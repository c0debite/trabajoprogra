/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author steven
 */
public class Aplicacióntamaño10 {
    public static void main(String[] args) {

        long[] primerArreglo = new long[10];
        for (int i = 0; i < 10; i++) {
            primerArreglo[i] = i * 10; 
        }

        long[] segundoArreglo = new long[10];

        for (int i = 0; i < 10; i++) {
            segundoArreglo[i] = primerArreglo[i];
        }

        System.out.println("Elementos del segundo arreglo:");
        for (int i = 0; i < 10; i++) {
            System.out.println(segundoArreglo[i]);
        }
    }
}