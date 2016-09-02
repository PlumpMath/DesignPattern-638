package DesignPattern.FactoryPattern;

interface IFactory {
	public Operation createOperation(); 
}
class ADDFactory implements IFactory{
	@Override
	public Operation createOperation() {
		return new OperationADD();
	}
}
class SUBFactory implements IFactory{
	@Override
	public Operation createOperation() {
		return new OperationSUB();
	}
}
class MULFactory implements IFactory{
	@Override
	public Operation createOperation() {
		return new OperationMUL();
	}
}
class DIVFactory implements IFactory{
	@Override
	public Operation createOperation() {
		return new OperationDIV();
	}
}