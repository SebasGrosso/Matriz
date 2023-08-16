package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ViewMatriz extends JFrame{
	
	private JTextField number1, number2, number3, number4, number5, number6, number7, number8, number9;
	
	public ViewMatriz () {
		initComponents();
	}
	
	public void initComponents() {
		JPanel contentPanel = new JPanel();
		
		JButton button = new JButton("Matriz transpuesta");
		
		number1 = new JTextField(2);
		number2 = new JTextField();
		number3 = new JTextField();
		number4 = new JTextField();
		number5 = new JTextField();
		number6 = new JTextField();
		number7 = new JTextField();
		number8 = new JTextField();
		number9 = new JTextField();
		
		
		JPanel inputPanel = new JPanel(new GridLayout(3, 3, 10, 10));
		inputPanel.add(number1);
		inputPanel.add(number2);
		inputPanel.add(number3);
		inputPanel.add(number4);
		inputPanel.add(number5);
		inputPanel.add(number6);
		inputPanel.add(number7);
		inputPanel.add(number8);
		inputPanel.add(number9);

		contentPanel.add(inputPanel, BorderLayout.CENTER);
		
		add(contentPanel, BorderLayout.CENTER);
		add(button, BorderLayout.SOUTH);
		
		ActionListenerMatriz ALM = new ActionListenerMatriz(this);
		button.setActionCommand("send");
		button.addActionListener(ALM);
		
		setLocationRelativeTo(null);
        pack();
        setVisible(true);
	}
	
	public void newOrdenNumbers(ArrayList numbers) {
		number1.setText(numbers.get(0)+"");
		number2.setText(numbers.get(1)+"");
		number3.setText(numbers.get(2)+"");
		number4.setText(numbers.get(3)+"");
		number5.setText(numbers.get(4)+"");
		number6.setText(numbers.get(5)+"");
		number7.setText(numbers.get(6)+"");
		number8.setText(numbers.get(7)+"");
		number9.setText(numbers.get(8)+"");
	}
	
	public JTextField getNumber1() {
		return number1;
	}

	public void setNumber1(JTextField number1) {
		this.number1 = number1;
	}

	public JTextField getNumber2() {
		return number2;
	}

	public void setNumber2(JTextField number2) {
		this.number2 = number2;
	}

	public JTextField getNumber3() {
		return number3;
	}

	public void setNumber3(JTextField number3) {
		this.number3 = number3;
	}

	public JTextField getNumber4() {
		return number4;
	}

	public void setNumber4(JTextField number4) {
		this.number4 = number4;
	}

	public JTextField getNumber5() {
		return number5;
	}

	public void setNumber5(JTextField number5) {
		this.number5 = number5;
	}

	public JTextField getNumber6() {
		return number6;
	}

	public void setNumber6(JTextField number6) {
		this.number6 = number6;
	}

	public JTextField getNumber7() {
		return number7;
	}

	public void setNumber7(JTextField number7) {
		this.number7 = number7;
	}

	public JTextField getNumber8() {
		return number8;
	}

	public void setNumber8(JTextField number8) {
		this.number8 = number8;
	}

	public JTextField getNumber9() {
		return number9;
	}

	public void setNumber9(JTextField number9) {
		this.number9 = number9;
	}

	public static void main(String[] args) {
		new ViewMatriz();
	}

}
