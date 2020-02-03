 import java.util.ArrayList;

public class Exercises {

	public boolean commonEnd(ArrayList<Integer> a, ArrayList<Integer> b) {
		if (a == null || a.isEmpty() || b == null || b.isEmpty()) {
			return false;
		}

		// write your code here
		if(b.size() < 0) {
			return false;
		}
		if(a.get(0) == b.get(0)) {
			return true;
		} else if(a.get(a.size() - 1) == b.get(b.size() - 1)) {
			return true;
		}
		return false;	// default return value to ensure compilation
	}

	public ArrayList<String> endsMeet(ArrayList<String> values, int n) {
    // write your code here
    if (values == null || values.size() < n || n <= 0) {
			return new ArrayList<String>();
		}

		ArrayList<String> endsMeet = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			endsMeet.add(i, values.get(i));
		}

		int index = n;
		for (int i = values.size() - n;  i < values.size(); i++) {
			endsMeet.add(index, values.get(i));
			index++;
		}


		return endsMeet;	// default return value to ensure compilation
	}

	public int difference(ArrayList<Integer> numbers) {
		// write your code here

		return -1;		// default return value to ensure compilation
	}

	public double biggest(ArrayList<Double> numbers) {
		// write your code here

		return -1;		// default return value to ensure compilation
	}

	public ArrayList<String> middle(ArrayList<String> values) {
		// write your code here

		return null;	// default return value to ensure compilation
	}

	public boolean increasing(ArrayList<Integer> numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean everywhere(ArrayList<Integer> numbers, int x) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean consecutive(ArrayList<Integer> numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean balance(ArrayList<Integer> numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public int clumps(ArrayList<String> values) {
		// write your code here

		return -1;		// default return value to ensure compilation
	}
}
