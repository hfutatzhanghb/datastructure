package sort;

/**
 * @author zhanghaobo
 * @date 2017年10月11日下午9:13:28
 * @todo TODO
 */
// 堆排序
public class HeapSort {

	public static void main(String[] args) {
		int[] a = { 0, 2, 4, 7, 5, 3, 6, 10 };
		heapSort(a);
		for (int i : a) {
			System.out.println(i);
		}
	}

	// 构建堆
	public static void buildHeap(int[] array) {
		// TODO
		int size = array.length;
		for (int i = ((size - 1) / 2); i >= 0; i--) {
			adjustHeap(array, i);
		}
	}

	// 调整堆
	public static void adjustHeap(int[] a, int i) {
		// TODO
		int size = a.length;
		int lchild = 2 * i + 1;
		int rchild = 2 * i + 2;
		// 大顶堆
		int max = i;
		if (i < size/2) {
			if (lchild <= size - 1 && a[lchild] > a[max]) {
				max = lchild;
			}
			if (rchild <= size - 1 && a[rchild] > a[max]) {
				max = rchild;
			}
			if (max != i) {
				swap(a, i, max);
				adjustHeap(a, max); // 避免调整之后以max为父节点的子树不是堆
			}
		}

	}

	// 交换i和j位置的两个数
	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	// 堆排序
	public static void heapSort(int[] array) {
		int size = array.length;
		buildHeap(array);
		for (int i = size - 1; i >= 0; i--) {
			swap(array, 0, i);
			adjustHeap(array, i);
		}

	}
}
