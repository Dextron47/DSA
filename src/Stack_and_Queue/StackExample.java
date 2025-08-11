package Stack_and_Queue;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("Minecraft");
		stack.push("Skyrin");
		stack.push("Doon");
		stack.push("Borderlands");
		stack.push("FFVII");
		
//		String myFavGame = stack.pop();
		
//		System.out.println(stack.empty());
		
//		System.out.println(stack.peek());
		System.out.println(stack);
//		System.out.println(myFavGame);
		
		System.out.println(stack.search("FFVII"));
//		
		// Out of memory exception
//		for(int i = 0; i < 100000000000; i++) {
//			stack.push("Fallout76");
//		}
//		
		
	}
	
}

