
public class NextNumber {	
	public static void main(String[] args) {
		int[] arr = {3,7,2,5,6,8};
		Stack stack = new Stack();
		
		stack.push(arr[0]);
		for(int i=1;i<arr.length;i++){
			int element = stack.pop();
			int next = arr[i];
			
			while(element < next){
				System.out.println("Pair is " + element + "," + next);
				if(stack.isEmpty())
					break;
				element = stack.pop();
			}
			
			if(element > next)
				stack.push(element);
			stack.push(next);
		}
		
		while(!stack.isEmpty()){
			System.out.println("Pair is " + stack.pop() + ",-1");
		}
		
	}
	
}

class Stack{
	int top=-1;
	int[] arr = new int[100];
	
	public boolean isEmpty(){
		return (top == -1);
	}
	
	public void push(int element){
		if(top == arr.length){
			System.out.println("Overflow.");
			return;
		}			
		arr[++top] = element;			
	}
	
	public int pop(){
		if(top == -1){
			System.out.println("Underflow.");
			return -1;
		}				
		return arr[top--];
	}
}
