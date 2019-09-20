package com.dev.threads;

public class SyncNameThread {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("SyncMainThread Started...");
		
		Printer p = new Printer();
		Thread4 t4 = new Thread4(p);
		t4.start();
		t4.join();
		
		Thread5 t5 = new Thread5(p);
		t5.start();
		
		
//		new Thread4(p).start();
//		new Thread5(p).start();		
//		
//		for (int i = 0; i <= 10; i++) {
//			System.out.println("i = "+i);
//		}
//		
		
		System.out.println("SyncMainThread Ended...");
	}

}
