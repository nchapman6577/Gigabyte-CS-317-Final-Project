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

	JButton createBtn = new JButton("Create Recipe");
	JButton reviewBtn = new JButton("Review Recipe");
	JButton updateBtn = new JButton("Update Recipe");
	JButton deleteBtn = new JButton("Delete Recipe");
	JButton helpBtn = new JButton("Help");
	JButton exitBtn = new JButton("Exit");

	public GUIMain() {

		createBtn.addActionListener(this);
		reviewBtn.addActionListener(this);
		updateBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		helpBtn.addActionListener(this);
		exitBtn.addActionListener(this);

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