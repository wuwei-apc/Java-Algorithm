/**
 * 
 */
package Base;

/**
 * @author zpc20
 *
 */
public class code01_PrintB {

	/**
	 * 打印32进制数
	 */
	private static void printB(int num) {
		    // 先左移再相与获取当前为信息
            for(int i=31;i>=0;i--) {
            	System.out.print((num&(1<<i))==0?"0":"1");
            }
            System.out.println();
	}
	public static void main(String[] args) { // TODO Auto-generated method stub
      // INT 4个字节(每个字节8位二进制) 32位
	  int num = 83928328; 
//	  System.out.println("测试中文");
//	  printB(num);
	  int b = 2;
	  int c = ~b;
	  printB(b);
	  printB(c);
	}

}
