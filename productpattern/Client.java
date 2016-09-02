package DesignPattern.productpattern;

public class Client {
	public static void main(String[] args) {
		buildDirector director = new buildDirector();
		director.buildConcretePerson();
	}
}
