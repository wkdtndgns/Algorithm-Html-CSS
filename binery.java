package algo.c;

public class binery {
	
	
	static int search1(int A[], int n)
{
    int sum = 0;
    for (int i = 0; i < n; ++i)
            for (int j = 0; j < n; ++j) {
             int k = 0;
             for (int h = j; h < n; ++h)
                  if (A[h] > k) k = A[h];
                    sum = sum + k;
       }
    return sum;
    
    
}

	static String search2(int[] a, int value) {
	    int start = 0;
	    int end = a.length - 1;
	    
	    while (start <= end) {
	        int middle = (start + end) / 2;
	        if (a[middle] < value) start = middle + 1;
	        else if (a[middle] > value) end = middle - 1;
	        else return "찾음 ";
	    }
	    return "없음";
	}

	public static void main(String[] args) {
	
		int[] a =new int[10];
		
		int r=0;
		for(int i=0; i<a.length; i++){
			a[i]=r;
			r++;
			
		}
		
		
		
		
		System.out.println(search1(a,8));
		System.out.println(search2(a,8));
	
	}
}
