package ifs_ints_and_loops;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String riddle1 = JOptionPane.showInputDialog(null, "What is a cow's favorite music?");

		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (riddle1.equals("Moosic")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score = score + 1;
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "Wrong! The original answer was Moosic!");
		}

		// 6. Add some more riddles
		String riddle2 = JOptionPane.showInputDialog("You are in a cold cube room, how do you get warmer?");
		if (riddle2.equals("go into the corner, it is 90 degrees")) {
			JOptionPane.showMessageDialog(null, "Correct!");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong!");

		}
		score = score + 2;
	}

	// 2. Make a pop up to show the score.
}
