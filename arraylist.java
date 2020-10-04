public class arraylist
{
	double get = 0.25;
	double get2 = 0.75;
	int holder = 4;
	static int x;
	int remove;
	int top = 0;
	static double length;
	static int arr[];
	public arraylist()
	{
		arr = new int[holder];
	}
	public void add(int ele)
	{
		arr[top] = ele;
		top++;
	}
	public void pop()
	{
		top--;
		remove = arr[top];
		arr[top] = 0;
		int count = 0;
		for(int i = 0; i < arr[i]; i++) {
			count++;
		}
		x = count;
		length = (double)x/holder;
		System.out.println("Removed Element is: " +remove);
	}

	public void resize()
	{
		if(length == get ) {
			int newArray[] = new int[holder/2];
			for(int i = 0; i < arr.length/2; i++) {
				newArray[i] = arr[i];
			}
			arr = newArray;
			holder = holder/2;
			for(int n : newArray) {
				System.out.print(n + " ");
				}	
		}
		else if(length == get2) {
			int newArray[] = new int[holder*2];
			for(int i = 0; i < arr.length; i++) {
				newArray[i] = arr[i];
			}
			holder = holder * 2;
			arr = newArray;
			for(int j : newArray) {
			System.out.print(j + " ");
			}
			System.out.println();
		}
		else {
			System.out.println("ArrayIndexOutOfBoundRange");
		}
	}
	public int size()
	{
		return holder;
	}
	public String toString()
	{
		String s = Integer.toString(holder);
		return s;
	}
	public static void main(String[] args) {
		arraylist obj = new arraylist();
		obj.add(1);
		obj.add(3);
		obj.add(5);
		obj.add(7);
		obj.pop();
		obj.resize();
		System.out.println("toString: " +obj.toString());
		System.out.println("The number of elements in the new Array is: " +x);
		System.out.println("The Size of new Array is: " +obj.size());
	}
}