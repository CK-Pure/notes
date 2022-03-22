package code_0001;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class solution {

    public int[] twoSumsOne(int[] nums,int target){
//         暴力解法
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }

    public int[] twoSumsTwo(int[] nums,int target){
//        哈希表
        Map<Integer,Integer> hashtable = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }
    public static void main(String[] args) {
        solution solution=new solution();
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(solution.twoSumsOne(nums, target)));
    }

}
