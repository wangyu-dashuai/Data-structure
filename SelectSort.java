package sort;

import java.util.Arrays;

public class SelectSort {

	public static void main(String[] args) {
		// ѡ�����򣺴�arr[0]~arr[n-1]��ѡȡ��Сֵ��arr[0]���н������Դ����� �õ�һ����С�������е���������
		int arr[] = { 101, 22, 1, 45, 80, 60, 10 };
		System.out.println("����ǰ");
		System.out.println(Arrays.toString(arr));
		selectsort(arr);
	}

	public static void selectsort(int[] arr) {
		//ʱ�临�Ӷ�ΪO(n^2)
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i; // ��С����
			int min = arr[i];
			for (int j = i + 1; j < arr.length; j++) { //��ʼ�����Я��int j =1
				if (min > arr[j]) { // ˵���ٶ���min������Сֵ
					min = arr[j]; // ����min
					minIndex = j; // ����minIndex
				}
			}
			// ����Сֵ����arr[0]��������
			if (minIndex != i) {
				arr[minIndex] = arr[i];
				arr[i] = min;
			}

			System.out.println("��" + (i + 1) + "�ֺ�");
			System.out.println(Arrays.toString(arr));
		}
		/*minIndex = 1; // ��С����
		min = arr[1];
		for (int j = 1 + 1; j < arr.length; j++) { //��ʼ�����Я��int j =1
			if (min > arr[j]) { // ˵���ٶ���min������Сֵ
				min = arr[j]; // ����min
				minIndex = j; // ����minIndex
			}
		}
		// ����Сֵ����arr[0]��������
		
		arr[minIndex] = arr[1];
		arr[1] = min;
		
		
		System.out.println("��2�ֺ�");
		System.out.println(Arrays.toString(arr)); */
	}
}
