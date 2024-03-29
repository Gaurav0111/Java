// package Advance_java_code;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;

class MCA extends Frame implements ActionListener {

	TextField textField;

	MCA()
	{
		// Component Creation
		textField = new TextField();

		// setBounds method is used to provide 
		// position and size of the component
		textField.setBounds(60, 50, 180, 25);
		JButton button = new JButton("click Here");
		button.setBounds(100, 120, 80, 30);

		// Registering component with listener
		// this refers to current instance
		button.addActionListener(this);

		// add Components
		add(textField);
		add(button);

		// set visibility
		setVisible(true);
	}

	// implementing method of actionListener
	public void actionPerformed(ActionEvent e)
	{
		// Setting text to field
		textField.setText("GFG!");
	}

	public static void main(String[] args)
	{
	new MCA(); 
	}
}

