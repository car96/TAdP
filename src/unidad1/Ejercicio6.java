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
public class Ejercicio6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa la cantidad de km/h que quieras convertir a m/s: ");
        int vel = sc.nextInt();
        
        System.out.println(vel+"km/h son: "+(vel/3.6)+"m/s");
    }
    
}
