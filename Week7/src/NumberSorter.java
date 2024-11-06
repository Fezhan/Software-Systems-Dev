import java.util.Stack;

public class NumberSorter {
	void sort(int [] numbers) {
		Stack<Integer> srcStack = new Stack<Integer>();
		
		Stack<Integer> destStack = new Stack<Integer>();
		
		for (int number: numbers) {
			srcStack.push(number);
		}
		
		while (srcStack.size() > 0) {
			
			int next = srcStack.pop();
			
			
			if (destStack.size() > 0) {
				while (!destStack.isEmpty() && destStack.peek() > next) {
					srcStack.push(destStack.pop());
				}
			}
				
			destStack.push(next);
		}
		System.out.println(destStack);
	}
	
	
}