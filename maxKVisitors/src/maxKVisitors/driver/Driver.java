package maxKVisitors.driver;

import maxKVisitors.util.MaxHeapVisitors;
import maxKVisitors.util.ModifiedBubbleSortVisitor;
import maxKVisitors.util.MyArray;
import maxKVisitors.util.MyVector;
import maxKVisitors.util.PopulateVisitor;
import maxKVisitors.util.Visitor;

public class Driver {
	public static void main(String[] args) {
		String abc=args[0];
		MyArray m1=new MyArray();
		MyVector vec1=new MyVector();
		Visitor v1=new PopulateVisitor(abc);
		m1.accept(v1);
		vec1.accept(v1);
		m1.display();
		System.out.println("The vector is as follows");
		vec1.display();
		Visitor v2=new MaxHeapVisitors();
		m1.accept(v2);
		vec1.accept(v2);
		System.out.println("The BUBBLESORT FOR ARRAY is as follows");
		m1.display();
		System.out.println("The BUBBLESORT FOR VECTOR is as follows");
		vec1.display();
	}
}
