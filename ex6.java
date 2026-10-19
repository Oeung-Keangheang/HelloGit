package test;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		function();

}
		public static void function() {
		Scanner sc = new Scanner(System.in);
		String name, major;
		String year;
		float expected_gpa;
		
		System.out.println("Input your Name: ");
		name = sc.nextLine();
		System.out.println("\nInput your Major: ");
		major = sc.nextLine();
		System.out.println("\nInput the Year: ");
		year = sc.nextLine();
		System.out.println("\nInput your Expected GPA: ");
		expected_gpa = sc.nextFloat();
		System.out.println("Hi, " + name + ", you are in year " + year + " majoring in " + major + ". \nYoure expect GPA is: " + expected_gpa);
		sc.close();
}
}
