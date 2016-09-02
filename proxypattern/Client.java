package DesignPattern.proxypattern;

public class Client {
	public static void main(String[] args) {
		schoolGirl girl = new schoolGirl();
		girl.setName("testgirl");
		proxy boy = new proxy(girl);
		boy.giveA();
		boy.giveB();
		boy.giveC();
	}
}
