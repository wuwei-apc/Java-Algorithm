package Sort;

/**
 * 冒泡排序
 * 
 * @author zpc20
 *
 */
public class BubbleSort {

	public static void bubbleSort(int[] arr) {
		// 边界
		if (arr.length < 2 || arr == null) {
			return;
		}
		int N = arr.length;
		// 方法二
		// 控制待排序得个数
		// 0~n
		// 0~n-1
		for (int end = N - 1; end >= 0; end--) {
			// 交换找出最大注意边界=
			for (int second = 1; second <= end; second++) {
				if (arr[second] < arr[second - 1]) {
					swap(arr, second, second - 1);
				}
			}
		}
		// 方法一
//		for(int i=0;i<N;i++) 
//		{
//		    for(int j=0;j<N-i-1;j++) {
//		    	// 判断前面的数比后面的大交换，最后最大的数在数组最后
//		    	if(arr[j]>arr[j+1]) {
//		    		swap(arr,j+1,j);
//		    	}
//		    }
//		}
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

	public static void main(String[] args) {
		int arr[] = { 1, 0, 2, 4, 11, 1 };
		printArray(arr);
		bubbleSort(arr);
		printArray(arr);
	}
}
