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
		JLabel davidsCalc = new JLabel("David's Calculator");
		
		JPanel display = new JPanel(new GridLayout(2, 1));
		display.add(davidsCalc);
		display.add(output);
		
		JPanel operators = new JPanel(new GridLayout(1, 4));
		operators.add(add);
		operators.add(subtract);
		operators.add(multiply);
		operators.add(divide);
		
		JPanel inputAndOperators = new JPanel(new GridLayout(2, 1));
		inputAndOperators.add(input);
		inputAndOperators.add(operators);
		
		JPanel numbers1 = new JPanel(new GridLayout(2, 3));
		numbers1.add(one);
		numbers1.add(two);
		numbers1.add(three);
		numbers1.add(four);
		numbers1.add(five);
		numbers1.add(six);
		
		JPanel numbers2 = new JPanel(new GridLayout(2, 3));
		numbers2.add(seven);
		numbers2.add(eight);
		numbers2.add(nine);
		numbers2.add(clear);
		numbers2.add(zero);
		numbers2.add(reset);
		
		output.setEnabled(false);
		davidsCalc.setHorizontalAlignment(SwingConstants.CENTER);
		davidsCalc.setFont(new Font("Arial", Font.BOLD, 18));
		input.setHorizontalAlignment(SwingConstants.CENTER);
		output.setHorizontalAlignment(SwingConstants.CENTER);
		
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
		
		container.add(display);
		container.add(inputAndOperators);
		container.add(numbers1);
		container.add(numbers2);
	}
	
	public JFrame getFrame() {
		return frame;
	}
	
}
