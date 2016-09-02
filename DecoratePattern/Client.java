package DesignPattern.DecoratePattern;

public class Client {
	public static void main(String[] args) {
		Person person = new Person("client1");
		Tshirts tshirt = new Tshirts();
		tshirt.Decorate(person);
		BigTrouser bigtrouser = new BigTrouser();
		bigtrouser.Decorate(tshirt);
		Tie tie = new Tie();
		tie.Decorate(bigtrouser);
		tie.show();
	}
}
