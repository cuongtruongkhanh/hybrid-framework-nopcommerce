package javaBasic;

public class Topic_22_Two_Sum {
	static int target = 9;
	static int[] nums = { 2, 7, 11, 15 };

	public static void main(String[] args) {
		twoSum(nums, target);
	}

	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					System.out.println("[" + i + " , " + j + "]");
					return new int[] { i, j };
				}
			}
		}
		return null;

	}

}
