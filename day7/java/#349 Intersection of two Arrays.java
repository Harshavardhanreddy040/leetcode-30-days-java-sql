class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
         
        ArrayList<Integer> list = new ArrayList<>();

        //Allows only non duplicate  values
        HashSet<Integer> h = new HashSet<>();
        for(int i=0; i<nums1.length; i++){
            h.add(nums1[i]);
        }

        //comparing the non duplicate values with array 2 values and storing common ele in the list
        for(int i=0; i<nums2.length; i++){
            if(h.contains(nums2[i])){
                list.add(nums2[i]);
                h.remove(nums2[i]);
            }
        }

        //converting list into array
        int []arr = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}
