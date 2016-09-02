package DesignPattern.StrategyPattern;

public class CashSuperFactory {
	public static CashSuper createCashSuper(String method){
		CashSuper cashSuper = null;
		switch (method) {
		case "normal":
			cashSuper = new CashNormal();
			break;
		case "discount":
			cashSuper = new CashDiscount(0.8);
			break;
		case "return":
			cashSuper = new CashReturn(300, 100);
			break;
		default:
			break;
		}
		return cashSuper;
		
	}
}
