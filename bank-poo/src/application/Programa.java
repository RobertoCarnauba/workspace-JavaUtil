package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Accont;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Accont accont;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.println("Enter accont holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit? (y/n)");
		char response = sc.next().charAt(0);
		if(response == 'y'){
			System.out.print("Initial deposit:");
			double initailDeposit = sc.nextDouble();
			accont = new Accont(number, holder, initailDeposit);
		} else {
			accont = new Accont(number, holder);
		}
		System.out.println(accont);
		System.out.print("Enter a deposit value:");
		double depoitValue = sc.nextDouble();
		accont.deposit(depoitValue);
		System.out.print("Update accont data:");
		System.out.println(accont);
		
		System.out.println();
		System.out.print("Enter a withdraw value:");
		double withdrawValue = sc.nextDouble();
		accont.withdraw(withdrawValue);
		System.out.print("Update accont data:");
		System.out.println(accont);
		
		sc.close();
	}

}
