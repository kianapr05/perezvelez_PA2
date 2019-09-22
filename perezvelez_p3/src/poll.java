import java.util.Scanner;

public class poll {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String input;
		char user = 'y';
		int[] edu = new int[10];
		int[] health = new int[10];
		int[] environment = new int[10];
		int[] transportation = new int[10];
		int[] prison = new int[10];
		int a;
		int b = 0;
		int total = 0;
		double eduAvg;
		double heaAvg;
		double envAvg;
		double traAvg;
		double priAvg;
		double userNum = 0;
		
		
		while (user == 'y') {
			userNum += 1;
			
			System.out.println("Rate the following topics from 1 (least important) to 10 (most important)");
			
			System.out.println("Education:");
			a = scnr.nextInt();
			edu[a-1] = edu[a-1] + 1;
			
			System.out.println("Health care:");
			a = scnr.nextInt();
			health[a-1] = health[a-1] + 1;
			
			System.out.println("Environmental Wellness:");
			a = scnr.nextInt();
			environment[a-1] = environment[a-1] + 1;
			
			System.out.println("Public Transportation:");
			a = scnr.nextInt();
			transportation[a-1] = transportation[a-1] + 1;
			
			System.out.println("Prison Reform");
			a = scnr.nextInt();
			prison[a-1] = prison[a-1] + 1;
			
			System.out.println("Press 'y' to survey another user");
			System.out.println("Press 'n' if everyone's responses have been logged");
			input = scnr.next();
			user = input.charAt(0);
			
		}
		
		while (b < 10) {
			total = total + (edu[b] * (b+1));
			b += 1;
		}
		
		eduAvg = total / userNum;
		b = 0;
		total = 0;
		
		while (b < 10) {
			total = total + (health[b] * (b+1));
			b += 1;
		}
		
		heaAvg = total / userNum;
		b = 0;
		total = 0;
		
		while (b < 10) {
			total = total + (environment[b] * (b+1));
			b += 1;
		}
		
		envAvg = total / userNum;
		b = 0;
		total = 0;
		
		while (b < 10) {
			total = total + (transportation[b] * (b+1));
			b += 1;
		}
		
		traAvg = total / userNum;
		b = 0;
		total = 0;
		
		while (b < 10) {
			total = total + (prison[b] * (b+1));
			b += 1;
		}
		
		priAvg = total / userNum;
		b = 0;
		total = 0;
		
		
		
		
		System.out.println("			 ____________________________________________________________");
		System.out.println("			|			   Ratings			     |");
		System.out.println("________________________|____________________________________________________________|___________");
		System.out.println("	Topics		|  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |  9  |  10  |  Average  ");
		System.out.println("________________________|_____|_____|_____|_____|_____|_____|_____|_____|_____|______|___________");
		System.out.printf("Education		|  " + edu[0] + "  |  " + edu[1] + "  |  " + edu[2] + "  |  " + edu[3] + "  |  " + edu[4] + "  |  " + edu[5] + "  |  " + edu[6] + "  |  " + edu[7] + "  |  " + edu[8] + "  |  " + edu[9] + "   |     %.1f     ", eduAvg);
		System.out.println("");
		System.out.println("------------------------|------------------------------------------------------------|-----------");
		System.out.printf("Health Care		|  " + health[0] + "  |  " + health[1] + "  |  " + health[2] + "  |  " + health[3] + "  |  " + health[4] + "  |  " + health[5] + "  |  " + health[6] + "  |  " + health[7] + "  |  " + health[8] + "  |  " + health[9] + "   |     %.1f     ", heaAvg);
		System.out.println("");
		System.out.println("------------------------|------------------------------------------------------------|-----------");
		System.out.printf("Environmental Wellness	|  " + environment[0] + "  |  " + environment[1] + "  |  " + environment[2] + "  |  " + environment[3] + "  |  " + environment[4] + "  |  " + environment[5] + "  |  " + environment[6] + "  |  " + environment[7] + "  |  " + environment[8] + "  |  " + environment[9] + "   |     %.1f     ", envAvg);
		System.out.println("");
		System.out.println("------------------------|------------------------------------------------------------|-----------");
		System.out.printf("Public Transportation	|  " + transportation[0] + "  |  " + transportation[1] + "  |  " + transportation[2] + "  |  " + transportation[3] + "  |  " + transportation[4] + "  |  " + transportation[5] + "  |  " + transportation[6] + "  |  " + transportation[7] + "  |  " + transportation[8] + "  |  " + transportation[9] + "   |     %.1f     ", traAvg);
		System.out.println("");
		System.out.println("------------------------|------------------------------------------------------------|-----------");
		System.out.printf("Prison Reform		|  " + prison[0] + "  |  " + prison[1] + "  |  " + prison[2] + "  |  " + prison[3] + "  |  " + prison[4] + "  |  " + prison[5] + "  |  " + prison[6] + "  |  " + prison[7] + "  |  " + prison[8] + "  |  " + prison[9] + "   |     %.1f     ", priAvg);
		System.out.println("");
		System.out.println("________________________|____________________________________________________________|___________");
		
	
		
	}
}
