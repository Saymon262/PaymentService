package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 List parcels = new ArrayList<>();
		 
		 System.out.println("Account datas: ");
		 System.out.println("Number: ");
		 Integer account = scan.nextInt();
		 
		 System.out.println("Date: ");
		 String date = scan.next();
		 
		 System.out.println("Contract value: ");
		 Double value = scan.nextDouble();
		 
		 System.out.println("Number o isntallments: ");
		 Integer installments = scan.nextInt();
	}
}
