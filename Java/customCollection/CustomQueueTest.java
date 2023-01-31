package customCollection;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class CustomQueueTest {
	private CustomQueue<Integer> list;

	@Before
	public void setUp() throws Exception {
		 list = new CustomQueue<Integer>();
	}
	
	@Test
	public void testAddFirst() {
		Integer[] arr = new Integer[] {1,2,3,4,5};
		for(int i=0; i<arr.length; i++) {
			list.addFirst(arr[i]);
		}
		Node<Integer> temp = list.getHead();
		assertEquals(arr[4], list.getHead().getData());
		assertNotEquals(arr.length-1, list.length());
		int i = arr.length -1;
		while(temp != null) {
			assertEquals(arr[i], temp.getData());
			i--;
			temp = temp.getNext();
		}
	}

}
