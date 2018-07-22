package maxKVisitors.util;

import java.awt.List;
import java.util.ArrayList;

public class MyArray implements IntegerI{
	public ArrayList<Integer> arr = new ArrayList<Integer>();
	int k=0;
	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	@Override
	public  void insert(int value) {
		arr.add(value);
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public void display(){
		for(int i=0;i<k;i++)
		{
			System.out.print(arr.get(i)+",");
		}
		 System.out.println("\n");
	}
	public void displayInput(){
		for(int i=0;i<arr.size();i++)
		{
			System.out.print(arr.get(i)+",");
		}
		 System.out.println("\n");
	}

}
