package student03;
/**
 * 
 * 1��final���η���һ���ؼ��֣���ʾ���յģ��޷����ı��
 * 2��final���ε����޷����̳�
 * 3��final���εķ����޷�������
 * 4��final���εı���һ������ֵ�����������¸��Ƹ�ֵ
 * 5��final���ε�ʵ�����������ֶ���ֵ�����ܲ���ϵͳĬ��ֵ
 * 6��final���ε�����һ��ָ��ĳ������󣬲�����ָ���������󣬱�ָ��Ķ��󲻻ᱻ��������������
 * 7��final���ε�ʵ������һ����static����ʹ�ã�����Ϊ������
 * ����MyEclipse����Դ�룬��Class�ֽ����ļ���û�п���Դ��ʱ�������ӣ�Workspace���ڵ�ǰ�������С�
 * External File����ѹ�����С�external Folder����ĳ��Ŀ¼���С�
 * 
 * �Ժ�ѧϰ�ăȿ���������֣�Դ�롾�����򡿣����ֽ��롾����ʱʹ�á����������ĵ��������ṩ������
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
//final���ε����޷����̳�
/*class B extends A{
	
}
*/

class B extends C{
	public void doSome(){
		System.out.println("DO SOME");
	}
}






