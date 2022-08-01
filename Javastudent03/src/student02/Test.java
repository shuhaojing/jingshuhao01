package student02;
/**
 * 多态在实际开发中的作用，以下以主人喂养宠物为例 
 * 说明多态的作用
 * 1，分析：主人喂养动物的场景要实现需要进行类型的抽象
 *     -主人（类）
 *     -主人可以喂养宠物
 *     -宠物（类）
 *     -宠物可以吃东西
 * 2，面向对象的核心：定义好类，然后将类实例化为对象，给一个环境驱使，让各个对象之间协作起来形成一个系统
 * 3，多态的作用是什么：
 *     -降低程序的耦合度，提高程序的扩展力。
 *     -能使用多态尽量使用多态
 *     -父类型引用指向子类型对象
 * @author ASUS
 *
 */
public class Test {
	public static void main(String[] args) {
		//创建主人
		Master jing = new Master();
		//创建猫对象
		//Pet he = new Cat();
		//喂猫
		jing.feed(new Cat());
		//创建小狗对象
		//Pet hou = new Dog();
		jing.feed(new Dog());
		jing.feed(new Snake());
	}
}
