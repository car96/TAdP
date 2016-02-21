/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1;

import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class Ejercicio8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa el radio de una esfera: ");
        double radio = sc.nextDouble();
        
        double v = (4/3)*Math.PI*Math.pow(radio, 3.0);
        
        System.out.println("El volumen de la esfera es: "+v);
    }
    
}
