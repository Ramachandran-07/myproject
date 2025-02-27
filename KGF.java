package com.Jspiders.ThreadOperations;

public class KGF extends Thread
{
public void run() {
	System.out.println("Thread is created");
	System.out.println("----Starts Execution----");
	for(int i=1;i<=3;i++)
	{
		System.out.println(i);
	}
	System.out.println("-----End Execution----");
}
public static void main(String[] args) {
	KGF k=new KGF();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	k.start();//Starts method creates thread &starts 
	//execution of an thread by invoking run() method
}
}
