package maxKVisitors.util;

import java.util.Vector;

public class MyVector implements IntegerI {
	Vector<Integer> v1=new <Integer>Vector();
	int k=0;
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
public void display(){
	for(int i=0; i< k; i++){
	
	    System.out.print(v1.get(i)+",");
	}
	 System.out.println("\n");
}
public void displayInput(){
	for(int i=0; i< v1.size(); i++){
	
	    System.out.print(v1.get(i)+",");
	}
	 System.out.println("\n");
}

}
