package Stack_and_Queue;
import java.util.*;

public class PriorityQueueExample {

	public static void main(String[] args) {
		
//		Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
//		
//		queue.offer(3.0);
//		queue.offer(2.5);
//		queue.offer(1.0);
//		queue.offer(2.5);
//		queue.offer(5.0);
		
		Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
		
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		queue.offer("E");
		
		
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}
	
}
