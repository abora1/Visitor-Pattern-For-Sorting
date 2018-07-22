package maxKVisitors.driver;

import maxKVisitors.util.FileProcessor;

public class Driver {
	public static void main(String[] args) {
		String abc=args[0];
		FileProcessor fp=new FileProcessor(abc);
		int x=fp.nextInt();
		System.out.print(x);
	}
}
