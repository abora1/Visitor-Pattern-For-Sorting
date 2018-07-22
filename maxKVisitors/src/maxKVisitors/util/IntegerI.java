package maxKVisitors.util;

/**
 * @author akshay Interface for the Vector and Array Classes.
 */
public interface IntegerI {
	public void accept(Visitor visitor);

	public void insert(int value);
}
