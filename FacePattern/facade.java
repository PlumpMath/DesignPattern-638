package DesignPattern.FacePattern;

public class facade {
	private subSystemClassOne subOne;
	private subSystemClassTwo subTwo;
	private subSystemClassThree subThree;
	private subSystemClassFour subFour;
	
	public facade() {
		subOne = new subSystemClassOne();
		subTwo = new subSystemClassTwo();
		subThree = new subSystemClassThree();
		subFour = new subSystemClassFour();
	}
	public void  methodOne(){
		subOne.methodOne();
		subTwo.methodOne();
		subThree.methodOne();
		subFour.methodOne();
	}
}
