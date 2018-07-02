


public class SLList {

	public class IntNode {
		public int item;
		public IntNode next;

		public IntNode(int i, IntNode n) {
			item = i;
			next = n;
		}
	}

	public IntNode first;	

	public SLList(int x) {
		first = new IntNode(x, first);
	}

	public void addFirst(int x) {
		first = new IntNode(x, first);
	}

	/**Adds an item to the end of the list*/
	public void addLast(int x) {
		IntNode p = first;
		while (p.next != null) {
			p = p.next;
		}

		p.next = new IntNode(x, null);

	}

	/**Get the first item of the list*/ 
	public int getFirst() {
		return first.item;
	}

	/**Get the last item of the list iteratively*/
	public int getLast() {
		IntNode p = first;
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
		return size(first);
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



