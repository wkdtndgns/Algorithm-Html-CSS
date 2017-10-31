package algo.c;

public class SeSort {

    // 배열 a의 start 위치부터 끝까지에서 가장 작은 값의 위치(index)를 리턴한다.
    static int findMin(int[] a, int start) {

    	int min= 0;

		for(int i=start; i<a.length; i++){  
			
			
			if(a[i]<a[min])
				min=i;
			
		}

		return min;
    }

    public static void main(String[] args) {
        int[] a = { 14, 11, 13, 15 };

        for (int i = 0; i < a.length; ++i) {
            int minIndex = findMin(a, i);
            System.out.println(a[minIndex]);
        }
    }

}
