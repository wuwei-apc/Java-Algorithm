package Base;
/**
 * Math.random()
 * @author zpc20
 *
 */
public class RandomNum {
    public static void Test(double n,int total) {
    	int count =0;
    	for(int i=0;i<total;i++) {
    		if(Math.random()*n<n/2) {
    			count++;
    		}
    	}
    	System.out.println((double)count/(double)total);
    }
    /**
     * 返回[0,1)之间的数，概率从x变为x平方
     * @param none
     */
    public static double xToXPower() {
    	   // 最大值两次随机都是[0,x)的概率都是x
    	   // 最小值两次概率1-p,p=(1-x)^2
    	   // 概率
          return Math.max(Math.random(),Math.random());
    }
	public static void main(String[] args) {
	        /**
	         * Math.random()->double->[0,1)
	         * 等概率返回
	         */
	        
	        double nums = Math.random();
	        System.out.println(nums);
	        /**
	         * 测试等概率
	         */
	        Test(1,10000);
	        Test(8,10000);
	        System.out.println("-----------");
	        /**
	         * int强制类型转换向下取整
	         * [0,K)->[0,K-1]
	         */
	        int K = 4;
	        int n1 = (int) (Math.random()*K);
	        /**
	         * 测试等概率
	         */
	        int[] count =new int[4]; 
	        System.out.println(n1);
	        System.out.println("-----------");
	        for(int i=0;i<1000;i++) {
	        	int ans =(int)(Math.random()*4); 
	        	count[ans]++;
	        }
	        for(int j=0;j<3;j++) 
	        {
	           System.out.print(j+"出现了"+count[j]+"次\t");	
	        }
	        System.out.println();
	        System.out.println("-----------");
	        int counts = 0;
	        double x = 0.7;
	        for(int i=0;i<1000;i++) {
	        	if(xToXPower()<0.7) {
	        		counts++;
	        	}
	        }
	        System.out.println((double)counts/(double)1000);
	        System.out.println(Math.pow(x,2));
	        System.out.println((1<<2)+(0<<1)+(0<<0));
   }
}
