package DesignPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Secretary {
	private List<College> colleges = new ArrayList<College>();
	private String name;
	public Secretary(String name){
		this.name = name;
	}
	public void notice(){
		for(College college : colleges){
			college.update();
		}
	}
	public void add(College college){
		colleges.add(college);
	}
	public void removeCollege(College college){
		colleges.remove(college);
	}
	public void printCollegesList(){
		for(College college : colleges){
			System.out.println(college);
		}
	}
}
