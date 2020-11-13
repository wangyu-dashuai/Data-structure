package sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {3, 9, -1, 10, -2};
		
		//第一趟排序 就是将最大的数排在最后,时间复杂度为O(n^2)
		int temp = 0; //临时变量
	for(int i = 0; i < arr.length - 1; i++) {
		
		for(int j =0;j <= arr.length - 1;j++) {
			//如果前面的数比后面的数大，则交换
			if(arr[j] > arr[j+1]) {
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
		
		//第二趟排序
		System.out.println("第"+(i+1)+"趟排序后的数组：");
		System.out.println(Arrays.toString(arr));
		}
	}
}	
//		for(int j =0;j <= arr.length - 1 - 1;j++) {
//			//如果前面的数比后面的数大，则交换
//			if(arr[j]>arr[j+1]) {
//				temp = arr[j];
//				arr[j] = arr[j+1];
//				arr[j+1] = temp;
//			}
//		}
//		System.out.println("第一趟排序后的数组：");
//		System.out.println(Arrays.toString(arr));
//	}

//}
