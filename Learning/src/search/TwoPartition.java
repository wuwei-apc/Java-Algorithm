/**
 * 
 */
package search;

import Base.LogNum;

/**
 * @author zpc20
 *
 */
public class TwoPartition {
	/**
	 * 交换数组中的元素
	 * 
	 * @param arr
	 * @param j
	 * @param i
	 */
	public static void swap(int[] arr, int j, int i) {
		int tmp = arr[j];
		arr[j] = arr[i];
		arr[i] = tmp;
	}

	/**
	 * 插入排序
	 * 
	 * @param arr
	 */
	public static void insertSort(int[] arr) {
		int len = arr.length;
		for (int i = 1; i < len; i++) {
			for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
				swap(arr, j, j + 1);
			}
		}
	}

	/**
	 * 
	 * @param arr->有序数组
	 * @param num
	 * @return arr是否存在num true 存在 false 不存在
	 */
	public static boolean findPartition(int[] arr, int num) {
		boolean hasNum = false;
		// 边界处理
		if (arr.length == 0 || arr == null) {
			return hasNum;
		}
		int len = arr.length;
		// 初始化
		int right = len - 1, left = 0;
		// left大于right时结束
		while (left <= right) {
			// 找中点
			int mid = (right + left) / 2;
			if (arr[mid] == num) {
				hasNum = true;
				break;
			} else if (arr[mid] > num) {
				// 更新左右位置再次二分
				// arr[mid]>num 则从左半部分查找，否则从右半部分查找
				right = mid - 1;
			} else {
				// arr[mid]<num 右半部分查找
				left = mid + 1;
			}
		}
		return hasNum;
	}

	/**
	 * 
	 * @param arr
	 * @param num
	 * @return position 查找最左大于等于num的位置 思路:一直二分查找直到找到最后一个大于等于num的位置，即为所找位置
	 */
	public static int mostLeftMoreNumPosition(int[] arr, int num) {
		int position = -1;
		// 边界
		if (arr == null || arr.length == 0) {
			return position;
		}
		int len = arr.length;
		int right = len - 1, left = 0;
		while (left <= right) {
			int mid = (right + left) / 2;
			if (arr[mid] >= num) {
				right = mid - 1;
				// 最中间位置大于等于num时更新位置
				position = mid;
			} else {
				left = mid + 1;
				
			}
		}
		return position;
	}
    
	
	/**
	 * 
	 * @param arr
	 * @param num
	 * @return position 查找最右小于等于num的位置 思路:一直二分查找直到找到最后一个小于等于num的位置，即为所找位置
	 */
	public static int mostRightLessNumPosition(int[] arr, int num) {
		int position = -1;
		// 边界
		if (arr == null || arr.length == 0) {
			return position;
		}
		int len = arr.length;
		int right = len - 1, left = 0;
		while (left <= right) {
			int mid = (right + left) / 2;
			if (arr[mid] > num) {
				right = mid - 1;
			} else {
				left = mid + 1;
				// 最中间位置小于等于num时更新位置
				position = mid;
			}
		}
		return position;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 2, 3, 1, 2 };
		insertSort(arr);
		LogNum.printNum(arr);
//		boolean has = findPartition(arr, 3);
		int resPos = mostRightLessNumPosition(arr, 2);  
		if(resPos!=-1) {
			System.out.println("ans="+resPos);
		}
//		if (has) {
//			System.out.println("3存在arr中！");
//		}
	}

}
