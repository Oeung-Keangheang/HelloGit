package test;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
	          Scanner sc = new Scanner (System.in);
	          int num;
	          double sum=0;
	          System.out.println("Enter a Number: ");
	          num = sc.nextInt();
	          for (int n=1000; n>=num; n-- ) {
	        	System.out.println(n);
	        	sum = n + sum;	
	          }
	          System.out.println("Sum: " + sum);
	          double avg = 0;
	        	avg= sum/(1000-num+1);
	          System.out.println("Average: " + avg);
	}

}
