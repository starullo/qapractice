package com;

public class Blackjack {
	
	public static int play(int card1, int card2) {
		int diffOne = 21 - card1;
		int diffTwo = 21 - card2;
		if (card1 > 21 && card2 > 21) {
			return 0;
		} else if (card1 > 21) {
			return card2;
		} else if (card2 > 21) {
			return card1;
		} else {
			if (diffOne < diffTwo) {
				return card1;
			} else {
				return card2;
			}
		}
	}
}
