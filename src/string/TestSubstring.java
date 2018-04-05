package string;

/**
 * 测试substring 的用法
 * 
 * @author Administrator
 *
 */

public class TestSubstring {
	
	public static void main(String[] args) {
		String string = "helloworld";
		String substring = string.substring(2);
		System.out.println(substring); //llo world
		String substring2 = string.substring(2, 6);
		System.out.println(substring2);//llo
		
	}
}
