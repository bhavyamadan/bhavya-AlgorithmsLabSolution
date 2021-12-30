package com.lab2.q2.main;

import java.util.Scanner;

import com.lab2.q2.model.Currency;
import com.lab2.q2.service.MergeSort;
import com.lab2.q2.service.NotesCount;

public class Driver {

	public static void main(String[] args) {
		Currency c	  = new Currency();
		MergeSort ms  = new MergeSort();
		NotesCount nc = new NotesCount();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of currency denominations");
		c.setNumberOfDenominations(sc.nextInt());
		
		System.out.println("Enter the currency denominations value");
		int[] notes = new int[c.getNumberOfDenominations()];
		int temp = 0;
		while(temp < c.getNumberOfDenominations()) {
			notes[temp] = sc.nextInt();
			temp++;
		}
		c.setDenominationArray(notes);
		
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		ms.sort(notes, 0, notes.length-1);
		nc.currencyDistribution(c, amount);
		
		sc.close();
	}

}
