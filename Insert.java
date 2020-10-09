import java.util.Scanner;
public class Insert{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		System.out.print("Array length: ");
		int length = c.nextInt();
 		int[] array=new int [length];

        System.out.print("Enter the elements: ");
        for (int i = 0; i <length; i++) {
            int a=c.nextInt();
            array[i]=a;

        }  
        System.out.print("The unsorted array: ");
        for(int j=0; j<array.length; j++){
        	System.out.print(" "+array[j]+" ");
        }
        // Sorted array
        System.out.print("Sorted array: ");
        Insertion(array);
        for(int i:array){
            System.out.print(i+" ");
        }
	}
    public static void Insertion(int arr[]){
        int x = arr.length;
        for(int y=1; y<x; y++){
            int l=arr[y];
            int i=y-1;

            while((i> -1) && arr[i]>l){
                arr[i+1]=arr[i];
                i--;
            }
            arr[i+1]=l; 
        }
    }
} 