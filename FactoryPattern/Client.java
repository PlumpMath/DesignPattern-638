package DesignPattern.FactoryPattern;

import java.util.Scanner;

public class Client {
	private static double numberA = 0.0;
	private static double numberB = 0.0;
	private static String operation;
	public static void main(String[] args) {
		System.out.println("Input the first number : ");
		Scanner scanner = new Scanner(System.in);
		numberA = scanner.nextDouble();
		System.out.println("Input the second number : ");
		numberB = scanner.nextDouble();
		System.out.println("Input the operation : ");
		operation = scanner.next();
		
		switch (operation) {
		case "+":
			ADDFactory addfactory = new ADDFactory();
			Operation add = addfactory.createOperation();
			System.out.println(add.getResult());
			break;
		case "-":
			SUBFactory subfactory = new SUBFactory();
			Operation sub = subfactory.createOperation();
			System.out.println(sub.getResult());
			break;
		case "*":
			MULFactory mulfactory = new MULFactory();
			Operation mul = mulfactory.createOperation();
			System.out.println(mul.getResult());
			break;
		case "/":
			DIVFactory divfactory = new DIVFactory();
			Operation div = divfactory.createOperation();
			System.out.println(div.getResult());
	break;
		default:
			break;
		}
	}
}
