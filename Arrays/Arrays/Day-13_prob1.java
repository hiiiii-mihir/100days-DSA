//3232. Find if Digit Game Can Be Won

class Solution {
    public boolean canAliceWin(int[] nums) {
        int Single = 0;
        int Double = 0;
        

        for (int i = 0; i < nums.length; i++) {
           
            if (nums[i] < 10) {
                Single += nums[i];
            } else {
                Double += nums[i];
            }
        }
         if (Single != Double) {
            return true;
        }
        return false;
    }
}
