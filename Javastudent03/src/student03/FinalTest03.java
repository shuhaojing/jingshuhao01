package student03;

public class FinalTest03 {
	public static void main(String[] args) {
		//�����û�����
		User u = new User(100);
		//����һ���µ��û�����
		u = new User(200);
		
		//�����û�����
		final User zhangsan = new User(10);
	    //zhangsan�̶�ָ��10�Ķ��󲻻���ָ���������󣬱�ָ��Ķ��󲻻ᱻ���������ڻ���
		//zhangsan = new User(100);
		System.out.println(zhangsan.id);
		zhangsan.id = 50;//�����޸ĵ���id��ֵ��û���޸�zhangsan���õĴ洢��ַ��
		//��Ȼ���ܸı�ָ��Ķ��󣬵��ǿ����޸�ָ���������ڲ����ڴ�
		System.out.println(zhangsan.id);
	}
}
