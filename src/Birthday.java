import javax.swing.JOptionPane;

public class Birthday {

	public static void main(String[] args) {
		String birthday = "11/14/2019";
		
	String birth = JOptionPane.showInputDialog(null, "When is your birthday? mm/dd/yyyy");
	
	if (birth.equals(birthday)) {
		JOptionPane.showMessageDialog(null, "Happy birthday!");
		
		}
	else {
		JOptionPane.showMessageDialog(null, "Happy UNbirthday!");
	}
	
	}
}
