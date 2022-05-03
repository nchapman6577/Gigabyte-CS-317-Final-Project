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

public class CreateRecipe implements ActionListener {
	
	JFrame frame = new JFrame("Create Recipe");// creates frame

	JTextField recipeNameTextField = new JTextField("");// creates recipe name text field
	JLabel recipeNameLabel = new JLabel("Recipe Name");// creates recipe name label

	JTextField totalTimeTextField = new JTextField();// creates total time text field
	JLabel totalTimeLabel = new JLabel("Total Time in Mintues");// creates total time label

	JTextField servingTextField = new JTextField();// creates serving text field
	JLabel servingLabel = new JLabel("Servings");// creates serving label

	JTextField calorieTextField = new JTextField();// creates calorie text field
	JLabel calorieLabel = new JLabel("Calories Per Serving");// creates calorie label

	JTextField ingredientTextField = new JTextField();// creates ingredient text field
	JLabel ingredientLabel = new JLabel("Ingredients");// creates ingredient label

	JTextField instructionTextField = new JTextField();// creates instruction text field
	JLabel instructionLabel = new JLabel("Instructions");// creates instruction label

	JButton submitButton = new JButton("Submit");// creates submit button
	JLabel blank = new JLabel();

	public CreateRecipe() {
		GridLayout g1 = new GridLayout(0, 1); // create grid layout

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

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand() == submitButton.getActionCommand()) {
			try {
				String fileName = "C:\\Users\\naina\\OneDrive\\Desktop\\" + recipeNameTextField.getText() + ".txt";

				File file = new File(fileName);
				file.createNewFile();
				FileWriter fileWriter = new FileWriter(
						"C:\\Users\\naina\\OneDrive\\Desktop\\" + recipeNameTextField.getText() + ".txt");
				;
				fileWriter.write(recipeNameTextField.getText() + "\n");
				fileWriter.write(totalTimeTextField.getText() + "\n");
				fileWriter.write(servingTextField.getText() + "\n");
				fileWriter.write(calorieTextField.getText() + "\n");
				fileWriter.write(ingredientTextField.getText() + "\n");
				fileWriter.write(instructionTextField.getText() + "\n");
				fileWriter.close();
				JOptionPane.showMessageDialog(null, "File Written Successfully");

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e + "");
			}
		}

	}

}
