
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		 int option = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
		 if(option==0) {
			 isWeekday=true;
		 } else {
			 isWeekday=false;
		 }
		 if(isWeekday) {
			 JOptionPane.showMessageDialog(null, "get up lazybones");
		 }else {
			 JOptionPane.showMessageDialog(null, "sleep in");
		 }
		 		
		int decide = JOptionPane.showConfirmDialog(null, "Is it a vacation?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
		if(decide==1) {
			 isVacation=false;
		 }else {
			 isVacation=true;
		 }
		if (isVacation) {
			JOptionPane.showMessageDialog(null, "sleep in");
		}else {
			 JOptionPane.showMessageDialog(null, "get up lazybones");
		}
		int answer = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
		if(answer==0) {
			isWeekday = true;
			isVacation = true;
		}else {
			isVacation= false;
			isWeekday=false;
		}
		 if(isWeekday && isVacation) {
			 JOptionPane.showMessageDialog(null, "sleep in");
		 }else {
			 JOptionPane.showMessageDialog(null, "not scheduel ");
		 }
	}
}

/* You MUST use the above boolean variables in your code */
/*
 * Ask the user for these values using a confirm dialog like the one below
 * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head",
 * JOptionPane.YES_NO_OPTION);
 */
/*
 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday, print
 * “get up lazybones!” If it is a weekday, and we are on vacation, print “sleep
 * in”.
*/