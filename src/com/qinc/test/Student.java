package com.qinc.test;

public class Student {
	private Integer age;
	private String name;
	public Student(){};
	public Student(Integer age,String name){
		this.age=age;
		this.name=name;
	};
	public String getName(){
		return name;
	}
}
