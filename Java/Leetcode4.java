
class Leetcode4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median;
        int mid;
        int[] mergedArray = new int[nums1.length + nums2.length];

        int a1 = 0;
        int a2 = 0;
        int i = 0;

        while(a1 < nums1.length && a2 < nums2.length) {
            int n1 = nums1[a1];
            int n2 = nums2[a2];

            if(n1 <= n2) {
                mergedArray[i++] = n1;
                a1++;
            }else {
                mergedArray[i++] = n2;
                a2++;
            }
        }

        while(a1 < nums1.length) {
            mergedArray[i++] = nums1[a1++];
        }

        while(a2 < nums2.length) {
            mergedArray[i++] = nums2[a2++];
        }

        mid = (mergedArray.length - 1)/2;
        median = mergedArray[mid];

        if(mergedArray.length%2 == 0) {
            median += mergedArray[mid+1];
            median /= 2;
        }

        return median;
    }
}
