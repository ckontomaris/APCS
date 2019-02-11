import java.util.*;
import java.io.*;

public class MergeSort {
	public static void main(String[] args) {

		try {
			// why is this pulling from the .. directory and not same as java file?

			// import unsorted numbers to an arraylist
			Scanner nums = new Scanner((new FileReader("list.txt")));
			ArrayList<Integer> list = new ArrayList<Integer>();
			while (nums.hasNext()) {
				list.add(nums.nextInt());
			}

			// test that numbers were imported correctly
			System.out.println("print dat array list");
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i) + " ");
			}
			
			ArrayList<Integer> sorted = new ArrayList<Integer>(mergeSorter(list));
		} catch (Exception rip) {
			System.out.println(rip);
			rip.printStackTrace();
		}
	}

	// we need a function that will take our sorted subarrays (of 1) and combine
	// them
	// our subarrays will be passed as indexes of the original
	public void merge(ArrayList<Integer> stuff, int l, int m, int r) {
		// int l refers to start of left subarray, int m is midpoint cutoff, r is end of
		// right

		// we can make our two temp ArrayLists to compare with
		ArrayList<Integer> left = new ArrayList<Integer>(stuff.subList(l, m + 1));
		// remember second parameter is exclusive
		ArrayList<Integer> right = new ArrayList<Integer>(stuff.subList(m + 1, r + 1));
		// these will be run when m+1 and r+1 only cover one number

		// now we compare and override into the original unsorted Arraylist
		int n = 1;
		for (int i = m + 1; i < (r + 1); i++) { // i is right
			for (int j = n; j < (m + 1); j++) { // j is left subarray

				if (stuff.get(i) <= stuff.get(j)) {
					stuff.add(j, stuff.get(i));
					stuff.remove(i + 1);
					n = j;
					break;
				}
			}
		}

	}

	public ArrayList<Integer> mergeSorter(ArrayList<Integer> stuff, int start, int end) {
		
		ArrayList<Integer> relevant = new ArrayList<Integer>(stuff.subList(start, end+1));
		
		//if the list is only one element long, its already sorted
		int sizer = relevant.size();
		if (sizer == 1) {
			return stuff;
		}
		
		int mid = end/2;
		ArrayList<Integer> A = mergeSorter(relevant, start, mid);
		ArrayList<Integer> B = mergeSorter(relevant, mid, end);
		
		//merge is based on a single arraylist and a start, middle and end value of the two subarrays
		ArrayList<Integer> sorted = new ArrayList<Integer>();
		
		return sorted;
	}

	
	
}