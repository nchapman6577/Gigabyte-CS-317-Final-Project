package gigabyte;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class DeleteRecipe {
	DeleteRecipe() {

		JFileChooser fc = new JFileChooser();

		int returnVal = fc.showOpenDialog(fc);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();

			if (file.delete()) {// deletes selected file
				JOptionPane.showMessageDialog(null, "File Deleted Successfully");// lets user know that file was
																					// successfully deleted
			} else {
				JOptionPane.showMessageDialog(null, "File Wasn't Deleted, Try Again");// lets user know that file wasn't
																						// deleted
			}
		}
	}
}