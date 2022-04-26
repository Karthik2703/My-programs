package karthik;

import java.util.Scanner;

class Switchcase {
	public static void main(String args[]) {
		int rank ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rank");
		rank=sc.nextInt();
		switch (rank) {
		case 1 :
			System.out.println("Distinction");
			
		case 2 :
			System.out.println("First class");
			break;
		case 3 :
			System.out.println("Second class");
			break;
		case 4 :
			System.out.println("You passed the exam");
			break;
		default :
			System.out.println("Absent");
		}
	}

}

	



