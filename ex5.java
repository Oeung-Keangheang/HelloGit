package test;
import java.util.Scanner;
public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n;
		System.out.print("Input n: ");
			n = sc.nextInt();
			System.out.println("Output: \nAll prime numbers from 2 to "+n+": " );
			for (int i = 2; i<=n; i++) {
				boolean prime= true;
				for (int div = 2; div < i; div++) {
					if ( i%div == 0) {
						prime = false;
						break;
					}
				}
					if (prime) {
						System.out.print(i+" " );
					}
			}
		sc.close();
	}

}
