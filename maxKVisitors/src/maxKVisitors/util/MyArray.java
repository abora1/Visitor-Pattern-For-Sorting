package maxKVisitors.util;

import java.util.ArrayList;
import maxKVisitors.util.Logger;
import maxKVisitors.util.Logger.DebugLevel;

/**
 * @author akshay This class stores the Input files in an arraylist.
 */
public class MyArray implements IntegerI {
	public ArrayList<Integer> arr = new ArrayList<Integer>();
	int k = 0;

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	@Override
	public void insert(int value) {
		arr.add(value);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	// to display the outputs after sorting.
	public void display() {
		for (int i = 0; i < k; i++) {
			Logger.writeMessage(arr.get(i) + ",", DebugLevel.OUTPUT);
		}
		Logger.writeMessage("\n", DebugLevel.OUTPUT);
	}

	// to display the input file.
	public void displayInput() {
		for (int i = 0; i < arr.size(); i++) {
			Logger.writeMessage(arr.get(i) + ",", DebugLevel.INPUT);
		}
		Logger.writeMessage("\n", DebugLevel.INPUT);
	}

}
