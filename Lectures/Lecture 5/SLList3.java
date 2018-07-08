


public class SLList3<LochNess> {

	private class StuffNode {
		public LochNess item;
		public StuffNode next;

		public StuffNode(LochNess i, StuffNode n) {
			item = i;
			next = n;
		}
	}

	/* The first item (if it exists) is at sentinel.next*/

	private StuffNode first;
	private int size;


	/** Creates an empty SLList. */
	public SLList3(LochNess x) {
		/*sentinel = new StuffNode(1, null);*/
		first = new StuffNode(x, null);
		size = 1;
	}
/*
	public SLList3(LochNess x) {
		sentinel = new StuffNode(1, null);
		sentinel.next = new StuffNode(x, null);
		size = 1;
	}
*/
	public void addFirst(LochNess x) {
		first = new StuffNode(x, first);
		size += 1;
	}

	/**Adds an item to the end of the list*/
	public void addLast(LochNess x) {
		size += 1;
		StuffNode p = first;
		while (p.next != null) {
			p = p.next;
		}

		p.next = new StuffNode(x, null);


	}

	/**Get the first item of the list*/ 
	public LochNess getFirst() {
		return first.item;
	}

	/**Get the last item of the list iteratively*/
/*	public LochNess getLast() {
		StuffNode p = sentinel;
		while (p.next != null) {
			p = p.next;
		}	
		return p.item;
	}
*/


	/**helper method get the size of the list*/
/*	private static LochNess size(StuffNode p) {
		if (p.next == null) {
			return 1;
		}
		return 1 + size(p.next);
	}
*/

	public int size() {
		return size;
	}

	public static void main(String[] args) {
		SLList3 L = new SLList3(15);
		L.addFirst(10);
		L.addFirst(5);
		L.addLast(20);
		System.out.println(L.size());
		System.out.println(L.getFirst());
/*		System.out.println(L.getLast()); */
	}
}



