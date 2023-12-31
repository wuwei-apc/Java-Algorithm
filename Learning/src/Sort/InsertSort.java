/**
 * 
 */
package Sort;

/**
 * @author zpc20 插入排序
 */
public class InsertSort {
	public static void insertSort(int[] arr) {
		// 边界
		if (arr.length < 2 || arr == null) {
			return;
		}
		int N = arr.length;
		/**
		 * 有序子序列递增 0~0 0~1 0~2 ... ... 0~n-1
		 */
		for (int end = 1; end < N; end++) {
			int newNumberIndex = end;
			while (newNumberIndex - 1 >= 0 && arr[newNumberIndex] < arr[newNumberIndex - 1]) {
				swap(arr, newNumberIndex, newNumberIndex - 1);
				// 向前移动直到放到正确的位置
				newNumberIndex--;
			}

		}
	}

	public static void insertSort2(int[] arr) {
		// 边界
		if (arr.length < 2 || arr == null) {
			return;
		}
		int N = arr.length;
		/**
		 * 有序子序列递增 0~0 0~1 0~2 ... ... 0~n-1
		 */
//		 for(int end=1;end<N;end++) {
//			 for(int newNum=end;newNum-1>=0&&arr[newNum]<arr[newNum-1];newNum--) {
//	              swap(arr,newNum,newNum-1);			 
//			 }
//		 }
		for (int end = 1; end < N; end++) {
			for (int pre = end - 1; pre >= 0 && arr[pre] > arr[pre + 1]; pre--)
				swap(arr, pre, pre + 1);
		}
	}

	public static void swap(int[] arr, int j, int i) {
		int tmp = arr[j];
		arr[j] = arr[i];
		arr[i] = tmp;
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println("");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 0, 2, 4, 11, 1 };
		printArray(arr);
		insertSort2(arr);
		printArray(arr);
	}

}
