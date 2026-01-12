// Remove Duplicates from Sorted Array (LeetCode – 26)
// Question:
// Given a sorted integer array nums, remove the duplicates in-place
// such that each unique element appears only once.
// Return the number of unique elements.



class Solution {
    public int removeDuplicates(int[] nums) {

        if(nums.length == 0) return 0;

        int count = 1;
        for(int i = 1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
            nums[count]= nums[i];
            count++;
           
        }

       }
      return count;
    }
}
