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

			if (file.delete()) {
				JOptionPane.showMessageDialog(null, "File Deleted Successfully");
			} else {
				System.out.println("Failed to delete the file");
			}
		}
	}
}