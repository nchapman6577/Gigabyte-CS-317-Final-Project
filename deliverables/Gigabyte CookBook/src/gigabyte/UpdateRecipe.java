package gigabyte;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UpdateRecipe implements ActionListener {
	private JLabel recipeNameTextField;
	private JLabel recipeNameLabel;
	private JTextField totalTimeTextField;
	private JLabel totalTimeLabel;
	private JTextField servingTextField;
	private JLabel servingLabel;
	private JTextField calorieTextField;
	private JLabel calorieLabel;
	private JTextField ingredientTextField;
	private JLabel ingredientLabel;
	private JTextField instructionTextField;
	private JLabel instructionLabel;
	private JButton submitButton;
	private JLabel blank;

	private String line1, line2, line3, line4, line5, line6;

	UpdateRecipe() {
		JFileChooser fc = new JFileChooser();
		JFrame frame = new JFrame("Update Recipe");// creates frame

		int returnVal = fc.showOpenDialog(frame);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();
			try {

				BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
				for (int i = 0; i < 0; i++)
					input.readLine();
				line1 = input.readLine();// pulls line from file
				line2 = input.readLine();// pulls line from file
				line3 = input.readLine();// pulls line from file
				line4 = input.readLine();// pulls line from file
				line5 = input.readLine();// pulls line from file
				line6 = input.readLine();// pulls line from file
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Operation has been CANCELLED");
		}

		recipeNameTextField = new JLabel(line1);// creates recipe name text field with added pulled data from file
		recipeNameLabel = new JLabel("Recipe Name");// creates recipe name label

		totalTimeTextField = new JTextField(line2);// creates total time text field with added pulled data from file
		totalTimeLabel = new JLabel("Total Time");// creates total time label

		servingTextField = new JTextField(line3);// creates serving text field with added pulled data from file
		servingLabel = new JLabel("Servings");// creates serving label

		calorieTextField = new JTextField(line4);// creates calorie text field with added pulled data from file
		calorieLabel = new JLabel("Calories Per Serving");// creates calorie label

		ingredientTextField = new JTextField(line5);// creates ingredient text field with added pulled data from file
		ingredientLabel = new JLabel("Ingredient");// creates ingredient label

		instructionTextField = new JTextField(line6);// creates instruction text field with added pulled data from file
		instructionLabel = new JLabel("Instruction");// creates instruction label

		submitButton = new JButton("Submit");// creates submit button
		blank = new JLabel();

		// create grid layout
		GridLayout g1 = new GridLayout(0, 1);

		// add layout, action listener, buttons, labels, and text fields to frame
		frame.setLayout(g1);

		submitButton.addActionListener(this);

		frame.add(recipeNameLabel);
		frame.add(recipeNameTextField);
		frame.add(totalTimeLabel);
		frame.add(totalTimeTextField);
		frame.add(servingLabel);
		frame.add(servingTextField);
		frame.add(calorieLabel);
		frame.add(calorieTextField);
		frame.add(ingredientLabel);
		frame.add(ingredientTextField);
		frame.add(instructionLabel);
		frame.add(instructionTextField);
		frame.add(blank);
		frame.add(submitButton);

		frame.setSize(400, 400);
		frame.setVisible(true);// makes frame visible

	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand() == submitButton.getActionCommand()) {
			try {
				String fileName = "C:\\Users\\naina\\OneDrive\\Desktop\\" + recipeNameTextField.getText() + ".txt";// creates
																													// file
																													// name
																													// from
																													// recipeNameTextField

				File file = new File(fileName);
				file.createNewFile();
				FileWriter fileWriter = new FileWriter(
						"C:\\Users\\naina\\OneDrive\\Desktop\\" + recipeNameTextField.getText() + ".txt");
				;
				fileWriter.write(recipeNameTextField.getText() + "\n");// writes recipe name to file
				fileWriter.write(totalTimeTextField.getText() + "\n");// writes total time to file
				fileWriter.write(servingTextField.getText() + "\n");// writes serving size to file
				fileWriter.write(calorieTextField.getText() + "\n");// writes calorie to file
				fileWriter.write(ingredientTextField.getText() + "\n");// writes ingredient to file
				fileWriter.write(instructionTextField.getText() + "\n");// writes instruction to file
				fileWriter.close();
				JOptionPane.showMessageDialog(null, "File Updated Successfully");// lets user know that file was
																					// sucessful

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e + "");
			}
		}

	}

}
