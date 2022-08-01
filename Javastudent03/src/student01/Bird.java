package student01;

public class Bird extends Animal {
	//重写父类中继承过来的方法
	public void move(){
		System.out.println("鸟在飞");
	}
	public void fly(){
		System.out.println("bird fly");
	}
}
