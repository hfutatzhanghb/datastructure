package search;

//二分查找 
//note：while里的条件是<=

public class BiSearch {
	
	public static void main(String[] args) {
		int[]  a = {1,2,3,4,5,6,7,8,9};
		System.out.println(biSort(a,1));
	}
	
	
	public static int   biSort(int[] array,int target) {
		int left = 0;
		int right = array.length-1;
		while(left<=right) {
			int mid = (left+right )/2;
			if(target==array[mid])
				return mid;
			if(target<array[mid]) {
				right=mid-1;
			}
			if (target>array[mid]) {
				left=mid+1;
			}
			
		}
		return -1;
		
	}
}
