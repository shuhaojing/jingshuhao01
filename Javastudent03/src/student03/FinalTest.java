package student03;
/**
 * 
 * 1，final修饰符是一个关键字，表示最终的，无法被改变的
 * 2，final修饰的类无法被继承
 * 3，final修饰的方法无法被覆盖
 * 4，final修饰的变量一旦被赋值，不可以重新复制赋值
 * 5，final修饰的实例变量必须手动赋值，不能采用系统默认值
 * 6，final修饰的引用一旦指向某个对象后，不能再指向其他对象，被指向的对象不会被垃圾回收器回收
 * 7，final修饰的实例变量一般与static联合使用，被称为常量。
 * 关于MyEclipse连接源码，打开Class字节码文件，没有看到源码时，点击添加，Workspace【在当前工作区中】
 * External File【在压缩包中】external Folder【在某个目录当中】
 * 
 * 以后学习的內库包括三部分：源码【理解程序】，，字节码【开发时使用】，，帮助文档【开发提供帮助】
 *
 */
public class FinalTest {
	public static void main(String[] args) {
		
	}
}

class C {
	public final void doSome(){
		System.out.print("do Some!");
	}
}
//final修饰的类无法被继承
/*class B extends A{
	
}
*/

class B extends C{
	public void doSome(){
		System.out.println("DO SOME");
	}
}






