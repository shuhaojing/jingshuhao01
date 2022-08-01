package student01;
/**
 * 关于java语言中多态语法机制：
 *     1，Animal，Cat,Bird，三个类之间的关系
 *         Cat继承Animal
 *         Bird继承Animal
 *         Cat和Bird之间没有任何关系
 *     2，关于多态中涉及到的几个概念：
 *         向上转型【upcasting】
 *             子类型转换成父类型，又被称为自动类型转换
 *         向下转型【downcasting】
 *             父类型转换成子类型，又被称为强制类型转换
 *         无论是向上转型还是向下转型，两种类型之间必须要有继承关系。
 *         没有继承关系程序是无法编译通过的
 */
public class Test {
    
	public static void main(String[] args) {
		
		//以前的写法
		Animal a1 = new Animal();
		a1.move();
		Cat c1 = new Cat();
		c1.move();
		c1.catchMouse();
	    Bird b1 = new Bird();
	    b1.move();
	    
	    //使用多态语法机制之后编写的程序
	    /**
	     * 1,Animal和Cat之间存在继承关系，Animal是父类，Cat是子类
	     * 2，Cat is an Animal
	     * 3，new Cat()创建的对象的类型是Cat，a2这个引用的数据类型是Animal，它们进行了类型转换
	     * 4，子类转换成父类型，称为向上转型，是自动类型转换
	     * 5，java中允许这种语法
	     */
	    Animal a2 = new Cat();
	    /**
	     * 编译看左边，运行看右边
	     * 1,java程序永远都分为编译阶段和运行阶段，
	     * 2,先分析编译阶段，再分析运行阶段，编译无法通过时，根本是无法运行。
	     * 3,编译阶段编译器检查a2这个引用的数据类型为Animal，由于Animal.class字节码文件当中有move方法
	     *   所以编译通过了，这个过程我们称为静态绑定，编译阶段绑定。
	     *   只有静态绑定成功后才有后续的运行
	     * 4,在程序运行阶段，JVM堆内存中真实创建的对象是Cat对象，那么以下程序在运行阶段一定会调用Cat
	     *   对象的move方法，此时发生了程序的动态绑定，运行阶段绑定。
	     * 5,无论Cat类有没有重写move方法，执行结果都是Cat对象里的move方法，子类继承父类方法
	     * 6,父类型引用指向子类型这种机制存在编译阶段绑定和运行阶段绑定，有两种不同状态
	     *   这种机制叫做多态，
	     */
	    a2.move();//猫在走猫步
	    //以下程序不能编译的原因是编译器检查不到a2的类型是Animal类型、
	    //从Animal.class字节码文件中查找catchMOuse方法。没有找到，导致静态绑定失败
	    //a2.catchMouse();
	    /**
	     * 需求：想让以上的对象执行catchMOuse
	     * a2是无法直接调用的，因为a2的类型Animal中没有catchMouse方法
	     * 我们可以将a2强制类型转换为Cat类型
	     * a2的类型是Animal类型【父类】，转换成Cat类型【子类】被称为强制类型转换
	     * 什么时候需要向下转型呢，当调用或者访问的方法时子类型中特有的方法时，在父类中不存在
	     * 必须进行向下转型
	     */
	    //Cat c2 = (Cat)a2;
	    
	    //java.lang.ClassCastException
	    //以下程序在编译期是没有问题的，因为Animal和Cat有继承关系，但是在运行阶段会报错
	    //但在运行阶段真实对象是Bird和Cat没有继承关系，所以出现报错，
	    //类型转换异常这种情况总是在“向下转型的时候发生”
	    Animal a3 = new Bird();
	    //Cat c3 = (Cat)a3;//程序报错
	    /**
	     * 以上异常只会出现在强制类型转换，中，也就是说，向下转型存在安全隐患【编译过了，但是运行出错】
	     * 向上转型只要编译不出错就可以运行，
	     * 向下转型编译通过时，有可能程序会进行报错
	     * 怎样避免向下转型时程序报错
	     *     使用instanceof运算符可以避免出现以上的异常。
	     * instanceof运算符怎样使用，
	     *     instanceof运算符格式：
	     *         引用 instanceof 数据类型 
	     *     以上运算符的运算结果是布尔类型，结果可能是true/false
	     *     关于运算结果：
	     *         假设：(a instanceof Animal )
	     *         结果为true：a这个引用指向的对象是一个Animal类型，
	     *         结果为false：a这个引用指向的对象不是一个Animal类型
	     * 在java中规范要求：在进行强制类型转换之前，建议采用instanceof运算符进行判断，避免运行阶段报错      
	     */
	    if (a3 instanceof Cat){
	    	Cat c3 = (Cat)a3;
	    	//调用子类中特有的方法
	    	c3.catchMouse();
	    }else if(a3 instanceof Bird){
	    	Bird b2 = (Bird)a3;
	    	//调用子类中特有的方法
	    	b2.fly();
	    }
    }
}


















