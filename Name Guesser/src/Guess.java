import javax.swing.JOptionPane;


public class Guess {

	public static void main(String[] args) {
		
		String taller = JOptionPane.showInputDialog("Are you over 6 feet tall?");
		if(taller.equals("no")) {
			JOptionPane.showMessageDialog(null, "Wow, my short King/Queen!");
		}
		else if(taller.equals("yes")) {
			JOptionPane.showMessageDialog(null, "What's the weather like up there?");
		}
		
		String hair = JOptionPane.showInputDialog("What's your hair color?");
		
		if(taller.equals("no") && hair.equals("brown")) {
			JOptionPane.showMessageDialog(null, "You are Cody!");
		}
		else if(taller.equals("yes") && hair.equals("brown")) {
			JOptionPane.showMessageDialog(null, "You are Buddy!");
		}
		else if(taller.equals("no") && hair.equals("blonde")) {
			JOptionPane.showMessageDialog(null, "You are Tammy!");
		}
		else if(taller.equals("yes") && hair.equals("red")) {
			JOptionPane.showMessageDialog(null, "You are Jake!"); {
			}
			
			}
		
		
		
	
		
	
	
	}

}
