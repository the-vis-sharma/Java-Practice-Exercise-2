

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of Dequeue: ");
		int size = sc.nextInt();
		
		Dequeue queue = DequeueStore.getInstance(size);
		
		System.out.println("Pushing items to the Dequeue...");
		Animal lion = new Animal();
		queue.push(lion);
		
		Animal tiger = new Animal();
		queue.push(tiger);
		
		Book theNoteBook = new Book();
		queue.push(theNoteBook);
		
		Grocery pateto = new Grocery();
		queue.push(pateto);
		
		System.out.println("\nItems in the queue: ");
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());

		sc.close();
		
	}
}
