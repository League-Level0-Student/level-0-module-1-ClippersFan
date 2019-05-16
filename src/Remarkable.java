import javax.swing.JOptionPane;

public class Remarkable {

	public static void main(String[] args) {
		String remark = JOptionPane.showInputDialog("What is your name?");
		if(remark.equals("Ritvik")){
			System.out.println("You are very cool!");
		}else {
			System.out.println("You are very uncool!");
		}
	}
	  
}
