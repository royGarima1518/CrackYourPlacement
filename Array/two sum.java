import java.util.*;
public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        /*Array */
        for(int i=0; i<nums.length-1; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    return new int[] { i, j };
                }
            }
        }
        return nums;

        
    }
}
