package _03_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String jon = "Jon you are pretty cool and a good person to have a laugh with!";
String ian = "Ian I like how nice you are";
String lok = "Lok you are so smart!";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String name = JOptionPane.showInputDialog(null, "What is your name?");

		// 3. In a pop-up, tell the user what is remarkable about that person. 
if (name.equalsIgnoreCase("ian")) {
	JOptionPane.showMessageDialog(null, ian);
}
if (name.equalsIgnoreCase("jon")) {
	JOptionPane.showMessageDialog(null, jon);
}
if (name.equalsIgnoreCase("lok")) {
	JOptionPane.showMessageDialog(null, lok);
}
else {
	JOptionPane.showMessageDialog(null, "You are very cool " + name);
}
	}
}

