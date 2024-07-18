class Solution {
    public int findDuplicate(int[] nums) {
        /********************HashSet****************************************/
      HashSet<Integer> set = new HashSet<>();
       for(int i=0; i<nums.length; i++)
       {
           if(set.contains(nums[i]))
           {
               return nums[i];
           }
           else{
              set.add(nums[i]);
           }
       }
        return -1;
        

        /********************Array*********************/
       int count = 0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++)
        {
            if(nums[i] == nums[i+1])
            {
                return nums[i];
            }
        }
        return -1;
    }
}
