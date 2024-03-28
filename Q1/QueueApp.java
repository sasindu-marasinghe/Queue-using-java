package Q1;

import java.util.Scanner;

public class QueueApp {

	public static void main(String[] args) {
		QueueX mainQueue = new QueueX(5);
		Scanner scn = new Scanner(System.in);
		int temp = 0;
		
		for(int i =0; i < 5; i++) {
			System.out.println("Enter transaction ID: ");
			mainQueue.insert(scn.nextInt());
		}
		
		QueueX evenQueue = new QueueX(5);
		QueueX oddQueue = new QueueX(5);
		
		while(!mainQueue.isEmpty()) {
			temp = mainQueue.remove();
			
			if(temp%2 ==1) {
				oddQueue.insert(temp);
			}else {
				evenQueue.insert(temp);
			}
		}
		System.out.println("PC1");
		while(!evenQueue.isEmpty()) {
			System.out.println("   Transaction " + evenQueue.remove());
		}
		
		System.out.println("PC2");
		while(!oddQueue.isEmpty()) {
			System.out.println("   Transaction " + evenQueue.remove());
		}
	}
	



}
