package hashtab;

import sun.invoke.empty.Empty;

public class HashTabDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//��ʾһ����Ա
class Emp{
	public int id;
	public String name;
	public Emp next;  //nextĬ��Ϊ��
	//������
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}

//����EmpLinkedList����ʾ����
class EmpLinkedList{
	//ͷָ�룬ָ���һ��Emp�����������������head��ֱ��ָ���һ��Emp
	private Emp head;//Ĭ��Ϊnull
	
	//��ӹ�Ա������
	//˵��  1.�ٶ���ӹ�Աʱ idʱ������ ��id�ķ������Ǵ�С����
	//  ������ǽ��ù�Աֱ�Ӽ��뵽���������󼴿�
	public void add(Emp emp) {
		//�������ӵ�һ����Ա
		if(head == null) {
			head = emp;
			return;
		}
		//������ǵ�һ����Ա����ʹ��һ��������ָ�룬������λ�����
		Emp curEmp = head;
		while(true) {
			if(curEmp.next == null) { //˵���������
				break;
		}
		curEmp = curEmp.next; //����
	}
	//�˳�ʱֱ�ӽ�emp��������
}
	//��������Ĺ�Ա��Ϣ
	public void list() {
		if(head == null) {  //˵������Ϊ��
			System.out.println("��ǰ����Ϊ��");
			return;
		}
		System.out.println("��ǰ�������ϢΪ");
		Emp curEmp = head; //����ָ��
		while(true) {
			System.out.printf("=> id=%d name=%s\t",curEmp.id,curEmp.name);
			if(curEmp.next == null) { //˵��curEmp�Ѿ��������
				break;
			}
			curEmp = curEmp.next; //���ƣ�����
		}
		System.out.println("");
	}
}