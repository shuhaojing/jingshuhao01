package student02;
/**
 * ������
 *
 */

//���ַ�ʽû��ʹ��JAVA�����еĶ�̬���ƣ�����Master��������չ���ܲ��ΪֻҪ��һ���µĳ������Ҫ���һ���µķ���
/*
public class Master {
	
	  ι������ķ���
	 
	public void feed(Cat c){
		c.eat();
	}
	public void feed(Dog d){
		d.eat();
	}
	
}
*/
//�����ͳ������϶ȡ�����ϡ�����߳������չ���������������չ����
//Master�������������һ������Ķ����� Pet�����Ǿ���ĳ���ᳫ�����������̶����Ǿ������
//��������̵ĺô�����϶ȵͣ���չ��ǿ
public class Master{
	public void feed(Pet p){//Pet p ��һ�������͵�����
		p.eat();
	}
}

