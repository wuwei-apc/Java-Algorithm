package Base;

/**
 * 比对
 * 对数器
 * 测试用
 * @author zpc20
 *
 */
public class LogNum {
	//-------------------排序----------------------
	public static void printNum(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
    public static void swap(int[] arr,int j,int i) {
    	int tmp = arr[j];
    	arr[j] = arr[i];
    	arr[i] =tmp;
    }
	
	/**
	 * 选择排序
	 * @param int arr[]
	 */
	public static void selectSort(int[] arr) {
		int len = arr.length;
		if(arr==null||len<2) {
			return;
		}
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(arr[i]>arr[j]) {
					swap(arr,j,i);
				}
			}
		}
	}
	
	/**
	 * 冒泡排序
	 * @param arr
	 */
	public static void bubbleSort(int[] arr) {
		int len = arr.length;
		if(arr==null|len<2) {
			return;
		}
		for(int i=0;i<len;i++) {
			for(int j=1;j<len-i;j++) {
				if(arr[j]<arr[j-1]) {
					swap(arr,j,j-1);
				}
			}
		}
	}
	
	/**
	 * 插入排序
	 * @param arr
	 */
	public static void insertSort(int[] arr) { 
		 int len = arr.length;
		 if(arr==null||len<2) {
			 return;
		 }
		 for(int i=1;i<len;i++) {
			 /**
			  * 交换到子序列的正确位置
			  * 别忘了=0
			  */
			 // 0~i有序
			 for(int j=i-1;j>=0&&arr[j]>arr[j+1];j--) {
				 swap(arr,j,j+1);
			 }
		 }
	}
	
	//------------------------排序---------------------
	
	
	//------------------------对数器--------------------
	
	/**
	 * 
	 * @param maxLen
	 * @param maxValue
	 * @return arr->长度[0,maxLen-1],arr中的每一个值[0,maxValue-1]
	 */
	public static int[] lenRandomAndValRandom(int maxLen,int maxValue) {
		int len = (int)(Math.random()*maxLen);
		int[] arr = new int[len];
		for(int i=0;i<len;i++) {
			arr[i]=(int)(Math.random()*maxValue);
		}
		return arr;
	}
	
	/**
	 * 拷贝数组函数
	 * @param arr
	 * @return newArr
	 */
	public static int[] copyArray(int[] arr) {
		int len = arr.length;
		int[] newArr = new int[len];
		for(int i=0;i<len;i++) {
			newArr[i] = arr[i];
		}
		return newArr;
	}
	
	/**
	 * 判断数组值是否相等
	 * @param arr1
	 * @param arr2
	 * @return equal true(相等) false(不相等)
	 */
	public static boolean equalValues(int[] arr1,int[] arr2) {
		boolean equal = true;   
		int len = arr1.length;
		for(int i=0;i<len;i++) {
			if(arr1[i]!=arr2[i]) {
				equal = false;
			}
		}
		return equal;
	}
	
	/**
	 * 判断数组是否是升序序列
	 * @param arr
	 * @return equal
	 */
	public static boolean isSorted(int[] arr) {
		if(arr.length<2) {
			return true;
		}
		boolean equal = true;
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max>arr[i]) {
				equal = false;
			}
			max = Math.max(max, arr[i]);
		}
		return equal;
	}
	
	//------------------------对数器--------------------
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {2,0,2,4,1,10};
//        PrintNum(arr);
//        selectSort(arr);
//        bubbleSort(arr);
//        insertSort(arr);
//        printNum(arr);
        int maxLen = 40;
        int maxValue = 1000;
        int testCount = 1000;
        for(int i=0;i<testCount;i++) {
        	int[] arr1 = lenRandomAndValRandom(maxLen, maxValue);
        	int[] tmp = copyArray(arr1);
        	selectSort(arr1);
//        	insertSort(arr2);
        	if(!isSorted(arr1)) {
        		printNum(tmp);
        		System.out.println("选择排序错误！！");
        		break;
        	}
        }
	}

}
