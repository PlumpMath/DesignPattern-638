package DesignPattern.productpattern;

public class buildDirector {
	private concretebuilder person;
	public buildDirector(){
		person = new concretebuilder();
	}
	public void buildConcretePerson(){
		person.buildhead();
		person.buildbody();
		person.buildleftleg();
		person.buildrightleg();
		person.buildleftfoot();
		person.buildrightfoot();
	}
}
