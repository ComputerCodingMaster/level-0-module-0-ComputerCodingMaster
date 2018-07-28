import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String bday = JOptionPane.showInputDialog("Hi.Whats your birthday?");
		if (bday.equals("7/28")) {
			JOptionPane.showMessageDialog(null, "Happy birthday");
		} else {
			JOptionPane.showMessageDialog(null, "Very merry Unhappy birthday");

		}

	}
}