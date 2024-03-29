package com.dev.searching;

public class Searching {
	public static void main(String[] args) {
		int [] arr = {5,65,55,5688};
		System.out.println(numberSearch(arr, 55));
		
		int[] arr1 = {6,9,55,20,65};
		System.out.println("binarySearch() : "+binarySearch(arr1, 0, arr1.length-1, 65));
		
		int[] arr2 = {6,9,55,20,65};
		System.out.println("binarySearchLoop() : "+binarySearchLoop(arr2, 65));
	}
	
	//Using loop
	public static int binarySearchLoop(int[] arr2, int key) {
		int low = 0;
		int high = arr2.length-1;
		while (low <= high) {
			int mid = (low+high)/2;
			if (key == arr2[mid]) {
				return mid;
			}
			else if (key < arr2[mid]) {
				high = mid-1;
			}
			else {
				low = mid+1;
			}
		}
		return -1;
	}
	
	//recursive way
	public static int binarySearch(int[] arr1, int low, int high, int data) {
		int mid = low + (high-low)/2;
		if (low <= high) {
			if (arr1[mid] == data ) {
				return mid;
			}
			else if (arr1[mid] < data ) {
				return binarySearch(arr1,mid+1,high,data);
			}
			else {
				return binarySearch(arr1,low,mid-1,data);
			}
		}
		return -1;
	}
	
	//linear search
	public static boolean numberSearch(int[] arr, int value) {
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				return true;
			}
		} 
		return false;
	}
}
