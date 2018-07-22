package maxKVisitors.util;

/**
 * @author akshay Visitor Interface that all visitors implements.
 */
public interface Visitor {
	void visit(MyArray visitor);

	void visit(MyVector v1);
}
