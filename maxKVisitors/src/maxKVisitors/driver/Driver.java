package maxKVisitors.driver;

import maxKVisitors.util.MaxHeapVisitors;
import maxKVisitors.util.ModifiedBubbleSortVisitor;
import maxKVisitors.util.MyArray;
import maxKVisitors.util.MyVector;
import maxKVisitors.util.PopulateVisitor;
import maxKVisitors.util.Visitor;
import maxKVisitors.util.Logger;
import maxKVisitors.util.Logger.DebugLevel;

/**
 * @author akshay Driver class Takes and pases the input to the Populate array
 *         visitor. It creates the Instance for the Myarray and MyVector classes
 *         to apply bubblesort and heapsort. It also creates instances for the
 *         visitors to populate the array,implement bubblesort and Heapsort.
 */
public class Driver {
	public static void main(String[] args) {
		try{
		if (args.length != 3) {
			System.out
					.println("Please Enter Input file,K value and Debug value along with the debug value");
			System.exit(0);
		}
		String abc = args[0];
		int k = Integer.parseInt(args[1]);
		int debug = Integer.parseInt(args[2]);
		if(debug>4 || debug<1)
		{
			System.out.println("The Debug Value is out of scope it should be Between 1 And 4");
			System.out.println("1.FILE PROCESSOR\n2.CONSTRUCTOR \n3.INPUT FILE \n4.OUTPUTS");
			System.exit(0);
		}
		Logger.setDebugValue(debug);
		MyArray m1 = new MyArray();
		MyVector vec1 = new MyVector();
		Visitor v1 = new PopulateVisitor(abc, k);
		m1.accept(v1);
		vec1.accept(v1);
		Logger.writeMessage("The INPUT ARRAY is as follows:\n",
				DebugLevel.INPUT);
		m1.displayInput();
		Logger.writeMessage("The INPUT VECTOR is as follows:\n",
				DebugLevel.INPUT);
		vec1.displayInput();
		System.out.println("the value for  K is :" + k + "\n");
		Visitor v2 = new ModifiedBubbleSortVisitor();
		m1.accept(v2);
		vec1.accept(v2);
		Logger.writeMessage("The BUBBLESORT FOR ARRAY is as follows:\n",
				DebugLevel.OUTPUT);
		m1.display();
		Logger.writeMessage("The BUBBLESORT FOR VECTOR is as follows:\n",
				DebugLevel.OUTPUT);
		vec1.display();
		MyArray m2 = new MyArray();
		MyVector vec2 = new MyVector();
		Visitor v3 = new PopulateVisitor(abc, k);
		m2.accept(v3);
		vec2.accept(v3);
		Visitor v4 = new MaxHeapVisitors();
		m2.accept(v4);
		vec2.accept(v4);
		Logger.writeMessage("The HEAPSORT FOR ARRAY is as follows:\n",
				DebugLevel.OUTPUT);
		m2.display();
		Logger.writeMessage("The HEAPSORT FOR VECTOR is as follows:\n",
				DebugLevel.OUTPUT);
		vec2.display();
	}
		catch(NumberFormatException  e){
			System.err.println("UNABLE TO PARSE THE COMMAND LINE INPUTS");
			e.printStackTrace();
			System.exit(0);
		}
		catch(Exception e){
			e.printStackTrace();
			System.exit(0);
		}
		}
}
