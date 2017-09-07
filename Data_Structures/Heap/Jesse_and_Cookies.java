import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class MinHeap{
	public int size;
	int [] ar;
	MinHeap(int n){
		this.size = 0;
		this.ar = new int[n];
	}
	public int getLeftChildIndex(int index){
		return 2*index+1;
	}
	public int getRightChildIndex(int index){
		return 2*index + 2;
	}
	public int getParentIndex(int index){
		return (index - 1)/2;
	}
	public boolean hasLeftChild(int index){
		return getLeftChildIndex(index) < size;
	}
	public boolean hasRightChild(int index){
		return getRightChildIndex(index) < size;
	}
	public boolean hasParent(int index){
		return getParentIndex(index) >= 0;
	}
	public int leftChild(int index){
		return ar[getLeftChildIndex(index)];
	}
	public int rightChild(int index){
		return ar[getRightChildIndex(index)];
	}
	public int parent(int index){
		return ar[getParentIndex(index)];
	}
	public void swap(int a,int b){
		int temp = ar[a];
		ar[a] = ar[b];
		ar[b] = temp;
	}
	public int peek(){
		return ar[0];
	}
	public int poll(){
		int item = ar[0];
		ar[0] = ar[size-1];
		ar[size-1]=0;
		size--;
		heapifyDown();
		return item;
	}
	public void add(int item){
		ar[size] = item;
		size++;
		heapifyUp();
	}
	public void heapifyDown(){
		int index = 0;
		while(hasLeftChild(index)){
			int smallerChild = getLeftChildIndex(index);
			if(hasRightChild(index) && rightChild(index) < leftChild(index))
				smallerChild = getRightChildIndex(index);
			if(ar[index] < ar[smallerChild])
				break;
			else
				swap(index,smallerChild);
			index = smallerChild;
		}
	}
	public void heapifyUp(){
		int index = size-1;
		while(hasParent(index) && parent(index) > ar[index]){
			swap(getParentIndex(index),index);
			index = getParentIndex(index);
		}
	}
	public void display(){
		for(int ob : ar)
			System.out.print(ob+" ");
		System.out.println();
	}
}

class Solution{
	public static void main(String ... ags)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(in.readLine());
		int n = Integer.parseInt(tk.nextToken());
		int k = Integer.parseInt(tk.nextToken());
		tk = new StringTokenizer(in.readLine());
		MinHeap hp = new MinHeap(n);
		while(tk.hasMoreTokens())
			hp.add(Integer.parseInt(tk.nextToken()));
		//hp.display();
		int ans = 0;
		try{
			while(hp.peek() < k){
				int a = hp.poll();
				int b = hp.poll();
				int val = a + 2*b;
				hp.add(val);
				ans++;
			}
		}catch(ArrayIndexOutOfBoundsException e){
			ans = -1;
		}
		//hp.display();
		System.out.println(ans);
	}
}