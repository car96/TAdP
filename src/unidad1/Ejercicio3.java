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
public class Ejercicio3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa un número entero: ");
        int num = sc.nextInt();
        
        System.out.println("Tu número es: "+num+
                            "\nEl doble de tu número es: "+(num*2)+
                            "\nEl triple de tu número es: "+(num*3));
    }
    
}
