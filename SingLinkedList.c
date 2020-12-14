#include <stdio.h>
#include <string.h>   //提供strcpy()等
#include <stdlib.h>   //提供malloc()和free()

typedef int LDataType; //假设结点的数据域类型为整形
typedef struct listNode
{
	LDataType _data; //结点的数据域
	listNode* _next; //下一个数据的存放位置
}listNode;

typedef struct list
{
	listNode* _head; //存放第一个节点的地址
}list;

void listInit(list* lst)
{
	if (lst == NULL)
		return;
	//初始化为空的链表
	lst->_head = NULL;
}

//首先定义一个结构体指针变量node，使用malloc函数为新建节点申请内存空间，让node指向这个节点
//再将它添加到链表中

listNode* creatNode(LDataType val)
{
	listNode* node = (listNode*)malloc(sizeof(listNode));
	node->_data = val;
	node->_next = NULL;
	return node;
}

//头插
void listPushFront(list* lst,LDataType val)
{
	if (lst == NULL)
		return;
	//如果是空的链表，插入第一个数据
	if (lst->_head == NULL){
		lst->_head == creatNode(val);
	}else{
		listNode* node = creatNode(val);
		listNode* next = lst->_head;
		//head, node, next
		lst->_head = node;
		node->_next = next;
	}
}

//头删
void listPopFront(list* lst)
{
	if (lst == NULL || lst->_head == NULL)
		return;
	listNode* next = lst->_head->_next;
	//释放头节点
	free(lst->_head);
	lst->_head = next;
}

//尾插
void listPushBack(list* lst, LDataType val)
{
	if (lst == NULL)
		return;
	//如果是一个空链表，则在其中插入第一个数据
	if (lst->_head == NULL){
		//创建节点
		lst->_head = creatNode(val);
	}
	else{
		//遍历，找到最后一个节点
		listNode* tail = lst->_head;  //先指向头节点，依次向后遍历
		while (tail->_next != NULL)
		{
			tail = tail->_next;
		}
		//插入
		tail->_data = creatNode(val);
	}
}


////尾删 需要创建两个指针变量prev和tail 让prev首先指向头结点位置
//void listPopBack(list* lst)
//{
//	if (lst == NULL || lst->_head == NULL)
//		return;
//
//	listNode* tail = lst->_head;
//	listNode* prev = NULL;
//	//遍历 找到最后一个节点
//	if (tail->_next != NULL)
//	{
//		prev = tail;
//		tail = tail->_data;
//	}
//	//删除节点
//	free(tail);
//	//修改指向)

//删除cur节点的下一个节点
void listEraseAfter(listNode* cur)
{
	//cur next next->next
	struct listNode* next = cur->_next;
	if(next == NULL)
		return;
	struct listNode* nextnext = next->_next;
	free(next);
	cur->_next = nextnext;
}

//在任意位置插入一个节点
void listInsertAfter(listNode* cur,LDataType val)
{
	listNode* node = creatNode(val);
	listNode* next = cur->_next;
	//cur node next
	cur->_next = node;
	node->_next = next;
}
void test()
{
	list lst;
	liastInit(&lst);
	listPushFront(&lst,5);
	listPushFront(&lst,4);
	listPushFront(&lst,3);
	listPushFront(&lst,2);
	listPushFront(&lst,1);
        listNode* cur = listFind(&lst,3);
	listNode* cur = listFind(&lst,4);
}
int main()
{
	test();
	system("pause");
	return 0;
}
