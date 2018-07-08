public class DrawTriangle {
	public static void main(String[] args) {
		int row = 0;
		int col = 0;
		while (row <= 5) {
			col = 0;
			while (col <= row) {
				System.out.print("*");
				col = col+1;
			}
		System.out.println();
		row = row + 1;
		}
	}
}