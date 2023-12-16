/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2p1_eduardovaldez;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author guali
 */
public class Personajes {

    static Scanner leer = new Scanner(System.in);
    static Random rand = new Random();
    String nombre;
    int HP1=300;
    int HP2=150;
    int HP3=450;
    int MP1=300;
    int MP2=450;
    int MP3=100;
    int AttackPoint;
    int DefensePoint;

    public void party() {
        int cant = rand.nextInt((3 - 1) + 1) + 1;
        int atackHeartless = 25 * cant;
        int vidaHeartless = 75 * cant;
       


        System.out.println("Te has encontrado a " + cant + " Heartless!");
        System.out.println("1.- Sora\nHP=300\nMP=300\nAttack P. = 75\nDefense P. = 15\n");
        System.out.println("2.- Donald\nHP=150\nMP=450\nAttack P. = 45\nDefense P. = 10\n");
        System.out.println("3.- Goofy \nHP=450\nMP=100\nAttack P. = 150\nDefense P. = 50\n");
        while (vidaHeartless > 0 && HP1 > 0 && HP2 > 0 && HP3 > 0) {
          
 
            
            System.out.println("Elije el personaje:");
            int personaje = leer.nextInt();
            switch (personaje) {
                case 1:
                    nombre = "Sora";
                    HP1 = 300;
                    MP1 = 300;
                    AttackPoint = 75;
                    DefensePoint = 15;
                    System.out.println();
                    System.out.println("**********Menu**********\n1.- Attack\n2.- Magic\n3.- Items\n4.- Party");
                    int opcion = leer.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println(nombre + " ataco!");
                            vidaHeartless = vidaHeartless - AttackPoint;
                            System.out.println(nombre + " Recibio el golpe!");
                            HP1 = HP1 - atackHeartless;
                            System.out.println("Los heartless les queda: " + vidaHeartless);

                            break;
                        case 2:
                            System.out.println("1.- Blizzard    50MP - 50DMG\n2.- Firaga    25MP - 25DMG\n3.- Gravity   75MP - 100DMG");
                            int opcion2 = leer.nextInt();
                            switch (opcion2) {
                                case 1:
                                    if(MP1>=50){
                                    System.out.println(nombre + " uso Blizzard");
                                    vidaHeartless = vidaHeartless - 50;
                                    MP1 = MP1 - 50;
                                    System.out.println(nombre + " Recibio el golpe!");
                                    HP1 = HP1 - atackHeartless;
                                    System.out.println("Los heartless les queda: " + vidaHeartless);
                                    }else{
                                        System.out.println("No tienes suficiente MP");
                                    }
                                    break;
                                case 2:
                                    if(MP1>=25){
                                    System.out.println(nombre + " uso Firaga");
                                    vidaHeartless = vidaHeartless - 25;
                                    MP1 = MP1 - 25;
                                    System.out.println(nombre + " Recibio el golpe!");
                                    HP1 = HP1 - atackHeartless;
                                    System.out.println("Los heartless les queda: " + vidaHeartless);
                                    }else{
                                        System.out.println("No tienes suficiente MP");
                                    }
                                    break;
                                case 3:
                                    if(MP1>=75){
                                    System.out.println(nombre + " uso Gravity");
                                    vidaHeartless = vidaHeartless - 100;
                                    MP1 = MP1 - 75;
                                    System.out.println(nombre + " Recibio el golpe!");
                                    HP1 = HP1 - atackHeartless;
                                    System.out.println("Los heartless les queda: " + vidaHeartless);
                                    }else{
                                        System.out.println("No tienes suficiente MP");
                                    }
                                    break;
                            }
                            break;
                        case 3:
                            Items inicio = new Items();
                            inicio.mochila();
                            
                            int item = leer.nextInt();
                            if(item == 1){
                                System.out.println(nombre+" uso Pocion");
                                HP1 = HP1 + 50;
                                System.out.println(nombre+ "Recibio el golpe");
                                HP1 = HP1 - atackHeartless;
                                vidaHeartless = vidaHeartless - AttackPoint;
                                System.out.println("Los heartless les queda: "+vidaHeartless);
                                
                            } else if(item == 2){
                                System.out.println(nombre+" uso Ether");
                                MP1 = MP1 + 50;
                                System.out.println(nombre+ "Recibio el golpe");
                                HP1 = HP1 - atackHeartless;
                                vidaHeartless = vidaHeartless - AttackPoint;
                                System.out.println("Los heartless les queda: "+vidaHeartless);
                                
                            }else if(item == 3){
                                System.out.println(nombre+" uso Elixir");
                                HP1 = HP1 +100;
                                MP1 = MP1 + 100;
                                System.out.println(nombre+ "Recibio el golpe");
                                HP1 = HP1 - atackHeartless;
                                vidaHeartless = vidaHeartless - AttackPoint;
                                System.out.println("Los heartless les queda: "+vidaHeartless);
                                
                            }
                 
                            break;
                        case 4:
                            break;

                    }
                    break;
                case 2:
                    nombre = "Donald";
                    HP2 = 150;
                    MP2 = 450;
                    AttackPoint = 45;
                    DefensePoint = 10;
                    System.out.println();
                    System.out.println("**********Menu**********\n1.- Attack\n2.- Magic\n3.- Items\n4.- Party");
                    opcion = leer.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println(nombre + " ataco!");
                            vidaHeartless = vidaHeartless - AttackPoint;
                            System.out.println(nombre + " Recibio el golpe!");
                            HP2 = HP2 - atackHeartless;
                            System.out.println("Los heartless les queda: " + vidaHeartless);

                            break;
                        case 2:
                            System.out.println("1.- Blizzard    50MP - 50DMG\n2.- Firaga    25MP - 25DMG\n3.- Gravity   75MP - 100DMG");
                            int opcion2 = leer.nextInt();
                            switch (opcion2){
                                case 1:
                                    if(MP2>=50){
                                    System.out.println(nombre + " uso Blizzard");
                                    vidaHeartless = vidaHeartless - 50;
                                    MP2 = MP2 - 50;
                                    System.out.println(nombre + " Recibio el golpe!");
                                    HP2 = HP2 - atackHeartless;
                                    System.out.println("Los heartless les queda: " + vidaHeartless);
                                    }else{
                                        System.out.println("No tienes suficiente MP");
                                    }
                                    break;
                                case 2:
                                    if(MP2>=25){
                                    System.out.println(nombre + " uso Firaga");
                                    vidaHeartless = vidaHeartless - 25;
                                    MP2 = MP2 - 25;
                                    System.out.println(nombre + " Recibio el golpe!");
                                    HP2 = HP2 - atackHeartless;
                                    System.out.println("Los heartless les queda: " + vidaHeartless);
                                    }else{
                                        System.out.println("No tienes suficiente MP");
                                    }
                                    break;
                                case 3:
                                    if(MP2>=75){
                                    System.out.println(nombre + " uso Gravity");
                                    vidaHeartless = vidaHeartless - 100;
                                    MP2 = MP2 - 75;
                                    System.out.println(nombre + " Recibio el golpe!");
                                    HP2 = HP2 - atackHeartless;
                                    System.out.println("Los heartless les queda: " + vidaHeartless);
                                    }else{
                                        System.out.println("No tienes suficiente MP");
                                    }
                                    break;
                            }
                            break;
                        case 3:
                            Items inicio = new Items();
                            inicio.mochila();
                            
                            int item = leer.nextInt();
                            if(item == 1){
                                System.out.println(nombre+" uso Pocion");
                                HP2 = HP2 + 50;
                                System.out.println(nombre+ "Recibio el golpe");
                                HP2 = HP2 - atackHeartless;
                                vidaHeartless = vidaHeartless - AttackPoint;
                                System.out.println("Los heartless les queda: "+vidaHeartless);
                                
                            } else if(item == 2){
                                System.out.println(nombre+" uso Ether");
                                MP2 = MP2 + 50;
                                System.out.println(nombre+ "Recibio el golpe");
                                HP2 = HP2 - atackHeartless;
                                vidaHeartless = vidaHeartless - AttackPoint;
                                System.out.println("Los heartless les queda: "+vidaHeartless);
                                
                            }else if(item == 3){
                                System.out.println(nombre+" uso Elixir");
                                HP2 = HP2 +100;
                                MP2 = MP2 + 100;
                                System.out.println(nombre+ "Recibio el golpe");
                                HP2 = HP2 - atackHeartless;
                                vidaHeartless = vidaHeartless - AttackPoint;
                                System.out.println("Los heartless les queda: "+vidaHeartless);
                                
                            }
                 
                            break;
                        case 4:
                            break;

                    }
                    break;
                case 3:
                    nombre = "Goofy";
                    HP3 = 450;
                    MP3 = 100;
                    AttackPoint = 150;
                    DefensePoint = 50;
                    System.out.println();
                    System.out.println("**********Menu**********\n1.- Attack\n2.- Magic\n3.- Items\n4.- Party");
                    opcion = leer.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println(nombre + " ataco!");
                            vidaHeartless = vidaHeartless - AttackPoint;
                            System.out.println(nombre + " Recibio el golpe!");
                            HP3 = HP3 - atackHeartless;
                            System.out.println("Los heartless les queda: " + vidaHeartless);

                            break;
                        case 2:
                            System.out.println("1.- Blizzard    50MP - 50DMG\n2.- Firaga    25MP - 25DMG\n3.- Gravity   75MP - 100DMG");
                            int opcion2 = leer.nextInt();
                            switch (opcion2) {
                                case 1:
                                    if(MP3>=50){
                                    System.out.println(nombre + " uso Blizzard");
                                    vidaHeartless = vidaHeartless - 50;
                                    MP3 = MP3 - 50;
                                    System.out.println(nombre + " Recibio el golpe!");
                                    HP3 = HP3 - atackHeartless;
                                    System.out.println("Los heartless les queda: " + vidaHeartless);
                                    }else{
                                        System.out.println("No tienes suficiente MP");
                                    }
                                    break;
                                case 2:
                                    if(MP3>=25){
                                    System.out.println(nombre + " uso Firaga");
                                    vidaHeartless = vidaHeartless - 25;
                                    MP3 = MP3 - 25;
                                    System.out.println(nombre + " Recibio el golpe!");
                                    HP3 = HP3 - atackHeartless;
                                    System.out.println("Los heartless les queda: " + vidaHeartless);
                                    }else{
                                        System.out.println("No tienes suficiente MP");
                                    }
                                    break;
                                case 3:
                                    if(MP3>=75){
                                    System.out.println(nombre + " uso Gravity");
                                    vidaHeartless = vidaHeartless - 100;
                                    MP3 = MP3 - 75;
                                    System.out.println(nombre + " Recibio el golpe!");
                                    HP3 = HP3 - atackHeartless;
                                    System.out.println("Los heartless les queda: " + vidaHeartless);
                                    }else{
                                        System.out.println("No tienes suficiente MP");
                                    }
                                    break;
                            }
                            break;
                        case 3:
                            Items inicio = new Items();
                            inicio.mochila();
                            
                            int item = leer.nextInt();
                            if(item == 1){
                                System.out.println(nombre+" uso Pocion");
                                HP3 = HP3 + 50;
                                System.out.println(nombre+ "Recibio el golpe");
                                HP3 = HP3 - atackHeartless;
                                vidaHeartless = vidaHeartless - AttackPoint;
                                System.out.println("Los heartless les queda: "+vidaHeartless);
                                
                            } else if(item == 2){
                                System.out.println(nombre+" uso Ether");
                                MP3 = MP3 + 50;
                                System.out.println(nombre+ "Recibio el golpe");
                                HP3 = HP3 - atackHeartless;
                                vidaHeartless = vidaHeartless - AttackPoint;
                                System.out.println("Los heartless les queda: "+vidaHeartless);
                                
                            }else if(item == 3){
                                System.out.println(nombre+" uso Elixir");
                                HP3 = HP3 +100;
                                MP3 = MP3 + 100;
                                System.out.println(nombre+ "Recibio el golpe");
                                HP3 = HP3 - atackHeartless;
                                vidaHeartless = vidaHeartless - AttackPoint;
                                System.out.println("Los heartless les queda: "+vidaHeartless);
                                
                            }
                 
                            break;
                        case 4:
                            break;

                    }

                    break;
            }

            System.out.println("1.- Sora\nHP= " + HP1 + "\nMP= " + MP1 + "\nAttack P. = " + AttackPoint + "\nDefense P. = " + DefensePoint + "\n");
            System.out.println("2.- Donald\nHP= " + HP2 + "\nMP= " + MP2 + "\nAttack P. = " + AttackPoint + "\nDefense P. = " + DefensePoint + "\n");
            System.out.println("3.- Goofy\nHP= " + HP3 + "\nMP= " + MP3 + "\nAttack P. = " + AttackPoint + "\nDefense P. = " + DefensePoint + "\n");

        }

    }

}
