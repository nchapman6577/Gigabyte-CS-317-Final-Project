package gigabyte;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIMain extends JFrame implements ActionListener {

	JFrame frameObj = new JFrame("Gigabyte: The Digital Cookbook");

	JButton createBtn = new JButton("Create Recipe");// creates create button
	JButton reviewBtn = new JButton("Review Recipe");// creates review button
	JButton updateBtn = new JButton("Update Recipe");// creates delete button
	JButton deleteBtn = new JButton("Delete Recipe");// creates review button
	JButton helpBtn = new JButton("Help");// creates help button
	JButton exitBtn = new JButton("Exit");// creates exit button

	public GUIMain() {
		// adds action listener for each button
		createBtn.addActionListener(this);
		reviewBtn.addActionListener(this);
		updateBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		helpBtn.addActionListener(this);
		exitBtn.addActionListener(this);
		// adds each button to frame
		frameObj.add(createBtn);
		frameObj.add(reviewBtn);
		frameObj.add(updateBtn);
		frameObj.add(deleteBtn);
		frameObj.add(helpBtn);
		frameObj.add(exitBtn);

		// setting the grid layout using the parameterless constructor
		frameObj.setLayout(new GridLayout(3, 2));
		frameObj.setSize(500, 500);
		frameObj.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == createBtn) {
			CreateRecipe cr = new CreateRecipe();// create button action
		} else if (obj == reviewBtn) {
			ReviewRecipe rr = new ReviewRecipe();// review button action
		} else if (obj == updateBtn) {
			UpdateRecipe ur = new UpdateRecipe();// update button action
		} else if (obj == deleteBtn) {
			DeleteRecipe dr = new DeleteRecipe();// delete button action
		} else if (obj == helpBtn) {
			HelpAbout ha = new HelpAbout();// help/about button action
		} else if (obj == exitBtn) {
			System.exit(0);// exit button action
		}

	}

	public static void main(String[] args) {
		GUIMain app = new GUIMain();

	}

}