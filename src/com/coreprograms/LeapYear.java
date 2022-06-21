package com.coreprograms;

import java.util.Scanner;

public class LeapYear {
	public void leapYearOrNot(int year) {
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("Entered Year is Leap Year..|");
		}else {
		System.out.println("Entered Year is Not Leap Year..|");
		}
	}

	public static void main(String[] args) {
		LeapYear leapYear = new LeapYear();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Year that U want to check whether it is Leap year or not:-> ");
		int year = scanner.nextInt();
		
		if(year > 1000 && year < 9999) {
			leapYear.leapYearOrNot(year);
		}else {
		System.out.println("Enter Four digit Year..|");
		}
	}
}
