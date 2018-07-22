package maxKVisitors.util;

public class MyArray implements IntegerI{

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

}
