package student02;
/**
 * 主人类
 *
 */

//这种方式没有使用JAVA语言中的多态机制，导致Master这个类的扩展力很差，因为只要加一个新的宠物，就需要添加一个新的方法
/*
public class Master {
	
	  喂养宠物的方法
	 
	public void feed(Cat c){
		c.eat();
	}
	public void feed(Dog d){
		d.eat();
	}
	
}
*/
//，降低程序的耦合度【解耦合】，提高程序的扩展力【软件开发的扩展力】
//Master主人类面向的是一个抽象的对象类 Pet而不是具体的宠物，提倡面向抽象对象编程而不是具体对象
//面向抽象编程的好处是耦合度低，扩展力强
public class Master{
	public void feed(Pet p){//Pet p 是一个父类型的引用
		p.eat();
	}
}

