package maxKVisitors.util;

import java.util.ArrayList;
import java.util.Vector;

/**
 * @author akshay This visitor class implements the Heapsort Algorithm on The
 *         Myarray And MyVector Classes as a visitor which implements the
 *         visitor Interface.
 */
public class MaxHeapVisitors implements Visitor {
	// heapsort for the Array
	@Override
	public void visit(MyArray visitor) {
		int count = visitor.arr.size();
		heapSort(visitor.arr, count);
	}

	// HEapsort for the Vector
	@Override
	public void visit(MyVector vec1) {
		int count = vec1.v1.size();
		heapSortVector(vec1.v1, count);
	}

	// This method Starts Heapifying the input and then also recursively calls
	// Heapify for the Array.
	static void heapSort(ArrayList<Integer> arr, int n) {
		int z = n / 2 - 1;
		do {
			heapify(arr, n, z);
			z--;
		} while (z >= 0);
		int i = n - 1;
		while (i >= 0) {
			int temp = arr.get(0);
			arr.set(0, arr.get(i));
			arr.set(i, temp);
			heapify(arr, i, 0);
			i--;
		}
	}

	// this method performs heapify to sort the values for the Array.
	static void heapify(ArrayList<Integer> arr, int n, int i) {
		int s = i;
		int l = 2 * i + 1;
		int r = l + 1;

		if (r < n && arr.get(s) > arr.get(r)) {
			s = r;
		}
		if (l < n && arr.get(s) > arr.get(l)) {
			s = l;
		}
		if (s != i) {
			int temp = arr.get(i);
			arr.set(i, arr.get(s));
			arr.set(s, temp);
			heapify(arr, n, s);
		}
	}

	// This method Starts Heapifying the input and then also recursively calls
	// Heapify.for the vector
	static void heapSortVector(Vector<Integer> arr, int n) {
		int z = n / 2 - 1;
		do {
			heapify1(arr, n, z);
			z--;
		} while (z >= 0);
		int i = n - 1;
		while (i >= 0) {
			Integer temp = arr.get(0);
			arr.set(0, arr.get(i));
			arr.set(i, temp);
			heapify1(arr, i, 0);
			i--;
		}
	}

	// this method performs heapify to sort the values for the vector.
	static void heapify1(Vector<Integer> arr, int n, int i) {
		int s = i;
		int l = 2 * i + 1;
		int r = l + 1;

		if (r < n && arr.get(s) > arr.get(r)) {
			s = r;
		}
		if (l < n && arr.get(s) > arr.get(l)) {
			s = l;
		}
		if (s != i) {
			int temp = arr.get(i);
			arr.set(i, arr.get(s));
			arr.set(s, temp);
			heapify1(arr, n, s);
		}
	}
}
