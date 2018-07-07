//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {
		String nickels =
				// Ask the user how many nickels they have
				JOptionPane.showInputDialog(null, "how many nickles do you have");
		// Convert their answer to an int using Integer.parseInt()
		int answer = Integer.parseInt(nickels);
		System.out.println(answer);
		// Ask the user how many dimes they have, and convert their answer
		String dimes = JOptionPane.showInputDialog(null, "how many dimes do you have");
		int amount = Integer.parseInt(dimes);
		System.out.println(amount);

		// Ask the user how many quarters they have, and convert their answer
		String quarters = JOptionPane.showInputDialog(null, "how many quarters do you have");
		int total = Integer.parseInt(quarters);
		System.out.println(total);

		// Calculate how much money the user has and save it in a double variable
double money=(10*(amount)+25*(total)+5*(answer)); 
		// Tell the user how much money they have
		 JOptionPane.showMessageDialog(null, "This is your amount"+ money);


	}
}
