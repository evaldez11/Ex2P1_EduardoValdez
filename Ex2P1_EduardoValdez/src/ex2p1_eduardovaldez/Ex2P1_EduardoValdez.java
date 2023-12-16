/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2p1_eduardovaldez;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author guali
 */
public class Ex2P1_EduardoValdez {

    /**
     * @param args the command line arguments
     */
    static Scanner leer = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        int cont = 0;
        while(cont<5){
        cont++;
        int contador=0;
        System.out.println();
        System.out.println("Cuarto "+cont);
            
        int situacion = rand.nextInt((3 - 1) + 1) + 1;      
        switch (situacion) {
            case 1:
                Personajes iniciar = new Personajes();
                iniciar.party();

                break;
            case 2:
                contador++;
                System.out.println("Te has encontrado un cofre que contiene una Pocion!");
                if(cont==1){
                    Items comenzar = new Items();
                    comenzar.mochi();
                }else if(cont==2){
                    Items comenzar = new Items();
                    comenzar.mo();
                }else if(cont>=3){
                    System.out.println("Ya no tienes items");
                }
                
                break;
            case 3:
                System.out.println("Te has encontrado a amigos que ocupan de tu ayuda y decides darles Items!");
                break;
        }

    }
        
       
    }

}
