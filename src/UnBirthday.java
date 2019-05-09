import javax.swing.JOptionPane;

public class UnBirthday {

	public static void main(String[] args) {
		String birthday = JOptionPane.showInputDialog("When is your birthday?(in mm/dd)");
				if(birthday.equals("05/08")) {
					System.out.println("Happy BIRTHDAY!!!");
				
				
				}else {System.out.println("I wish you a very very merry UNbirthday.");}
	}
}
