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
public class Ejercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Cuál es tu nombre?: ");
        String nombre = sc.nextLine();
        
        System.out.println("Buenos días "+nombre);
    }
    
}
