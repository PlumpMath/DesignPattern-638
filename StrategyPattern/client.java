package DesignPattern.StrategyPattern;

public class client {
	public static void main(String[] args) {
		CashContext cc = new CashContext("return");
		double result = cc.getResult(300);
		System.out.println("result : "+result);
	}
}
