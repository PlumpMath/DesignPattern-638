package DesignPattern.ObserverPattern;

class College1 extends Observer{

	public College1(String name, Secretary secretary) {
		super(name, secretary);
	}

	@Override
	public void update() {
		System.out.println();
	}
	
}
public class College {
	private String name;
	public College(String name){
		this.name = name;
	}
	public void update() {
		System.out.println(name + "更新状态，开始工作。");
	}
	@Override
	public String toString() {
		return name;
	}
}
