import javax.swing.JOptionPane;

public class SecretMessageBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String secret = JOptionPane.showInputDialog(null, "Hey.Put a secret mesage in!< (-_-) >");
		JOptionPane.showMessageDialog(null, "Guess the password and you may enter! /(^O^)/");
		JOptionPane.showInputDialog(null, "(Put password)");
		if (secret.equals("whoru")) {
			JOptionPane.showMessageDialog(null, "guessed wrong");
		} else {
			JOptionPane.showMessageDialog(null, "guessed");

		}

	}
}