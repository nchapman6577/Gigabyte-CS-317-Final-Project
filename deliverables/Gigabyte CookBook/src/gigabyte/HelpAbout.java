package gigabyte;

//https://www.youtube.com/watch?v=y8IiDp5jgTc
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class HelpAbout {

	public HelpAbout() {
		JOptionPane.showMessageDialog(null,
				"Create Recipe: \r\n" + "1: Click the create recipe button\r\n" + "2: Enter in recipe data\r\n"
						+ "3: Click the submit button\r\n" + "4: A message will pop up if the recipe was create \r\n"
						+ "5: Exit out of the pop up message and the create recipe box once done\r\n" + "\r\n"
						+ "Review Recipe:\r\n" + "1: Click the review recipe button\r\n"
						+ "2: Go to the files location by looking through the directory\r\n"
						+ "3: Click the file and then click the open button\r\n"
						+ "4: Once done reviewing the recipe exit out\r\n" + "\r\n" + "Update Recipe:\r\n"
						+ "1: Click the update recipe button\r\n"
						+ "2: Go to the files location by looking through the directory\r\n"
						+ "3: Click the file and then click the open button\r\n" + "4: Change desired data\r\n"
						+ "5: Click the submit button\r\n" + "6: A message will pop up if the recipe was updated\r\n"
						+ "7: Exit out of the pop up message and the update recipe box once done\r\n" + "\r\n"
						+ "Delete Recipe:\r\n" + "1: Click the delete recipe button\r\n"
						+ "2: Go to the files location by looking through the directory\r\n"
						+ "3: Click the file and then click the open button\r\n"
						+ "6: A message will pop up if the recipe was deleted\r\n"
						+ "4: Once done deleting the recipe exit out of the pop up message\r\n" + "");
	}

}
