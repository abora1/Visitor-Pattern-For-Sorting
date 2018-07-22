package maxKVisitors.util;

public class MyArray implements IntegerI{
int[] myA=new int[1000];
int counter=0;
	@Override
	public  void insert(int value) {
		myA[counter]=value;
		counter++;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public void display(){
		int count=0;
		while(count<counter)
		{
			System.out.println(myA[count]);
			count++;
		}
	}
	

}
