package DesignPattern.FactoryPattern;

public class Operation {
	private double numberA;
	private double numberB;
	public double getResult(){
		return 0;
	}
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
}

class OperationADD extends Operation{
	@Override
	public double getResult(){
		return getNumberA() + getNumberB();
	}
}
class OperationSUB extends Operation{
	@Override
	public double getResult(){
		return getNumberA() - getNumberB();
	}
}
class OperationMUL extends Operation{
	@Override
	public double getResult(){
		return getNumberA() * getNumberB();
	}
}
class OperationDIV extends Operation{
	@Override
	public double getResult(){
		return getNumberA() / getNumberB();
	}
}
