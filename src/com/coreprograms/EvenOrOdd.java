package com.coreprograms;
import java.util.Scanner;
/*
 * Check whether entered num is Even or Odd
 * 
 * @Dnyandeo Bnaosde
 * 
 * */

public class EvenOrOdd {
	public void evenOrOdd(int num) {
		if(num % 2 == 0) {
			System.out.println(num + " is Even num..|");
		}else {
			System.out.println(num + " is Odd num..|");
		}
	}

	public static void main(String[] args) {
		EvenOrOdd evenOrOdd = new EvenOrOdd();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter num that U want to Check whether it is Even or Odd:-> ");
		int num = scanner.nextInt();
		
		evenOrOdd.evenOrOdd(num);
	}
}
