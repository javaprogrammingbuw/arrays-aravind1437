
public class SortAndSearch {
	
	//todo: Write a method bubbleSrt which gets an integer array as input and which sorts this array according to the bubblesort algorithm
	//If you don't know how bubblesort works you can read it here: http://www.pkirs.utep.edu/CIS3355/Tutorials/chapter9/tutorial9A/bubblesort.htm
	//Now write another method binSrch. This method again receives an integer array as input together with another integer n.
	//First, it sorts this array by using the bubblSrt method. Then, it searches for n.
	//You can look up the binary search algorithm here: https://www.khanacademy.org/computing/computer-science/algorithms/binary-search/a/binary-search

		//intermediate
			public static int[] bubbleSort(int x[]) {
				for (int i = 0; i < x.length; i++) {
					for (int j = 1; j < (x.length - 1); j++) {
						if (x[j - 1] > x[j]) {
							int a = x[j];
							x[j] = x[j - 1];
							x[j - 1] = a;
						}
					}
				}	
				return x;
			}

			public static void main(String[] args) {
				int[] x = {8, 2, 6, 4, 10};
				bubbleSort(x);
				for (int i = 0; i < x.length; i++) {
				System.out.print(x[i] + " ");
				}
			}	
	
}
