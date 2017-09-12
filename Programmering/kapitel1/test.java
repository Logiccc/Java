import javax.swing.*;
import java.awt.*;
import java.util.*;

public class test {
	public static void main(String[]args) {
		//Toolkit.getDefaultToolkit().beep(); //Ljud effekt
		JOptionPane.showMessageDialog(null, "Hello guys!" + "\nMe name Logic."); //1sta meddelandet
 		//Toolkit.getDefaultToolkit().beep(); //Ljud effekt nr2
		JOptionPane.showMessageDialog(null, "I am insane counter strick"); //Andra meddelandet
		JOptionPane.showMessageDialog(null, "Datum och tid: \n" + Calendar.getInstance().getTime().toString()); //Kalender
		String s1;
		s1 = "What's up guys";
		String s2;
		s2 = " It's ya boi";
		String s3; 
		s3 = "  goDazed";
		String s4; 
		s4 = "\n";
		JOptionPane.showMessageDialog(null, s1 + s4 + s2 + s4 + s3);
		//This is kommentar
		/* Multiline kommentar test1
		/
		/
		/
		*/


	}
}