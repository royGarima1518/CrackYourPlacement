class Solution {
    public int removeDuplicates(int[] nums) {
        /*HashSet and ArrayList*/
        HashSet<Integer> store = new HashSet<>();       
        ArrayList<Integer> output = new ArrayList<>();   //for duplicates

        for(int current : nums)
        {
            if(!store.contains(current))
            {
                store.add(current);
                output.add(current);
            }
        }

         for (int i = 0; i < output.size(); i++) {
            nums[i] = output.get(i);
        }

        return output.size();
    }
}

    /* array*/
    // if (nums.length == 0) {
    //             return 0;
    //         }

    //         int count = 1;
    //         int duplicates = 1;

    //         for (int i = 1; i < nums.length; i++) {
    //             if (nums[i] == nums[i - 1]) {
    //                 duplicates++;
    //             } else {
    //                 duplicates = 1;
    //             }
    //             if (duplicates < 2) {
    //                 nums[count] = nums[i];
    //                 count++;
    //             }
    //         }
    //         return count;
