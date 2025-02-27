package com.Jspiders.ThreadOperations;
public class Pause_Stop extends Thread {
  public void run()
  {
	  System.out.println("-----Thread created-----");
	  System.out.println("-----Thread starts execution-----");
	  for(int i=1;i<=5;i++)
	  {
		  try
		  {
			  Thread.sleep(3000);
		  }
		  catch(InterruptedException e)
		  {
			  e.printStackTrace();
		  }
		  System.out.println(i);
	  }
		System.out.println("------Thread end's it's execution");  
  }
  public static void main(String[] args) {
	Pause_Stop ps=new Pause_Stop();
	ps.start();
	Pause_Stop ps1=new Pause_Stop();
	ps1.start();
	
	
}
}
