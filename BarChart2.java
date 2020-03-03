/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barchart;

/**
 *
 * @author Tony White
 */
import java.util.Scanner; 

 

class BarChart2 

{ 

   //Main method 

   public static void main(String args[]) 

   { 

       //Array of names 

       String[] playerNames = {"Art", "Bob", "Cal", "Dan", "Eli"}; 

       

       //Array for storing points 

       int[] points = new int[5]; 

       int i, j; 

       

       //Scanner class objects 

       Scanner sc = new Scanner(System.in); 

       

       //Reading points scored 

       for(i=0; i<5; i++) 

       { 

           //Prompting and accepting points scored by each player 

           System.out.print("\n Enter points scored by " + playerNames[i] + " >> "); 

           points[i] = sc.nextInt(); 

       } 

       

       System.out.println("\n\n Points for Season \n"); 

       

       //Printing bar chart 

       for(i=0; i<5; i++) 

       { 

           //Printing player name 

           System.out.print("\n " + playerNames[i] + " "); 

           

           //Generating asteriks 

           for(j=10; j<=points[i]; j++) 

           { 

               System.out.print("*"); 

           } 

       } 

       

       System.out.println("\n"); 

   } 

} 
