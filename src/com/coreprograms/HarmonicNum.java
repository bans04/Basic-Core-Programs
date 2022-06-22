package com.coreprograms;

import java.util.Scanner;

public class HarmonicNum {
	public void getHarmonicNum(int num) {
		double sum = 0;
		if(num > 0) {
			for(int i = 1; i < num; i++) {
				sum = sum + (1 / i);
			}
		}
		System.out.println("Harmonic Value:-> " + sum);
	}

	public static void main(String[] args) {
		HarmonicNum harmonicNum = new HarmonicNum();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Num:-> ");
		int num = scanner.nextInt();
		harmonicNum.getHarmonicNum(num);
		
	}
}
