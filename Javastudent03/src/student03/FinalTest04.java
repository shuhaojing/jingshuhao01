package student03;

public class FinalTest04 {
	
	public static void main(String[] args) {
		
		System.out.println(Chinese.GUO_JI);
		System.out.println(Math.PI);
		
	}
}
class Math{
	
	public static final double PI = 3.1415926;
}
//中国人类
class Chinese{
	
	//国籍
	//每一个人的国籍都是中国而且不会发生改变
	//通常final会和static联合使用修饰一个变量，这种变量称之为常量
	//常量的格式为：static final 数据类型 常量名 = 值;
	//java规范要求中所有的常量名全部大写，每个单词之间使用下划线连接
	//static final String country = "中国";
	public static final String GUO_JI = "中国";
	
	
}