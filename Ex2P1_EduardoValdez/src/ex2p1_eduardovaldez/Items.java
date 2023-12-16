/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2p1_eduardovaldez;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author guali
 */
public class Items {
   static Scanner leer = new Scanner(System.in);
    static Random rand = new Random();
    String nombre;
    int HPpoints;
    int MPpoints;
    
    public void mochila(){
        nombre = nombre;
        System.out.println("1.- Item POCION, HPpoints = 50, MPpoints = 0\n");
        System.out.println("2.- Item ETHER, HPpoints = 0, MPpoints = 50\n");
        System.out.println("3.- Item ELIXIR, HPpoints = 100, MPpoints = 100\n");
        System.out.println("Elige un item: ");
        
        
    }
    
    public void mochi(){
        System.out.println("quedan: ");
        System.out.println("1.- Item POCION, HPpoints = 50, MPpoints = 0\n");
        System.out.println("2.- Item ETHER, HPpoints = 0, MPpoints = 50\n");
        
    }
    
    public void mo(){
        System.out.println("quedan: ");
        System.out.println("1.- Item POCION, HPpoints = 50, MPpoints = 0\n");
    }
    
}
