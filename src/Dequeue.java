

public class Dequeue implements DequeueFunction {

	
	
	private DequeChild[] queue;
	private static int front = -1;
	private static int rear = -1;

	public Dequeue(int size) {
		front = -1;
		rear = -1;
		queue = new DequeChild[size];
	}
	
	@Override
	public boolean push(DequeChild item) throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		if(rear == -1 && front == -1) {
			++rear;
			++front;
		}
		else {
			++rear;
		}
		// System.out.println("after Pushing with front : " + front + ", rear: " + rear);
		try {
			queue[rear] = item;
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\nQueue has reached its max limit. Cannot insert more elements.");
			return false;
		}
		return true;
	}

	@Override
	public DequeChild pop() {
		// TODO Auto-generated method stub
		DequeChild item;
		
		if(front > queue.length) {
			front = -1;
			rear = -1;
			System.out.println("No item in the queue.");
			item = null;
		}
		
		if(front > rear) {
			System.out.println("No item in the queue.");
			item = null;
		}
		
		try {
			item = queue[front];
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\nQueue is already empty. Nothing to pop.");
			return null;
		}
		++front;
		
		// System.out.println("before Pop with front : " + front + ", rear: " + rear);
		
		return item;
	}

}
