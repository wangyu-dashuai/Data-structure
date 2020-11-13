package sort;

import java.util.Arrays;

public class SelectSort {

	public static void main(String[] args) {
		// 选择排序：从arr[0]~arr[n-1]中选取最小值与arr[0]进行交换，以此类推 得到一个从小到大排列的有序序列
		int arr[] = { 101, 22, 1, 45, 80, 60, 10 };
		System.out.println("排序前");
		System.out.println(Arrays.toString(arr));
		selectsort(arr);
	}

	public static void selectsort(int[] arr) {
		//时间复杂度为O(n^2)
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i; // 最小索引
			int min = arr[i];
			for (int j = i + 1; j < arr.length; j++) { //开始错误的携程int j =1
				if (min > arr[j]) { // 说明假定的min不是最小值
					min = arr[j]; // 重置min
					minIndex = j; // 重置minIndex
				}
			}
			// 将最小值放在arr[0]，即交换
			if (minIndex != i) {
				arr[minIndex] = arr[i];
				arr[i] = min;
			}

			System.out.println("第" + (i + 1) + "轮后");
			System.out.println(Arrays.toString(arr));
		}
		/*minIndex = 1; // 最小索引
		min = arr[1];
		for (int j = 1 + 1; j < arr.length; j++) { //开始错误的携程int j =1
			if (min > arr[j]) { // 说明假定的min不是最小值
				min = arr[j]; // 重置min
				minIndex = j; // 重置minIndex
			}
		}
		// 将最小值放在arr[0]，即交换
		
		arr[minIndex] = arr[1];
		arr[1] = min;
		
		
		System.out.println("第2轮后");
		System.out.println(Arrays.toString(arr)); */
	}
}
