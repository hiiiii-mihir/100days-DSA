//349. Intersection of Two Arrays


class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int k = 0;

        for (int i = 0; i < nums1.length; i++) {

            if (i > 0 && nums1[i] == nums1[i - 1]) {
                continue;
            }

            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    nums1[k++] = nums1[i]; 
                    break;
                }
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = nums1[i];
        }

        return result;

    }
}
