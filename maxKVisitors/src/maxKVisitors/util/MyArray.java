package maxKVisitors.util;

import java.awt.List;
import java.util.ArrayList;

public class MyArray implements IntegerI{
	public ArrayList<Integer> arr = new ArrayList<Integer>();

	@Override
	public  void insert(int value) {
		arr.add(value);
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public void display(){
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i));
		}
	}
	

}
