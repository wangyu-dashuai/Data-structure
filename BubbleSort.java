package sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {3, 9, -1, 10, -2};
		
		//��һ������ ���ǽ��������������,ʱ�临�Ӷ�ΪO(n^2)
		int temp = 0; //��ʱ����
	for(int i = 0; i < arr.length - 1; i++) {
		
		for(int j =0;j <= arr.length - 1;j++) {
			//���ǰ������Ⱥ���������򽻻�
			if(arr[j] > arr[j+1]) {
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
		
		//�ڶ�������
		System.out.println("��"+(i+1)+"�����������飺");
		System.out.println(Arrays.toString(arr));
		}
	}
}	
//		for(int j =0;j <= arr.length - 1 - 1;j++) {
//			//���ǰ������Ⱥ���������򽻻�
//			if(arr[j]>arr[j+1]) {
//				temp = arr[j];
//				arr[j] = arr[j+1];
//				arr[j+1] = temp;
//			}
//		}
//		System.out.println("��һ�����������飺");
//		System.out.println(Arrays.toString(arr));
//	}

//}
