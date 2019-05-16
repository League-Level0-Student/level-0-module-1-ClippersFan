import javax.swing.JOptionPane;

public class Secret_Message_Box {
	public static void main(String [] args) {
		String secret = JOptionPane.showInputDialog("Tell me a secret message.");
		String password = JOptionPane.showInputDialog("You can only see the secret message if you can guess my passcode! What is my passcode?");
		if(password.equals("IDK")) {
			JOptionPane.showMessageDialog(null, "The secret message is " +secret);
			
		}else {
			JOptionPane.showMessageDialog(null, "INTRUDER ALERT!!!");
		}
}
}
