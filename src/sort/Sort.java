package sort;

/**
 * 排序算法 1.交换排序（swap）：冒泡排序、选择排序
 * 
 * @author chenyacheng
 * @date 2019年10月9日
 */
public class Sort {

	public static void main(String[] args) {
		int[] jar = { 8, 4, 1, 3 };
		System.out.print("排序前：");
		for (int a : jar) {
			System.out.print(a + "  ");
		}
		bubbleSort(jar);
		System.out.println("");
		System.out.print("排序后：");
		for (int a : jar) {
			System.out.print(a + "  ");
		}

	}

	/**
	 * 冒泡排序：依次比较相邻两元素，若前一元素大于后一元素则交换之，直至最后一个元素即为最大；
	 * 					然后重新从首元素开始重复同样的操作，直至倒数第二个元素即为次大元素；依次类推。
	 * 					如同水中的气泡，依次将最大或最小元素气泡浮出水面。
	 * 时间复杂度：O(N2) 
	 * 稳定性：稳定
	 * 
	 * @param numlist int型数组
	 */
	private static void bubbleSort(int[] numlist) {
		int n = numlist.length;
		// 是否已经提前完成排序
		boolean hasSorted = false;
		for (int i = 0; i < n - 1 && !hasSorted; ++i) {
			hasSorted = true;
			for (int j = 0; j < n - 1 - i; ++j) {
				if (numlist[j] > numlist[j + 1]) {
					int tmp = numlist[j];
					numlist[j] = numlist[j + 1];
					numlist[j + 1] = tmp;
					hasSorted = false;
				}
			}
		}
	}
}
