package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 1;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer = JOptionPane.showInputDialog(null, "What can travel the world but stay in the corner?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (answer .equals("stamp")) {
	JOptionPane.showMessageDialog(null, "Correct! Your score is " + score++);
	
}
else {
	JOptionPane.showMessageDialog(null, "Incorrect. The answer is  a stamp. Score: " + score);
}
		// 5. Otherwise, say "wrong" and tell them the answer
String answer2 = JOptionPane.showInputDialog(null, "What has hands but can not clap?");
		// 6. Add some more riddles
if (answer2 .equals("clock")) {
	JOptionPane.showMessageDialog(null, "Right! Score: " + score++);
}
else {
	JOptionPane.showMessageDialog(null, "Wrong! The answer is a clock.");
}
		// 2. Make a pop up to show the score.
		
	}
}

