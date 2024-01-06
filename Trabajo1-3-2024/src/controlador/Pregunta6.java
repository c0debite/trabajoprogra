/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author steven
 */
public class Pregunta6 {
//Observe el siguiente fragmento de código e indique qué ocurriría al intentar ejecutarlo:
public static void main(String[] args) {
        //double data[ ];
        //data[0] = 29.95;
//Se produce error porque está mal inicializado la variable data en su arreglo
//Corregido sería así:
//El número 1 es el tamaño
        double[] data = new double[1];
        data[0] = 29.95;
    }

    
}
