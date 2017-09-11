import javax.swing.*;
import java.awt.*;
import java.util.*;

public class test {
	public static void main(String[]args) {
		Toolkit.getDefaultToolkit().beep(); //Ljud effekt
		JOptionPane.showMessageDialog(null, "Hello guys!" + "\nMe name Logic."); //1sta meddelandet
 		Toolkit.getDefaultToolkit().beep(); //Ljud effekt nr2
		JOptionPane.showMessageDialog(null, "I am insane counter strick"); //Andra meddelandet
		JOptionPane.showMessageDialog(null, "Datum och tid:  \n" + Calendar.getInstance().getTime().toString()); //Kalender
		//This is kommentar
		/* Multi line kommentar
		/123
		/123
		*/





	}
}