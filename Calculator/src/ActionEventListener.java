import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ActionEventListener implements ActionListener {
	
	private Calculator calculator;
	private JTextField output;
	private JTextField input;
	private JButton add;
	private JButton subtract;
	private JButton multiply;
	private JButton divide;
	private JButton one;
	private JButton two;
	private JButton three;
	private JButton four;
	private JButton five;
	private JButton six;
	private JButton seven;
	private JButton eight;
	private JButton nine;
	private JButton zero;
	private JButton clear;
	private JButton reset;
	
	public ActionEventListener(JTextField output, JTextField input, JButton add, JButton subtract, JButton multiply,
			JButton divide, JButton one, JButton two, JButton three, JButton four, JButton five, JButton six,
			JButton seven, JButton eight, JButton nine, JButton zero, JButton clear, JButton reset) {
		this.calculator = new Calculator();
		this.output = output;
		this.input = input;
		this.add = add;
		this.subtract = subtract;
		this.multiply = multiply;
		this.divide = divide;
		this.one = one;
		this.two = two;
		this.three = three;
		this.four = four;
		this.five = five;
		this.six = six;
		this.seven = seven;
		this.eight = eight;
		this.nine = nine;
		this.zero = zero;
		this.clear = clear;
		this.reset = reset;
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == one) input.setText(input.getText() + 1);
		if (ae.getSource() == two) input.setText(input.getText() + 2);
		if (ae.getSource() == three) input.setText(input.getText() + 3);
		if (ae.getSource() == four) input.setText(input.getText() + 4);
		if (ae.getSource() == five) input.setText(input.getText() + 5);
		if (ae.getSource() == six) input.setText(input.getText() + 6);
		if (ae.getSource() == seven) input.setText(input.getText() + 7);
		if (ae.getSource() == eight) input.setText(input.getText() + 8);
		if (ae.getSource() == nine) input.setText(input.getText() + 9);
		if (ae.getSource() == zero) input.setText(input.getText() + 0);
		
		if (ae.getSource() == add) {
			try {
				calculator.add(Integer.parseInt(input.getText()));
			} catch (Exception ex) {}
			output.setText("" + calculator.getCount());
			input.setText("");
			input.requestFocus();
		}
		if (ae.getSource() == subtract) {
			try {
				calculator.subtract(Integer.parseInt(input.getText()));
			} catch (Exception ex) {}
			output.setText("" + calculator.getCount());
			input.setText("");
			input.requestFocus();
		}
		if (ae.getSource() == multiply) {
			try {
				calculator.multiply(Integer.parseInt(input.getText()));
			} catch (Exception ex) {}
			output.setText("" + calculator.getCount());
			input.setText("");
			input.requestFocus();
		}
		if (ae.getSource() == divide) {
			try {
				calculator.divide(Integer.parseInt(input.getText()));
			} catch (Exception ex) {}
			output.setText("" + calculator.getCount());
			input.setText("");
			input.requestFocus();
		}
		
		if (ae.getSource() == clear) {
			input.setText("");
			input.requestFocus();
		}
		
		if (ae.getSource() == reset) {
			calculator.reset();
			output.setText("0");
			input.requestFocus();
		}
	}

}
