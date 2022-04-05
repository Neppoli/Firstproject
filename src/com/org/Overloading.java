package com.org;

public class Overloading {
	private void complany(String name,int id,long phone) {
		// TODO Auto-generated method stub
System.out.println("Empname:"+name+"\n"+"Emp id:"+id+"\n"+"Emp phone"+phone);
	}
	public static void main(String[] args) {
		String s="neppoli";
		int a=20;
		System.out.println("api");
		System.out.println("selenium");
		Overloading c= new Overloading();
		System.out.println("java");
		System.out.println("phython");
		c.complany("moni", 234, 8883846512l);
		System.out.println("******************");
		c.complany("rocky", 235, 8248235760l);
	}
}