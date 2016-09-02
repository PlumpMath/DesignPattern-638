package DesignPattern.SimpleFactoryPattern;

import java.util.Scanner;

public class client {
	private static Scanner sc;

	public static void main(String[] args) {
		try {
			sc = new Scanner(System.in);
			System.out.println("input the first number:");
			double numberA = sc.nextDouble();
			System.out.println("inout the second number:");
			double numberB = sc.nextDouble();
			System.out.println("input the operater:");
			String operater = sc.next();
			Operate oper = OperationFactory.createOperation(operater);
			oper.setNumberA(numberA);
			oper.setNumberB(numberB);
			double result = oper.getResult();
			System.out.println("the result is: " + result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
