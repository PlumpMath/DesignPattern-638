package DesignPattern.StrategyPattern;

public class CashContext {
	private CashSuper cs = null;
	public CashContext(String method) {
		switch (method) {
		case "normal":
			cs = new CashNormal();
			break;
		case "discount":
			cs = new CashDiscount(0.8);
			break;
		case "return":
			cs = new CashReturn(300, 100);
			break;
		default:
			System.out.println("[ERROR] test1.marketbank.CashContext.method is not belong to any strategy. ");
			break;
		}
	}
	public double getResult(double money){
		return cs.acceptCash(money);
	}
}
