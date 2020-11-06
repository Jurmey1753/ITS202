public class KeyIndex{

	public static void main(String[] args) {

		int[] a={1,4,2,5,6,8};
		int R=256;
		int N=a.length;

		int[] count = new int[R+1];
		int[] aux = new int[N];

		for(int i=0; i<N; i++){
				count[a[i]+1]++;
		}
		//comulative frequency
		for(int r=0; r<R; r++){
		count[r+1]+=count[r];
		}
		for(int i=0;i<N;i++){
			aux[count[a[i]] ++] = a[i];
		}
		for (int i = 0; i < N; i++){
			a[i] = aux[i];
		}


		for(int i=0; i<N; i++){
			System.out.print(" "+a[i]);
		}
		System.out.print(" ");	
	}

}