class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] arr = new int[n+m];
        int i=0,j=0;
        int k=0;
        while(i<n && j<m) {
            if(nums1[i] <nums2[j]) {
                arr[k] = nums1[i];
                i++;
            } else {
                arr[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i<n) {
            arr[k] = nums1[i];
            k++;
            i++;
        }
        while(j<m) {
            arr[k] = nums2[j];
            k++;
            j++;
        }
        int l = n+m;
        for(int p=0;p<l;p++) {
            System.out.print(arr[p] + " ");
        }
        if(l%2 == 0) {
            return (arr[l/2] + arr[l/2-1])/2.0;
        } else {
            return arr[l/2];
        }
    }
}