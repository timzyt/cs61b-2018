/** Tests the sort class. */

public class TestSort{
	/** Test the Sort.sort method. */
	public static void testSort() {
		String[] input = {"i", "have", "an", "egg"};
		String[] expected = {"an", "egg", "have", "i"}; 

		Sort.sort(input);

		org.junit.Assert.assertEquals(expected, input); 

		/**

		for (int i = 0; i < input.length; i+=1) {
			if (!input[i].equals(expected[i])) {
				System.out.println("Mismatch in position " + i + ", expected: " + expected[i] + ", but got: " + input[i]); 
				return;
			}
		}

		*/
			
	}

	public static void main(String[] args) {
		testSort();
	}
}