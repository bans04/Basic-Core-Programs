package com.coreprograms;
import java.util.Scanner;
/*
 * Program to calculate Quetient & Reminder
 * 
 * @Dnyandeo Bansode
 * 
 * */

public class QuetientAndReminder {
	public int getQuetient(int divident, int devisor) {
		int quetient = divident / devisor;
		return quetient;
	}
	
	public int getReminder(int divident, int devisor) {
		int reminder = divident % devisor;
		return reminder;
	}

	public static void main(String[] args) {
		QuetientAndReminder quetientAndReminder = new QuetientAndReminder();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Divident:-> ");
		int divident = scanner.nextInt();
		
		System.out.print("Enter Devisor");
		int devisor = scanner.nextInt();
		
		System.out.println("Quetient:-> " + quetientAndReminder.getQuetient(divident, devisor));
		System.out.println("Reminder:-> " + quetientAndReminder.getReminder(divident, devisor));

	}
}
