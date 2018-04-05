package sort;

/**
 * 快速排序
 * @author Administrator
 *
 */

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {1,3,5,7,8,4,2,20,10,13,12,11};
		quicksort(test, 0, test.length-1);
		for (int i : test) {
			System.out.print(i+" ");
		}
		
	}
	
	public static void quicksort(int []array,int l,int r) {
		if(l<r) {
			int mid=partition(array, l, r);
			quicksort(array, l, mid-1);
			quicksort(array, mid+1, r);
		}
	}
	
	
	public static int partition(int [] array,int l,int r) {
		int left= l,right=r;
		int x=array[left];
		
		while(left<right) {
			
			while(left<right && array[right]>x)
				right--;
			if (left<right) {
				array[left++]=array[right];
			}
			
			while(left<right && array[left]<x)
				left++;
			if (left<right) {
				array[right--]=array[left];
			}
			
		}
		
		array[left]=x;
		return left;
	}
}
