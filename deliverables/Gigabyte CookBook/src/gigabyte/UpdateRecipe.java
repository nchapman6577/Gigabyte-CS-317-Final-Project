package gigabyte;

//http://www.java2s.com/Tutorials/Java/Swing_How_to/JFileChooser/Display_the_Contents_of_a_text_file_in_a_JTextArea.htm
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
//from  w  ww  . j  a  v a  2s  .co  m
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

		JTextArea tarea = new JTextArea(10, 10);
		int returnVal = fc.showOpenDialog(frame);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();
			try {

				BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
				for (int i = 0; i < 0; i++)
					input.readLine();
				line1 = input.readLine();
				line2 = input.readLine();
				line3 = input.readLine();
				line4 = input.readLine();
				line5 = input.readLine();
				line6 = input.readLine();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Operation has been CANCELLED");
		}

		recipeNameTextField = new JLabel(line1);// creates recipe name text field
		recipeNameLabel = new JLabel("Recipe Name");// creates recipe name label

		totalTimeTextField = new JTextField(line2);// creates total time text field
		totalTimeLabel = new JLabel("Total Time");// creates total time label

		servingTextField = new JTextField(line3);// creates serving text field
		servingLabel = new JLabel("Servings");// creates serving label

		calorieTextField = new JTextField(line4);// creates calorie text field
		calorieLabel = new JLabel("Calories Per Serving");// creates calorie label

		ingredientTextField = new JTextField(line5);// creates ingredient text field
		ingredientLabel = new JLabel("Ingredient");// creates ingredient label

		instructionTextField = new JTextField(line6);// creates instruction text field
		instructionLabel = new JLabel("Instruction");// creates instruction label

		submitButton = new JButton("Submit");// creates submit button
		blank = new JLabel();

		// create grid layout
		GridLayout g1 = new GridLayout(0, 1);
		// g1.setColumns(2);
		// g1.setRows(4);

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
		// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);// makes frame visible

	}

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
