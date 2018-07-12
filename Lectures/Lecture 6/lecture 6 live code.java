/** integer array list version
*/

public class AList {
	private int[] items;
	private int size;

	public AList() {
		items = new int[8];
		size = 0;

	}


	private void resize(int capacity) {
		int[] a = new int[capacity];
		System.arraycopy(items, 0, a, 0, size);

		items = a;

	}

	public int get(int i) {
		return items[i];
	}
}

/** object array list version
*/

public class AList<Glorp> {
	private Glorp[] items;
	private int size;

	public AList() {
		items = (Glorp []) new Object[8];
		size = 0;
	}

	private void resize(int cap) {
		Glorp[] a = (Glorp []) new Object[cap]; /* this instantiation would cause a complier warning, which you should ignore, because that's merely an issue built in Java */
		System.arraycopy(items, 0, a, 0, size);

		items = a;
	}

	public Glorp get(int i) {
		return items[i];
	}
}