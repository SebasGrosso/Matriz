package model;

import java.util.ArrayList;

public class Numbers {
	
	private ArrayList <Integer> numbers;
	
	public Numbers () {
		numbers = new ArrayList <Integer>();
	}
	
	public void logic() {
		int aux = 0;
		aux = numbers.get(1);
		numbers.set(1, numbers.get(3));
		numbers.set(3, aux);
		aux = numbers.get(2);
		numbers.set(2, numbers.get(6));
		numbers.set(6, aux);
		aux = numbers.get(5);
		numbers.set(5, numbers.get(7));
		numbers.set(7, aux);
	}
	
	public ArrayList<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(ArrayList<Integer> numbers) {
		this.numbers = numbers;
		logic();
	}

}
