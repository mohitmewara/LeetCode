import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class MedianInStream {
	
	public static void main(String[] args) {		
		
		int aa[] = {5, 15, 1, 3, 2, 8, 7, 9, 10, 6, 11, 4,45,23,76,10,38,32,78934};
		Heap minHeap = new Heap(new MinHeap());
		Heap maxHeap = new Heap(new MaxHeap());
		
		for (int i : aa) {
			minHeap.insert(i);
		}
		
		for (int i : aa) {
			maxHeap.insert(i);
		}		

		while (minHeap.getCount() >0) {
			System.out.print(minHeap.extractTop() + " ");
		}
		System.out.println();
		while (maxHeap.getCount() >0) {
			System.out.print(maxHeap.extractTop() + " ");
		}		
		
		
	}
}

class Heap{
	int capacity = 100;
	int arr[] = new int[capacity];
	int heapCount =-1;
	Functionality fun;
	
	public Heap(Functionality fun){
		this.fun = fun;
	}
	
	
	public void swap(int index1, int index2){
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	public int firstChild(int index){
		return (2*index +1);
	}
	
	public int secondChild(int index){
		return 2*(index +1);
	}		
	
	public int parent(int index){
		return (index - 1)/2;
	}
	
	public void heapify(int index){
		int parent = parent(index);
		if(parent >=0 && fun.compare(arr[index], arr[parent])){
			swap(index, parent);
			heapify(parent);
		}
	}
	
	public void heapifyDown(int index){
		int child1 = firstChild(index);
		int child2 = secondChild(index);
		
		if(index <=heapCount){
			if(child1 <=heapCount && child2 <=heapCount){
				boolean flag = fun.compare(arr[child1], arr[child2]);
				if(flag && fun.compare(arr[child1], arr[index])){
					swap(index, child1);
					heapifyDown(child1);				
				}
				else if(!flag && fun.compare(arr[child2], arr[index])){
					swap(index, child2);
					heapifyDown(child2);
				}				
			}
			else if(child1 <=heapCount){
				if(fun.compare(arr[child1], arr[index])){
					swap(index, child1);
					heapifyDown(child1);					
				}
			}
			

		}
	}	
	
	public int getCount(){
		return heapCount+1;
	}
	
	public boolean insert(int element){
		boolean ret = false;
		if(heapCount < capacity){
			ret = true;
			arr[++heapCount] = element;
			heapify(heapCount);
		}
		return ret;
	}
	
	public int extractTop(){
		if(heapCount >= 0){
			int temp = arr[0];
			arr[0] = arr[heapCount];
			arr[heapCount--] = -6;
			heapifyDown(0);
			return temp;
		}
		return -1;
	}
	
	
}

class MinHeap implements Functionality{

	@Override
	public boolean compare(int a, int b) {
		return a < b;
	}	
	
}

class MaxHeap implements Functionality{

	@Override
	public boolean compare(int a, int b) {
		return a > b;
	}		
}

interface Functionality{
	
	public boolean compare(int a, int b);
}

