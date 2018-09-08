package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String birthday = JOptionPane.showInputDialog("What is your birthday?");
		if ("9/8".equals(birthday)) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!");

		}
		else {
			JOptionPane.showMessageDialog(null,"Merry Unbirthday");
		}
	}
}
