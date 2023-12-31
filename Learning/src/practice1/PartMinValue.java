/**
 * 
 */
package practice1;

/**
 * @author zpc20 求局部最小值位置
 */
public class PartMinValue {

	public static int oneMinIndex(int[] arr) {
		if (arr == null || arr.length == 0) {
			return -1;
		}
		int len = arr.length;
		if (len == 1) {
			return 0;
		}
		// len==2
//		if(len==2) {
//			return  arr[0]<arr[1]?0:1;
//		}
		// 判断左边界是否满足
		if (arr[0] < arr[1]) {
			return 0;
		}
		// 判断有边界是否满足
		if (arr[len - 1] < arr[len - 2]) {
			return len - 1;
		}
		// 二分法寻找最小值
		int right = len - 1, left = 0;

//		int minIndex = -1;
//		System.out.println("_____________");
		// 三个数以上才做二分
		while (left < right-1) {
			int mid = (left + right) / 2;
			if (arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1]) {
				return mid;
			} else {
				if (arr[mid] > arr[mid - 1]) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			}

		}
		return arr[left] < arr[right] ? left : right;
	}

	// len [0-maxLen-1] value [0,maxValue-1]
	// 生成随机数组，且相邻数不相等
	public static int[] randomArray(int maxLen, int maxValue) {
		int len = (int) (Math.random() * maxLen);
		int arr[] = new int[len];
		if (len > 0) {
			arr[0] = (int) (Math.random() * maxValue);
			for (int i = 1; i < len; i++) {
				do {
					arr[i] = (int) (Math.random() * maxValue);
				} while (arr[i] == arr[i - 1]);
			}
		}
		return arr;
	}

	/**
	 * 测试验证
	 * 
	 * @param arr
	 * @param minIndex
	 * @return
	 */
	public static boolean check(int[] arr, int minIndex) {
		if (arr.length == 0) {
			return minIndex == -1;
		}
		// minIndex位置左边
		int left = minIndex - 1;
		// 验证左边
		boolean leftBigger = left >= 0 ? arr[left] > arr[minIndex] : true;
		int right = minIndex + 1;
//		验证右边
		boolean rightBigger = right < arr.length ? arr[right] > arr[minIndex] : true;
		return leftBigger && rightBigger;
	}

	/**
	 * 打印数组arr
	 * 
	 * @param arr
	 */
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

	/**
	 * main 函数
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxLen = 1000;
		int maxValue = 10000;
		int testCounts = 10000;
		for (int i = 0; i < testCounts; i++) {
			int[] arr = randomArray(maxLen, maxValue);
			printArray(arr);
			int index = oneMinIndex(arr);
			System.out.println(index);
			if (index != -1) {
				System.out.println(
						check(arr, index) ? index + ":" + arr[index] + "验证成功!" : index + ":" + arr[index] + "验证错误！");
			}

		}
	}

}
