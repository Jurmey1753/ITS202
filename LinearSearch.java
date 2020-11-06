public class LinearSearch{
	public static int Search(int[] array, int key){
		for(int i=0; i<array.length; i++){
			if(array[i]==key){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] a={10,20,30,40,50,60};
		// int N=a.length;
		int key=50;
		System.out.println(key + " is found at index " + Search(a,key));
	}
}