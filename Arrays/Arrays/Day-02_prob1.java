// Question:

// Given a sorted array arr[] and a target element,
// find the number of occurrences of the target in the array.(Geeksforgeeks)

class Solution {
    int countFreq(int[] arr, int target) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }
}
