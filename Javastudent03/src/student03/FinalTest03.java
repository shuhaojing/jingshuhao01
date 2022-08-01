package student03;

public class FinalTest03 {
	public static void main(String[] args) {
		//创建用户对象
		User u = new User(100);
		//创建一个新的用户对象
		u = new User(200);
		
		//创建用户对象
		final User zhangsan = new User(10);
	    //zhangsan固定指向10的对象不会再指向其他对象，被指向的对象不会被垃圾回收期回收
		//zhangsan = new User(100);
		System.out.println(zhangsan.id);
		zhangsan.id = 50;//这里修改的是id的值并没有修改zhangsan引用的存储地址，
		//虽然不能改变指向的对象，但是可以修改指向对象里的内部的内存
		System.out.println(zhangsan.id);
	}
}
