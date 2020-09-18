public class resize{
	public static int[] resize(int length, int[] array){
		int[] num = new int[length];
		for (int i=0;i<array.length;i++ ) {
			num[i]=array[i];
		}
		num[length-1]=4;
		return num;
	}
	public static void main (String[] args){
		int[] array = {1,2,3};
		int[] value = resize(4, array);
		for (int i=0;i<value.length;i++ ) {
			System.out.println(value[i]);
		}
	}
}