package DesignPattern.proxypattern;

public class proxy implements GiveGift{
	private persuit person;
	public proxy(schoolGirl girl){
		person = new persuit(girl);
	}
	@Override
	public void giveA() {
		person.giveA();
	}

	@Override
	public void giveB() {
		person.giveB();
	}

	@Override
	public void giveC() {
		person.giveC();
	}
	
}
