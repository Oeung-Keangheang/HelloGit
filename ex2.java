package test;

import java.util.Scanner;

public class Module3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
        System.out.println("Enter the number for \na: ");
        a = sc.nextInt();
        System.out.println("\nb: ");
        b = sc.nextInt();
        System.out.println("\nc: ");
        c = sc.nextInt();
        float delta = b*b - 4*a*c;
       if ( a ==0) {
    	   double x=-c/(double)b;
    	   System.out.println("X = " + x );
       }else {
    	   if (delta < 0 ) {
    	   System.out.println("\nThe root is imaginary " );   
       } 
    	   if (delta > 0) {
        double x1;
		double x2;
         x1 = (-b + Math.sqrt(delta))/(2*a);
         x2 = (-b - Math.sqrt(delta))/(2*a);
         System.out.println("\nThe roots are: " + x1 + " , " + x2);       
	}
    	   if (delta == 0) {
    		   double x3;
    		   x3 = -b /(2*a);
    		   System.out.println("\nThe root is: " + x3 ); 
    	   }
	}
}
}
