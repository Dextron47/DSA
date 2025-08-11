package LinkedList;
import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		
//		ArrayList<Integer> List = new ArrayList<>();
//		
//		List.add(3);
//		List.add(1);
//		List.add(2);
//		
//		System.out.println(List);
		
//		ArrayList<String> fruits = new ArrayList<>();
//		
//		fruits.add("Apple");
//		fruits.add("Coconut");
//		fruits.add("Banana");
//		
		
//		fruits.set(1, "PineApple");
		
//		System.out.println(fruits.get(1));
//		System.out.println(fruits.size());
		
//		Collections.sort(fruits);
//		
//		System.out.println(fruits);
		
//		for(String fruit : fruits) {
//			System.out.println(fruit);
//		}
//		
	
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> foods  = new ArrayList<>();
		
		System.out.println("Enter the # of food you would like : ");
		int numOfFood = sc.nextInt();
		sc.nextLine();
		
		
		for(int i = 1; i <= numOfFood; i++) {
			System.out.println("Enter food number " + i + " : ");
			String food = sc.nextLine();
			foods.add(food);			
		}
		
		System.out.println(foods);
		
		sc.close();
		
	}

}
