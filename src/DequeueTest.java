import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DequeueTest {

	Dequeue queue;

	@BeforeEach
	void init() {
		queue = new Dequeue(0);
	}

	@Test void testQueueOverflow() { 
		assertFalse(queue.push(new Animal()), "Overflow: Can't insert item in the array."); 
	}
  
	@Test void testQueueUnderflow() { 
		assertEquals(null, queue.pop(), "Underflow: can't pop item."); 
	}
  
	@Test void testPushPositiveCase() { 
		queue = new Dequeue(2);
		assertTrue(queue.push(new Animal()), "Item was not pushed."); 
	}
	
	@Test
	void testPopPositiveCase() {
		queue = new Dequeue(2);
		Animal cat = new Animal();
		queue.push(cat);
		assertEquals(cat, queue.pop());
	}

}
