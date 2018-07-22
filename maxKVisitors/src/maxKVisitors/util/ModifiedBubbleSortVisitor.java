package maxKVisitors.util;

public class ModifiedBubbleSortVisitor implements Visitor {

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
