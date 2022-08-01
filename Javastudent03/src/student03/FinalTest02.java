package student03;

public class FinalTest02 {
	//成员变量之实例变量
	//实例变量有默认值+final修饰的变量一旦被赋值不能重新赋值
	//这里非要用final时，要提示加上赋值
	//final int i;
	//第一种解决：
	final int num = 100;
	//第二种解决方案：
	final int age;
	public FinalTest02(){
		this.age = 100;
	}
	//以上两种方法原理相同，都是在构造方法执行的时候给实例变量赋值
	public static void main(String[] args) {
		final int i;
	}
}
