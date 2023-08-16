package presenter;

import java.util.ArrayList;

import model.Numbers;
import view.ActionListenerMatriz;
import view.ViewMatriz;

public class PresenterMatriz {
	
	private ActionListenerMatriz action;
	private ViewMatriz view;
	private Numbers numbers;
	
	public PresenterMatriz() {
		action = new ActionListenerMatriz();
		numbers = new Numbers();
	}
	
	public void sendArray(ArrayList array, ViewMatriz view) {
		numbers.setNumbers(array);
		this.view = view;
		newOrdenView();
	}
	
	public void newOrdenView() {
		view.newOrdenNumbers(numbers.getNumbers());
	}
}
