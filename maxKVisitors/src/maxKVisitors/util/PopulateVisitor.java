package maxKVisitors.util;

/**
 * @author akshay this visitor populates the myArray and MyVector class from the
 *         input files and also sets the values for K.
 */
public class PopulateVisitor implements Visitor {
	String inputfile;
	int k = 0;

	public PopulateVisitor(String input, int k) {
		this.inputfile = input;
		this.k = k;
	}

	@Override
	public void visit(MyArray visitor) {
		visitor.setK(k);
		FileProcessor fp = new FileProcessor(inputfile);
		int x = 0;
		while ((x = fp.nextInt()) != 0) {
			visitor.insert(x);
		}
		if (k > visitor.arr.size()) {
			System.err.print("The Size of K is greater than the size of array");
			System.exit(0);
		}
	}

	@Override
	public void visit(MyVector v1) {
		v1.setK(k);
		FileProcessor fp = new FileProcessor(inputfile);
		int x = 0;
		while ((x = fp.nextInt()) != 0) {
			v1.insert(x);
		}
		if (k > v1.v1.size()) {
			System.err.print("The Size of K is greater than the size of array");
			System.exit(0);
		}

	}

}
