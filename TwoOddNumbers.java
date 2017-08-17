
public class TwoOddNumbers {

	public static void main(String[] args) {
		int[] arr = {4, 2, 4, 5, 2, 3, 3, 1};
		int xor=0;
		for(int i=0;i<arr.length;i++){			
			xor ^= arr[i];
		}
		int set_bit_no = xor & ~(xor -1);
		
		int one=0;
		int two=0;
		for(int i=0;i<arr.length;i++){	
			if((set_bit_no & arr[i]) > 0)
				one ^= arr[i];
			else
				two ^= arr[i]; 
		}

		System.out.println(one);
		System.out.println(two);
		System.out.println(Math.log(256)/Math.log(2));
		
	}
}
