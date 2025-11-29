/*
A functions read and return array.
 another function display array,
 third function takes an array and an searching value and return the index
*/


import java.io.*;
import java.util.*;

class CDispArray {
	public int[] read(){
		Scanner s;
		s= new Scanner(System.in);
		int n,i,a[];
		System.out.println("Enter the number of elements:");
		n = s.nextInt(); 
		a = new int[n];
		for(i = 0;i < n;i++){
			a[i] = s.nextInt();
		}
		return a;
	}

	public void disp(int a[],int n) {
		int i;
		for(i = 0;i<n;i++){
			System.out.println(a[i]);
		} 
	}
	public void disp(int a[]) {
		int i;
		for(i = 0;i<a.length;i++){
			System.out.println(a[i]);
		} 
	}
	public int search(int a[],int key){
		int i;
		for(i=0;i<a.length;i++){
			if(a[i] == key)
				return i;
		}
		return -1;
	}
}

class MArrayPass {
	public static void main(String args[]) {
		CDispArray obj;
		obj = new CDispArray();
		int a[] = obj.read();
		obj.disp(a);
		obj.disp(a,3);
		int pos = obj.search(a,2);
		if(pos == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at " + obj.search(a,2));
	}
}