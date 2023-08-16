package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import presenter.PresenterMatriz;

public class ActionListenerMatriz implements ActionListener {
	
	private ViewMatriz view;
	private int number1, number2, number3, number4, number5, number6, number7, number8, number9;
	private PresenterMatriz presenter;
	private ArrayList <Integer> numbers;
	
	public ActionListenerMatriz (ViewMatriz view) {
		this.view = view;
		numbers = new ArrayList <Integer>();
	}
	
	public ActionListenerMatriz () {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("send")) {

			numbers.add(Integer.parseInt(view.getNumber1().getText()));
			numbers.add(Integer.parseInt(view.getNumber2().getText()));
			numbers.add(Integer.parseInt(view.getNumber3().getText()));
			numbers.add(Integer.parseInt(view.getNumber4().getText()));
			numbers.add(Integer.parseInt(view.getNumber5().getText()));
			numbers.add(Integer.parseInt(view.getNumber6().getText()));
			numbers.add(Integer.parseInt(view.getNumber7().getText()));
			numbers.add(Integer.parseInt(view.getNumber8().getText()));
			numbers.add(Integer.parseInt(view.getNumber9().getText()));
			
			presenter = new PresenterMatriz();
			presenter.sendArray(numbers, view);
			numbers.clear();
		}
		
	}

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public int getNumber3() {
		return number3;
	}

	public void setNumber3(int number3) {
		this.number3 = number3;
	}

	public int getNumber4() {
		return number4;
	}

	public void setNumber4(int number4) {
		this.number4 = number4;
	}

	public int getNumber5() {
		return number5;
	}

	public void setNumber5(int number5) {
		this.number5 = number5;
	}

	public int getNumber6() {
		return number6;
	}

	public void setNumber6(int number6) {
		this.number6 = number6;
	}

	public int getNumber7() {
		return number7;
	}

	public void setNumber7(int number7) {
		this.number7 = number7;
	}

	public int getNumber8() {
		return number8;
	}

	public void setNumber8(int number8) {
		this.number8 = number8;
	}

	public int getNumber9() {
		return number9;
	}

	public void setNumber9(int number9) {
		this.number9 = number9;
	}
	
	
	

}
