package sort;

import java.util.Arrays;

public class InsertSort {

	public static void main(String[] args) {
		int[] arr = { 101, 34, 119, 1, -1, 89, 10 };
		insertSort(arr);

	}

	//��������
	public static void insertSort(int[] arr) {

		//ʹ��forѭ���Ѵ����
		for (int i = 1; i < arr.length; i++) {
			//������������
			int insertVal = arr[i];
			int insertIndex = i - 1; //��arr[1]��ǰ����������С��

			//��insertVal�ҵ������λ��
			//˵��
			//1.insertIndex >= 0��֤�ڸ�insertVal�Ҳ���λ�ã���Խ��
			//2.insertVal < arr[insertIndex]�������������û���ҵ�����λ��
			//3.����Ҫ��arr[insertIndex]����
			while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
				arr[insertIndex + 1] = arr[insertIndex];
				insertIndex--;
			}
			//���˳�whileѭ��ʱ��˵�������λ���ҵ���insertIndex+1

			arr[insertIndex + 1] = insertVal;
			System.out.println("��" + i + "�ֲ����");
			System.out.println(Arrays.toString(arr));

			/*//��2��
					insertVal = arr[2];
			insertIndex = 2 - 1;
			
			while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
				arr[insertIndex + 1] = arr[insertIndex];
				insertIndex--;
			}
			arr[insertIndex + 1] = insertVal;
			System.out.println("�ڶ��ֲ����");
			System.out.println(Arrays.toString(arr));
			
			//��3��
			insertVal = arr[3];
			insertIndex = 3 - 1;
			
			while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
				arr[insertIndex + 1] = arr[insertIndex];
				insertIndex--;
			}
			arr[insertIndex + 1] = insertVal;
			System.out.println("�����ֲ����");
			System.out.println(Arrays.toString(arr));
			}*/
		}
	}
}
