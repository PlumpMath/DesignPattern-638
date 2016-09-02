package DesignPattern.SimpleFactoryPattern;

public class OperationFactory {
	public static Operate createOperation(String operater){
		Operate oper = null;
		switch (operater) {
		case "+":
			oper = new OperateAdd();
			break;
		case "-":
			oper = new OperateSub();
			break;
		case "*":
			oper = new OperateMul();
			break;
		case "/":
			oper = new OperateDiv();
			break;
		default:
			break;
		}
		return oper;
	}
}
