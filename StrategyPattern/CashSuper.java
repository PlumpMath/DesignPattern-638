package DesignPattern.StrategyPattern;

public abstract class CashSuper {
	public abstract double acceptCash(double money);
}
class CashNormal extends CashSuper{
	@Override
	public double acceptCash(double money) {
		return money;
	}
}
class CashDiscount extends CashSuper{
	private double discount = 0;
	public CashDiscount(double discount) {
		this.discount = discount;
	}
	@Override
	public double acceptCash(double money) {
		return money * discount;
	}
}
class CashReturn extends CashSuper{
	private double moneyCondition = 0;
	private double moneyReturn = 0;
	
	public CashReturn(double moneyCondition, double moneyReturn) {
		this.moneyCondition = moneyCondition;
		this.moneyReturn = moneyReturn;
	}
	@Override
	public double acceptCash(double money) {
		if (money >=  moneyCondition){
			return money - ((int)(money/moneyCondition))*moneyReturn;			
		}
		return money;
	}
}



