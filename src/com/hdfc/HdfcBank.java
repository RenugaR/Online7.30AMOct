package com.hdfc;

//className-->HdfcBank
public class HdfcBank {

	private void interest() {
		System.out.println("Interest");
	}

	public void deposit() {
		// business logic
		System.out.println("Deposit");// To print the output
		System.out.println("Fixed Deposit");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}

	public void withDraw() {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("WithDraw");
		System.out.println("RD");
	}

	// To run the program-->right click class-->run as-->java application
	public static void main(String[] args) {
		// Object creation-->className refName=new className();
		HdfcBank hdfc = new HdfcBank();
		// refName-->hdfc
		// new-->keyword-->will allocate memory at run time

		// method calling-->refName.methodName();
		hdfc.deposit();
		hdfc.withDraw();
	}
}
