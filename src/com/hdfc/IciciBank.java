package com.hdfc;

public class IciciBank {
	public void deposit() {
		System.out.println("Deposit");// To print the output
	}

	public void withDraw() {
		System.out.println("WithDraw");
		System.out.println();
	}

	public static void main(String[] args) {
		IciciBank hdfc = new IciciBank();
		hdfc.deposit();
		hdfc.withDraw();
	}
}
