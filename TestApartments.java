/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartment;

/**
 *
 * @author Tony white
 */
import java.util.*; 

 

public class TestApartments { 

 

public static void main(String args[]) { 

 

Scanner input = new Scanner(System.in); 

 

Apartment apts[] = new Apartment[5]; 

 

apts[0] = new Apartment(101, 2, 1, 725); 

 

apts[1] = new Apartment(102, 2, 1.5, 775); 

 

apts[2] = new Apartment(103, 3, 2, 870); 

 

apts[3] = new Apartment(104, 3, 2.5, 960); 

 

apts[4] = new Apartment(105, 3, 3, 1100); 

 

int bdrms; 

 

int baths; 

 

double rent; 

 

int count = 0; 

 

System.out.print("Enter minimum number of bedrooms needed >> "); 

 

bdrms = input.nextInt(); 

 

System.out.print("Enter minimum number of bathrooms needed >> "); 

 

baths = input.nextInt(); 

 

System.out.print("Enter maximum rent willing to pay >> "); 

 

rent = input.nextDouble(); 

 

System.out.println("\nApartments meeting citeria of\nat least " + bdrms + " bedrooms, at least " + baths + " baths, and " + " no more than $" + rent + " rent:"); 

 

// Write your code here 

 

boolean isExist = false; 

 

for(int i=0; i<apts.length; i++){ 

 

if(checkApt(apts[i], bdrms, baths, rent)){ 

 

display(apts[i]); 

 

isExist = true; 

 

} 

 

} 

 

if(!isExist){ 

 

System.out.println("No apartments met your criteria"); 

 

} 

 

} 

 

public static boolean checkApt(Apartment apt, int bdrms, double baths, double rent) { 

 

// Write your code here 

 

if(apt.getBedrooms()>=bdrms && apt.getBaths()>=baths && apt.rent<=rent) 

 

return true; 

 

return false; 

 

} 

 

public static void display(Apartment apt) { 

 

System.out.println(" Apt #" + apt.getAptNumber() + " " + apt.getBedrooms() +" bedrooms, and " + apt.getBaths() + " baths. Rent $" + apt.getRent()); 

 

} 

 

} 
