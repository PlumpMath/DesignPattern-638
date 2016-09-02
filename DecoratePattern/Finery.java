package DesignPattern.DecoratePattern;

public class Finery extends Person{
	protected Person component;
	public void Decorate(Person component){
		this.component = component;
	}
	@Override
	public void show(){
		if (component != null) {
			component.show();
		}
	}
}
class Tshirts extends Finery{
	@Override
	public void show(){
		System.out.println("Tshirts");
		super.show();
	}
}
class Tie extends Finery{
	@Override
	public void show(){
		System.out.println("Tie");
		super.show();
	}
}
class BigTrouser extends Finery{
	@Override
	public void show(){
		System.out.println("BigTrouser");
		super.show();
	}
}