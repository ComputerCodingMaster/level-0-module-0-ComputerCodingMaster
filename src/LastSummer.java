
import javax.swing.JOptionPane;

public class LastSummer {

	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog(null, "Hi.Whats your name?");
		JOptionPane.showMessageDialog(null, "Hi " + name);
		JOptionPane.showMessageDialog(null, "I know you had fun last summer, " + name + " MUHAHAHAHHA");
	}
}