package com.dev.threads;

public class SyncPrinter {

	synchronized public static void printVal1(int i, String thread) {

		for (int k = 0; k <= i; k++) {
			System.out.println("Thread: "+thread+" "+"k: "+k);		
		}

	}
}
