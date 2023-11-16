package Base;

public class factorial {

	// 算法一每次都要从1开始做乘法运算
	private static int f1(int n) {
		int re =0;
		for(int i=1;i<=n;i++) {
			re+=factorial(i);
		}
		return re;
	}
	private static int factorial(int n) {
		int re = 1; 
		for(int i=1;i<=n;i++) {
			re*=i;
		}
		return re;
	}
	
	// 算法二每次保存上一步计算结果每次只做一次乘法运算
	private static int f2(int n) {
		int re = 0;
		int tmp = 1;
		for(int i=1;i<=n;i++) {
		    tmp*=i;
		    re+=tmp;
		}
		return re;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(f1(6));
        System.out.println(f2(6));
	}

}
