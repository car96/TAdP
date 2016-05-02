/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad4;

/**
 *
 * @author carlos
 */
public class MiThread extends Thread{
    
    public void run(){
        int i=0;
        
        while(i<5){
            System.out.println(this.getName());
            i++;
        }
    }
    
}
