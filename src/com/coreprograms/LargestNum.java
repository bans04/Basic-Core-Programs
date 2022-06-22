package com.coreprograms;
import java.util.Scanner;
/*
 * Find largest num from three numrs
 * 
 * @Dnyandeo Bansode
 * 
 * */

public class LargestNum {
	public int getLargestNum(int num1, int num2, int num3) {
		if(num1 > num2 && num1 > num3) {
			return num1;
			//System.out.println(num1 + " is greater ..|");
		}else 
		if(num2 > num1 && num2 > num3){
			//System.out.println(num2 + " is greater..|");
			return num2;
		}else {
			//System.out.println(num3 + " is greater..|");
			return num3;
		}
	}
	public static void main(String[] args) {
		LargestNum largestNum = new LargestNum();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter First num:-> ");
		int num1 = scanner.nextInt();
		
		System.out.print("Enter Second num:-> ");
		int num2 = scanner.nextInt();
		
		System.out.print("Enter Third num:-> ");
		int num3 = scanner.nextInt();
		
		int largNum = largestNum.getLargestNum(num1, num2, num3);
		System.out.println(largNum);
	}
}
