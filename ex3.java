package test;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int [] n= new int[5];
		System.out.println("Input 5 Numbers: ");
		for(int i=0; i<5; i++) {
			n[i] = sc.nextInt();
		}
		int max = n[0];
		int min = n[0];
		for (int cal : n) {
			max = Math.max(max, cal);
			min = Math.min(min, cal);
		}
		System.out.println("Among all the five input numbers ("+ n[0]+", "+ n[1]+", "+ 
		n[2]+", "+ n[3]+" and "+ n[4]+"), min is "+ min + " and max is "+ max + ".");
		sc.close();
	}

}
