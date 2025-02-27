package com.Jspiders.ThreadOperations;
public class Dummy extends Thread {
public void run()
{
	System.out.println("Id: "+Thread.currentThread().getId());
	System.out.println("Name: "+Thread.currentThread().getName());
	Thread.currentThread().setName("Mr.420");
	System.out.println("After chaning Name of Thread: "
	          +Thread.currentThread().getName());
	System.out.println("Priority : "+Thread.currentThread().getPriority());
	Thread.currentThread().setPriority(8);
	System.out.println("After change : "+Thread.currentThread().getPriority());
}
public static void main(String[] args) {
	System.out.println("Main Id: "+Thread.currentThread().getId());
	System.out.println("Main Name: "+Thread.currentThread().getName());
	Thread.currentThread().setName("Mr.Main");
	System.out.println("After change Main Thread Name : "+Thread.currentThread().getName());
	System.out.println("Main Priority : "+Thread.currentThread().getPriority());
	Thread.currentThread().setPriority(9);
	System.out.println("after change Mr.Main Priority: "+Thread.currentThread().getPriority());
	Dummy d=new Dummy();
	d.start();
}
}
