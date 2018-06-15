package cn.com.algorithm.sort;
/**
 * 
 * @desc 
 * @author Winters
 * @date 2018年6月14日
 */
public class Sort {
	
	/**
	 *数值越大的数就越沉到下面,较小的数浮到上面
	 * 冒泡排序思想（从小到大排）：每一趟将待排序序列中最大元素移到最后，剩下的为新的待排序序列，
	 * 重复上述步骤直到排完所有元素。这只是冒泡排序的一种，当然也可以从后往前排。
	 * @param arr 无序数组
	 * @return
	 */
	public int[] bubbleSort(int[] arr) {
		int length = arr.length;
		
		int temp;
		
		//外层循环从0开始
		for(int i = 0; i < length; i++) {
			//内层循环从数组最后一个开始。并且
			for(int j = length - 1; j > i; j--) {
				//逐一比较，将最大的数放大最末尾
				//嵌套循环每执行一次，对应的最小值就跑到上方了
				if(arr[j] < arr[j - 1] ) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j]; 
					arr[j] = temp;
				}
			}
		}
		
		return arr;				
	}
	
	public static void main(String[] args) {
		Sort sort = new Sort();
		int[] arr = new int[]{-1, -2,4,5,9,2,-2};
		arr = sort.bubbleSort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
