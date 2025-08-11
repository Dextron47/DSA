package Stack_and_Queue;
import java.util.*;

public class QueueExample {

	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("Karen");
		queue.offer("Chad");
		queue.offer("Steve");
		queue.offer("Harold");
		
//		System.out.println(queue.peek());
		
//		queue.poll();
//		queue.poll();
//		queue.poll();
//		queue.poll();
//		queue.element();
//		
//		System.out.println(queue.isEmpty());
//		System.out.println(queue.size());
		
		System.out.println(queue.contains("Harold"));

	}

}
