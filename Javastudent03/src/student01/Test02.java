package student01;

public class Test02 {
	public static void main(String[] args) {
		//����������ָ��������
		Animal a1 = new Cat();
		Animal a2 = new Bird();
		//����ת�ͣ�ǿ������ת��
		if(a1 instanceof Cat){
			Cat c1 = (Cat)a1;
			c1.catchMouse();
		} 
		if(a2 instanceof Bird){
			Bird b1 = (Bird)a2;
			b1.fly();
		}
		
		
	}
}