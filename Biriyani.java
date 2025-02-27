package com.Jspiders.ThreadOperations;
public class Biriyani implements Runnable{
public void run()
{
	System.out.println("-----Thread Created---");
	for(int i=1;i<=10;i=i+2)
	{
		System.out.println(i);
	}
	System.out.println("---Thread ends-----");
}
public static void main(String[] args) {
	Biriyani b=new Biriyani();
	Thread ts=new Thread(b);
	ts.start();
}
}
