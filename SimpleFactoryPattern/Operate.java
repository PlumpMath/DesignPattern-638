package DesignPattern.SimpleFactoryPattern;

public class Operate {
	private double numberA = 0;
	private double numberB = 0;
	
	public double getNumberA() {
		return numberA;
	}
	public void setNumberA(double numberA) {
		this.numberA = numberA;
	}
	public double getNumberB() {
		return numberB;
	}
	public void setNumberB(double numberB) {
		this.numberB = numberB;
	}
	public double getResult(){
		return 0;
	}
}

class OperateAdd extends Operate{
	@Override
	public double getResult(){
		return getNumberA() + getNumberB();
	}
}
class OperateSub extends Operate{
	@Override
	public double getResult(){
		return getNumberA() - getNumberB();
	}
}
class OperateMul extends Operate{
	@Override
	public double getResult(){
		return getNumberA() * getNumberB();
	}
}
class OperateDiv extends Operate{
	@Override
	public double getResult(){
		return getNumberA() / getNumberB();
	}
}