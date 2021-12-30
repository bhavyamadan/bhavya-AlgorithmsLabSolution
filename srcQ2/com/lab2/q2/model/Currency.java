package com.lab2.q2.model;

public class Currency {
	int numberOfDenominations;
	int[] denominationArray;
	
	public int getNumberOfDenominations() {
		return numberOfDenominations;
	}
	public void setNumberOfDenominations(int numberOfDenominations) {
		this.numberOfDenominations = numberOfDenominations;
	}
	
	public int[] getDenominationArray() {
		return denominationArray;
	}
	public void setDenominationArray(int[] denominationArray) {
		this.denominationArray = denominationArray;
	}
}
