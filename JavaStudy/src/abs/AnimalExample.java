package abs;

public class AnimalExample {
		
	static int[] allFactorials(int n){
		int[] results = new int[n==0? 1 : n];
		doAllFactorials(n, results, 0);
		return results;
	}
	
	static int doAllFactorials(int n, int[] results, int level) {
		if(n>1){
			results[level] = n * doAllFactorials(n-1, results, level + 1);
			return results[level];
		} else {
			results[level] = 1;
			return 1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch bSearch = new BinarySearch();
		int m[] = { 1, 2, 3, 4, 5, 6, 78, 89, 9, 10};
		
		int num = 5;
		int[] results = new int[num];
		results = allFactorials(num);
		for(int i= 0 ; i<num ; i++)
			System.out.println("i : " + i + " " + results[i]);
		
		System.out.println("BinarySearch : " + m[bSearch.binarySearch(m, 89)] + "\n");
		System.out.println("iterBinarySearch : " + m[bSearch.iterBinarySearch(m, 78)]); 
		
		String str = "abcd";
		Permutations per = new Permutations(str);
		per.permute();
	}

}
