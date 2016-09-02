package DesignPattern.productpattern;

public class concretebuilder extends builder{

	@Override
	public void buildhead() {
		System.out.println("buildhead");
	}

	@Override
	public void buildbody() {
		System.out.println("buildbody");
	}

	@Override
	public void buildleftleg() {
		System.out.println("buildleftleg");
	}

	@Override
	public void buildrightleg() {
		System.out.println("buildrightleg");
	}

	@Override
	public void buildleftfoot() {
		System.out.println("buildleftfoot");
	}

	@Override
	public void buildrightfoot() {
		System.out.println("buildrightfoot");
	}

}
