package hashtab;

import sun.invoke.empty.Empty;

public class HashTabDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//表示一个雇员
class Emp{
	public int id;
	public String name;
	public Emp next;  //next默认为空
	//构造器
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}

//创建EmpLinkedList，表示链表
class EmpLinkedList{
	//头指针，指向第一个Emp，因此我们这个链表的head是直接指向第一个Emp
	private Emp head;//默认为null
	
	//添加雇员到链表
	//说明  1.假定添加雇员时 id时自增长 即id的分配总是从小到大
	//  因此我们将该雇员直接加入到本链表的最后即可
	public void add(Emp emp) {
		//如果是添加第一个雇员
		if(head == null) {
			head = emp;
			return;
		}
		//如果不是第一个雇员，则使用一个辅助的指针，帮助定位到最后
		Emp curEmp = head;
		while(true) {
			if(curEmp.next == null) { //说明链表到最后
				break;
		}
		curEmp = curEmp.next; //后移
	}
	//退出时直接将emp加入链表
}
	//遍历链表的雇员信息
	public void list() {
		if(head == null) {  //说明链表为空
			System.out.println("当前链表为空");
			return;
		}
		System.out.println("当前链表的信息为");
		Emp curEmp = head; //辅助指针
		while(true) {
			System.out.printf("=> id=%d name=%s\t",curEmp.id,curEmp.name);
			if(curEmp.next == null) { //说明curEmp已经是最后结点
				break;
			}
			curEmp = curEmp.next; //后移，遍历
		}
		System.out.println("");
	}
}