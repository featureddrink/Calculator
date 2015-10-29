import java.awt.*;
import javax.swing.*;

public class UserInterface implements Runnable {

	private JFrame frame;
	
	public void run() {
		frame = new JFrame("Calculator");
		frame.setPreferredSize(new Dimension(400, 500));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		createComponents(frame.getContentPane());
		frame.pack();
		frame.setVisible(true);
	}
	
	private void createComponents(Container container) {
		container.setLayout(new GridLayout(4, 1));
		
		JTextField output = new JTextField("0");
		JTextField input = new JTextField();
		
		JButton add = new JButton("+");
		JButton subtract = new JButton("-");
		JButton multiply = new JButton("x");
		JButton divide = new JButton("/");
		
		JButton one = new JButton("1");
		JButton two = new JButton("2");
		JButton three = new JButton("3");
		JButton four = new JButton("4");
		JButton five = new JButton("5");
		JButton six = new JButton("6");
		JButton seven = new JButton("7");
		JButton eight = new JButton("8");
		JButton nine = new JButton("9");
		JButton zero = new JButton("0");
		JButton clear = new JButton("C");
		JButton reset = new JButton("CE");
		JButton calculate = new JButton("Calculate");
		
		JPanel operators = new JPanel(new GridLayout(1, 4));
		operators.add(add);
		operators.add(subtract);
		operators.add(multiply);
		operators.add(divide);
		
		JPanel numbers = new JPanel(new GridLayout(4, 3));
		numbers.add(one);
		numbers.add(two);
		numbers.add(three);
		numbers.add(four);
		numbers.add(five);
		numbers.add(six);
		numbers.add(seven);
		numbers.add(eight);
		numbers.add(nine);
		numbers.add(clear);
		numbers.add(zero);
		numbers.add(reset);
		
		output.setEnabled(false);
		
		ActionEventListener handler = new ActionEventListener(output, input, add, subtract, multiply, divide, one, two, three,
				four, five, six, seven, eight, nine, zero, clear, reset);
		output.addActionListener(handler);
		input.addActionListener(handler);
		add.addActionListener(handler);
		subtract.addActionListener(handler);
		multiply.addActionListener(handler);
		divide.addActionListener(handler);
		one.addActionListener(handler);
		two.addActionListener(handler);
		three.addActionListener(handler);
		four.addActionListener(handler);
		five.addActionListener(handler);
		six.addActionListener(handler);
		seven.addActionListener(handler);
		eight.addActionListener(handler);
		nine.addActionListener(handler);
		zero.addActionListener(handler);
		clear.addActionListener(handler);
		reset.addActionListener(handler);
		calculate.addActionListener(handler);
		
		container.add(output);
		container.add(input);
		container.add(operators);
		container.add(numbers);
	}
	
	public JFrame getFrame() {
		return frame;
	}
	
}
