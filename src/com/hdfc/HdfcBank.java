package com.hdfc;

//className-->HdfcBank
public class HdfcBank {
	// Method
	// Type method name and click control+spacebar then click enter
	public void deposit() {
		// business logic
		System.out.println("Deposit");// To print the output
		System.out.println("Hello");
	}

	public void withDraw() {
		System.out.println("WithDraw");
		System.out.println();
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
