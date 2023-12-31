package Base;

public class Random1_5_0_7 {
    // 包函数不可变
	public static int f() {
		// 1-5等概率随机
		return (int)(Math.random()*5)+1;
	}
	// 0-1发生器
	public static int zeroP() {
		int ans=0;
		do {
			ans = f();
		}while(ans==3);
		// 1,2->0 3 45->1
		return ans<3?0:1;
	}
	// 0-7
	// 0,1三次
	public static int  f3() {
		int ans = (zeroP()<<2)+(zeroP()<<1)+(zeroP()<<0);
		return ans;
	}
	// 0-6
	public static int f4() {
		int ans = 0;
		do {
			ans = f3();
		}while(ans==7);
		return ans;
	}
	// (0-6)+1->1-7
	public static int r1() {
		return f4()+1;
	}
	public static void main(String[] args) {
		int count = 0;
		for(int i=0;i<1000;i++) {
			if(zeroP()==0) {
				count++;
			}	
		}
		System.out.println(count);
		int[] counts = new int[8];
		for(int i=0;i<1000;i++) {
        	int ans =r1();
        	counts[ans]++;
        }
 		for(int j=1;j<8;j++) 
        {
           System.out.println(j+"出现了"+counts[j]+"次\t");	
        }
 		System.out.println("-----------");
	}
}
