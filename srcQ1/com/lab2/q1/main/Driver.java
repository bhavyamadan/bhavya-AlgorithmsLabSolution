package com.lab2.q1.main;

import java.util.Scanner;

import com.lab2.q1.model.Transactions;
import com.lab2.q1.service.TransactionService;

public class Driver {

	public static void main(String args[]) {
		Transactions t = new Transactions();
		TransactionService ts = new TransactionService();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array");
		t.setNumberOfTransactions(sc.nextInt());
		
		int temp = 0;
		int[] array = new int[t.getNumberOfTransactions()];
		System.out.println("Enter the values of array");
		while(temp < t.getNumberOfTransactions()) {
			array[temp] = sc.nextInt();
			temp++;
		}
		t.setTransactionArray(array);
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		t.setTargetCount(sc.nextInt());
		for(temp = 0; temp<t.getTargetCount(); temp++) {
			System.out.println("Enter the value of target");
			t.setTarget(sc.nextInt());
			ts.checkTarget(t);
		}
		
		sc.close();
	}

}
