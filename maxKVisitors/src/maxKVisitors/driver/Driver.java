package maxKVisitors.driver;

import maxKVisitors.util.MaxHeapVisitors;
import maxKVisitors.util.ModifiedBubbleSortVisitor;
import maxKVisitors.util.MyArray;
import maxKVisitors.util.MyVector;
import maxKVisitors.util.PopulateVisitor;
import maxKVisitors.util.Visitor;

public class Driver {
	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("Please Enter Input file,K value and Debug value along with the debug value");
			System.exit(0);
		}
		String abc=args[0];
		int k=Integer.parseInt(args[1]);
		int debug=Integer.parseInt(args[2]);
		MyArray m1=new MyArray();
		MyVector vec1=new MyVector();
		Visitor v1=new PopulateVisitor(abc,k);
		m1.accept(v1);
		vec1.accept(v1);
		
		System.out.println("The INPUT ARRAY is as follows:");
		m1.displayInput();
		System.out.println("The INPUT VECTOR is as follows:");
		vec1.displayInput();
		System.out.println("the value for  K is :"+k+"\n");
		Visitor v2=new ModifiedBubbleSortVisitor();
		m1.accept(v2);
		vec1.accept(v2);
		System.out.println("The BUBBLESORT FOR ARRAY is as follows:");
		m1.display();
		System.out.println("The BUBBLESORT FOR VECTOR is as follows:");
		vec1.display();
		MyArray m2=new MyArray();
		MyVector vec2=new MyVector();
		Visitor v3=new PopulateVisitor(abc,k);
		m2.accept(v3);
		vec2.accept(v3);
		Visitor v4=new MaxHeapVisitors();
		m2.accept(v4);
		vec2.accept(v4);
		System.out.println("The HEAPSORT FOR ARRAY is as follows:");
		m2.display();
		System.out.println("The HEAPSORT FOR VECTOR is as follows:");
		vec2.display();
	}
}
