/*
y = new int[3];
x = new int[] {1, 2, 3, 4, 5};
int[] w = {9, 10, 11, 12, 13};
*/

public class ArrayBasics {
	/** ArrayBasics */
	public static void main(String[] args) {
		int[] z = null;
		int[] x, y;

		x = new int[]{1,2,3,4,5};
		y = x;
		x = new int[]{-1, 2, 5, 4, 99};
		y = new int[3];
		z = new int[0];
		int xL = x.length;

		String[] s = new String[6];
		s[4] = "ketchup";
		s[x[3] - x[1]] = "muffins";

		int[] b = {9, 10, 11};
		System.arraycopy(b, 0, x, 3, 2);

	}
}

/* arraycopy 
System.arraycopy(b, 0, x, 3, 2);

b - source array
0 - start position in source
x - target array
3 - start position in target
2 - number to copy
*/



/* different ways to instantiate 2D arraies
*/

public class ArrayBasics2 {
	public static void main(String[] args) {
		int[][] pascalsTriangle;
		pascalsTriangle = new int[4][];
		int[] rowZero = pascalsTriangle[0];

		pascalsTriangle[0] = new int[]{1};
		pascalsTriangle[1] = new int[]{1, 1};
		pascalsTriangle[2] = new int[]{1, 2, 1};
		pascalsTriangle[3] = new int[]{1, 3, 3, 1};
		int[] rowTwo = pascalsTiangle[2];
		rowTwo[1] = -5;

		int[][] matrix;
		matrix = new int[4][];
		matrix = new int[4][4];

		int[][] pascalAgain = new int[][]{{1}, {1, 2}, {1, 2, 1}, {1, 3, 3, 1}};
		 
	}
}
