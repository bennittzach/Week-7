public class Driver {

	public static void main(String[] args) {
		
		ArrayStack stackArray = new ArrayStack();
		
		stackArray.push(1);
		stackArray.push(7);
		stackArray.push(3);
		stackArray.push(4);
		stackArray.push(9);
		stackArray.push(2);

		LinkedStack stackLinked = new LinkedStack();
		
		stackLinked.push(1);
		stackLinked.push(7);
		stackLinked.push(3);
		stackLinked.push(4);
		stackLinked.push(9);
		stackLinked.push(2);
		
		while (stackArray.size() > 0) {
			System.out.println(stackArray.pop());
		}
		
		while (stackLinked.size() > 0) {
			System.out.println(stackLinked.pop());
		}
		
		//push back into stack after popping off
		stackLinked.push(1);
		stackLinked.push(7);
		stackLinked.push(3);
		stackLinked.push(4);
		stackLinked.push(9);
		stackLinked.push(2);
		
		stackLinked.removeBottomHalf();
	}

}
