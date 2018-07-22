package maxKVisitors.util;

import java.util.Vector;
import maxKVisitors.util.Logger;
import maxKVisitors.util.Logger.DebugLevel;

/**
 * @author akshay this class stores the input file in a vector.
 */
public class MyVector implements IntegerI {
	Vector<Integer> v1 = new Vector<Integer>();
	int k = 0;

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	@Override
	public void insert(int value) {
		v1.addElement(value);
	}

	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

	// displaying the output vector after sorting
	public void display() {
		for (int i = 0; i < k; i++) {

			Logger.writeMessage(v1.get(i) + ",", DebugLevel.OUTPUT);
		}
		Logger.writeMessage("\n", DebugLevel.OUTPUT);
	}

	// displaing the input vector before sorting.
	public void displayInput() {
		for (int i = 0; i < v1.size(); i++) {

			Logger.writeMessage(v1.get(i) + ",", DebugLevel.INPUT);
		}
		Logger.writeMessage("\n", DebugLevel.INPUT);
	}

}
