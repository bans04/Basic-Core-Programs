package com.coreprograms;

import java.util.Scanner;

public class FlipCoin {
	public double getRandomNum() {
		double randomNum = ((Math.random() * 10) % 1);
		return randomNum;
	}

	public static void main(String[] args) {
		int tail = 0;
		int head = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of Times U want to Flip Coin:-> ");
		int noOfTime = scanner.nextInt();
		int start = 0;
		
		for(int i = 0; i <= noOfTime; i++) {
			FlipCoin flipCoin = new FlipCoin();
			//System.out.println(flipCoin.getRandomNum());
			double num = flipCoin.getRandomNum();
			if(num < 0.5) {
				tail++;
			}else{
				head++;
			}
		}
		int percentageOfTail = tail * 100 / noOfTime;
		int percentageOfHead = head * 100 / noOfTime;
		System.out.println("Percentage of tail:->" + percentageOfTail + "%");
		System.out.println("Percentage of head:-> " + percentageOfHead + "%");
	}
}
