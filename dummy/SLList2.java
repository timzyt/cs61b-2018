


public class SLList2 {

	public class IntNode {
		public int item;
		public IntNode next;

		public IntNode(int i, IntNode n) {
			item = i;
			next = n;
		}
	}

	/* The first item (if it exists) is at sentinel.next*/

	private IntNode sentinel;
	private int size;


	/** Creates an empty SLList. */
	public SLList2() {
		sentinel = new IntNode(1, null);
		size = 0;
	}

	public SLList2(int x) {
		sentinel = new IntNode(1, null);
		sentinel.next = new IntNode(x, null);
		size = 1;
	}

	public void addFirst(int x) {
		sentinel.next = new IntNode(x, sentinel.next);
		size += 1;
	}

	/**Adds an item to the end of the list*/
	public void addLast(int x) {
		size += 1;
		IntNode p = sentinel;
		while (p.next != null) {
			p = p.next;
		}

		p.next = new IntNode(x, null);


	}

	/**Get the first item of the list*/ 
	public int getFirst() {
		return sentinel.next.item;
	}

	/**Get the last item of the list iteratively*/
	public int getLast() {
		IntNode p = sentinel;
		while (p.next != null) {
			p = p.next;
		}	
		return p.item;
	}



	/**helper method get the size of the list*/
	private static int size(IntNode p) {
		if (p.next == null) {
			return 1;
		}
		return 1 + size(p.next);
	}

	public int size() {
		return size();
	}

	public static void main(String[] args) {
		SLList L = new SLList(15);
		L.addFirst(10);
		L.addFirst(5);
		L.addLast(20);
		System.out.println(L.size());
		System.out.println(L.getFirst());
		System.out.println(L.getLast());
	}
}



