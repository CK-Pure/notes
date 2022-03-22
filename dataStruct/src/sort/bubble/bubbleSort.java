package sort.bubble;

public class bubbleSort {
    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }

    public int[] sortArray(int [] nums){
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j <len ; j++) {
                if (nums[i]>nums[j]){
                    swap(nums,i,j);
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {

        bubbleSort bubbleSort = new bubbleSort();
        int []nums ={3,7,2,1,11,4};
        nums = bubbleSort.sortArray(nums);
        for (int s :nums) {
            System.out.println(s);
        }
    }
}
