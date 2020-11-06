public class LSD{
	public static void main(String[] args) {
		String[] a={"Tashi","Karma","Sonam","Choki"};
		int W=5;
		int R=256;
		int N=a.length;
		String[] aux=new String[N];

		for(int d=W-1; d>=0; d--){
			int[] count=new int[R+1];
			for(int i=0; i<N; i++){
				count[a[i].charAt(d) + 1]++;
			}
			for (int r = 0; r < R; r++){
	 			count[r+1] += count[r];
			}
			 for (int i = 0; i < N; i++){
			 aux[count[a[i].charAt(d)]++] =a[i];
			}
			for (int i = 0; i < N; i++){
			 	a[i] = aux[i];
			}
		}
		for (int i = 0; i < a.length; i++){
		System.out.print(" "+a[i]);
		}
	}
}