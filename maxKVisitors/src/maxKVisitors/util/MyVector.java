package maxKVisitors.util;

import java.util.Vector;

public class MyVector implements IntegerI {
	Vector<Integer> v1=new <Integer>Vector();
	@Override
	public void insert(int value) {
	v1.addElement(value);
	}
	
public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
public void display(){
	for(int i=0; i< v1.size(); i++){
	
	    System.out.println(v1.get(i));
	}
	
}

}
