import java.util.Scanner;

public class encrypt {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int password;
		int a = 0;
		int[] b = new int[4];
		int tempstorage;
		
		System.out.println("Enter the 4 digit passcode to encrypt:");
		password = scnr.nextInt();
		
		b[0] = password / 1000;

		b[1] = (password / 100) % 10;

		b[2] = (password / 10) % 10;

		b[3] = password % 10;

		while (a < 4) {
			b[a] = (b[a] + 7) % 10;
			a += 1;
		}
		
		a=0;

		 
		tempstorage = b[0];
		b[0] = b[2];
		b[2] = tempstorage;
		 
		tempstorage = b[1];
		b[1] = b[3];
		b[3] = tempstorage;
		
		while (a < 4) {
			System.out.print(b[a]);
			a += 1;
		}
		
		System.out.println();

	}

}
