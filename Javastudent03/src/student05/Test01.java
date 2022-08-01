package student05;
/**
 * 访问控制权限修饰符：
 *     1，访问控制权限修饰符来控制元素的修饰范围
 *     2，访问控制权限修饰符包括：
 *         public        表示公开的，在任何位置都可以访问
 *         protected     同包，子类中
 *         缺省          同包
 *         private       表示私有的，只能在本类中进行访问
 *     3，访问控制权限修饰符可以修饰类，变量，方法。。。。
 *     4，当某个数据只希望子类使用，使用protected修饰
 *     5，类只能采用public或者缺省的方式创建【内部类除外】
 * @author ASUS
 *
 */
public class Test01 {
	public static void main(String[] args) {
		Test02 t = new Test02();
		System.out.println(t.i);
		System.out.println(t.j);
	}
}
