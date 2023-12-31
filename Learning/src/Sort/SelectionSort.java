package Sort;

public class SelectionSort {

	public static void selectSort(int[] arr) {
		// 边界判断arr不为空且长度大于2
		if (arr == null || arr.length < 2) {
			return;
		}
		// 获取数组大小即数组长度
		int N = arr.length;
		/**
		 * 0~n-1找最小值 1~n-1找最小值 2~n-1找最小值 确定范围
		 * 
		 */
		for (int i = 0; i < N; i++) {
			   // 优化
			   /**
			    * 当前最小值index设为i
			    */
			   int minValueIndex = i;
			   // 从i的下一个位置开始遍历,寻找最小值交换到i位置
			   for (int j = i+1; j < N; j++) {
				   minValueIndex = arr[j]<arr[minValueIndex]?j:minValueIndex;
			   }
			   swap(arr,i,minValueIndex);
//             for(int j=i+1;j<N;i++) {
//            	 if(arr[j]<arr[i]) {
//            		 // 交换
//            		 int tmp = arr[i];
//            		 arr[i]=arr[j];
//            		 arr[j]=tmp;
//            	 }
//             }
		}
	}
	/**
	 * 交换数组arr[]中两个位置的数
	 * @param int[] arr,int j,int i
	 */
    public static void swap(int[] arr,int j,int i) {
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
		// NOTE: 排序待排序数组
		int[] arr = { 2, 0, 1, 3, 10, 23, 14 };
		printArray(arr);
		selectSort(arr);
		printArray(arr);
	}

}
