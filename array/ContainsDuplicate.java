import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {

      
        // Arrays.sort(nums);               // solution 1
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i]==nums[i+1]){
        //        return true;
        //     }
        // }
        // return false;


        HashSet<Integer> num = new HashSet();    //solution 2

        for(int i = 0; i< nums.length;i++){
            if(num.contains(nums[i]))

            return true;

            num.add(nums[i]);

        }
        return false;
    }
    
}