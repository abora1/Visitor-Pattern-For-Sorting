package maxKVisitors.util;

/**
 * @author akshay This visitor class implements the Bubblesort Algorithm on The
 *         Myarray And MyVector Classes as a visitor which implements the
 *         visitor Interface.
 */
public class ModifiedBubbleSortVisitor implements Visitor {
	// bubblesort that searches the whole array element by element for the
	// array.
	@Override
	public void visit(MyArray visitor) {
		int size = visitor.arr.size();
		for (int x = size; x > 1; x--) {
			for (int i = 0; i < x - 1; i++) {
				if (visitor.arr.get(i) < visitor.arr.get(i + 1)) {
					Integer temp2 = visitor.arr.get(i);
					visitor.arr.set(i, visitor.arr.get(i + 1));
					visitor.arr.set(i + 1, temp2);
				}
			}
		}
	}

	// bubblesort that searches the whole array element by element for the
	// vector.
	@Override
	public void visit(MyVector vec1) {
		int size = vec1.v1.size();
		for (int x = size; x > 1; x--) {
			for (int i = 0; i < x - 1; i++) {
				if (vec1.v1.get(i) < vec1.v1.get(i + 1)) {
					Integer temp1 = vec1.v1.get(i + 1);
					Integer temp2 = vec1.v1.get(i);
					vec1.v1.set(i, temp1);
					vec1.v1.set(i + 1, temp2);
				}
			}
		}

	}

}
