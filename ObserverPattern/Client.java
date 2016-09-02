package DesignPattern.ObserverPattern;

public class Client {
	public static void main(String[] args) {
		Secretary xiaojie = new Secretary("xiaojie");
		College college1 = new College("college1");
		College college2 = new College("college2");
		College college3 = new College("college3");
		xiaojie.add(college1);
		xiaojie.add(college2);
		xiaojie.add(college3);
		xiaojie.notice();
	}
}
