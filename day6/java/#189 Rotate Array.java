class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n; 

        int []arr = new int[nums.length];
        int j=0;

        for(int i=nums.length-k; i<nums.length; i++){
            arr[j++] = nums[i];
        }
        for(int l=0; l<nums.length-k; l++){
            arr[j++] = nums[l];
        }
        for(int i=0; i<nums.length; i++){
            nums[i] = arr[i];
        }
        
        
    }
}
