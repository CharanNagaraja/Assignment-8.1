package com.thread.java;

public class timer extends Thread {

	@Override
	public void run(){
		super.run();
		try {
			for(int i=0;i<10;i++){
			Thread.sleep(5000);
			
				
				
				
				System.out.println("Timer"+i);
			}}
		 catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}