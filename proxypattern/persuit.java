package DesignPattern.proxypattern;

public class persuit implements GiveGift{
	schoolGirl girl = new schoolGirl();
	public persuit(schoolGirl girl){
		this.girl = girl;
	}
	@Override
	public void giveA() {
		System.out.println("giveA");
	}

	@Override
	public void giveB() {
		System.out.println("giveB");
	}

	@Override
	public void giveC() {
		System.out.println("giveC");
	}
}
