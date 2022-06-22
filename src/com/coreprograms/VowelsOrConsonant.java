package com.coreprograms;
import java.util.Scanner;
/*
 * Check Entered char whether it is Vowels or Consonant
 * 
 * @Dnyandeo Bansode
 * 
 * */

public class VowelsOrConsonant {
	public void vowelsOrConsonant(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println(ch + " is a Vowel.");
		}else {
			System.out.println(ch + " is a Consonant.");
		}
	}
	public static void main(String[] args) {
		VowelsOrConsonant vowelsOrConsonant = new VowelsOrConsonant();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Char that U want to Check whether it is Vowels or Consonant:-> ");
		char ch = scanner.next().charAt(0);
		
		vowelsOrConsonant.vowelsOrConsonant(ch);
	}
}
