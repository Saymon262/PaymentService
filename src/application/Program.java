package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;
import services.PaypalService;

public class Program {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		// List parcels = new ArrayList<>();
		 
		 System.out.println("Account datas: ");
		 System.out.println("Contract number: ");
		 Integer account = scan.nextInt();
		 
		 System.out.println("Date: ");
		 LocalDate date = LocalDate.parse(scan.next(), fmt);
		 
		 System.out.println("Contract value: ");
		 Double value = scan.nextDouble();
		 
		 Contract contract = new Contract(account, date, value);
		 
		 System.out.println("Number o installments: ");
		 Integer installments = scan.nextInt();
		 
		 ContractService contractService = new ContractService(new PaypalService());
		 
		 contractService.processContract(contract,  installments);
		 
		 System.out.println("Parcelas: ");
		 for(Installment installment : contract.getInstallments()) {
			 System.out.println(installment);
		 }

		 scan.close();
	}
}
