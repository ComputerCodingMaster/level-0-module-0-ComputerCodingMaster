package extra;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog(null, "Hi.What's you're name?");
		JOptionPane.showMessageDialog(null, "Hi " + name);
	}
}
