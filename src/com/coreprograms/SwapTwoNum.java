package com.coreprograms;
import java.util.Scanner;
/*
 * Swap two numrs
 * 
 * @Dnyandeo Bansode
 * 
 * */

public class SwapTwoNum {
	public void swapTwoNumrs(int num1, int num2) {
		int num3;
		num3 = num1;
		
		num1 = num2;
		num2 = num3;
		System.out.println("Swaped Two num are:-> ");
		System.out.println("Swaped first num with seconde:-> " + num1);
		System.out.println("Swaped second num with first:-> " + num2);
	}

	public static void main(String[] args) {
		SwapTwoNum swapTwoNum = new SwapTwoNum();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first num1:-> ");
		int num1 = scanner.nextInt();
		System.out.print("Enter second num2:-> ");
		int num2 = scanner.nextInt();
		
		swapTwoNum.swapTwoNumrs(num1, num2);
	}
}
