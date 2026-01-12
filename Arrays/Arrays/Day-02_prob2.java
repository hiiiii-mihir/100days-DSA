// Question:(GeeksforGeeks)
// Given an array arr[], check whether it is sorted
// in non-decreasing (ascending) order.
// Return true if sorted, otherwise false.

class Solution {
    public boolean isSorted(int[] arr) {
        // code here
        boolean Check  = true;
        for(int i = 1;i<arr.length; i++ ){
            
            if(arr[i]<arr[i-1]){
                Check = false;
            }
           
        }
        return Check;
    }
}
