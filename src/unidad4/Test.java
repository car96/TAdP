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
public class Test {
    public static void main(String[] args){
        MiThread t1 = new MiThread();
        t1.setName("Thread 1");
        t1.setPriority(Thread.MIN_PRIORITY);
        
        MiThread t2 = new MiThread();
        t2.setName("Thread 2");
        t2.setPriority(Thread.MAX_PRIORITY);
        
        t1.start();
        t2.start();
    }
    
}
